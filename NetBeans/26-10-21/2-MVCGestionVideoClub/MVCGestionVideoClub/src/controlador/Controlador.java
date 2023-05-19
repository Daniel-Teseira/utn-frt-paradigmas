/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
/**
 *
 * @author
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Alquiler;
import modelo.Empleado;
import modelo.Fecha;
import modelo.Pelicula;
import modelo.Socio;
import vista.EdicionAlquiler;
import vista.EdicionEmpleado;
import vista.EdicionPelicula;
import vista.EdicionSocio;
import vista.GestionarAlquiler;
import vista.GestionarEmpleado;
import vista.GestionarPelicula;
import vista.GestionarSocio;
import vista.SeleccionarEmpleado;
import vista.SeleccionarPelicula;
import vista.SeleccionarSocio;

/**
 *
 * @author keniobats
 */
public class Controlador {

    private static ArrayList<Socio> socios = new ArrayList<>();
    private static ArrayList<Pelicula> peliculas = new ArrayList<>();
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static ArrayList<Alquiler> alquileres = new ArrayList<>();
    private static Socio socioAlq;
    private static Empleado empleadoAlq;
    private static ArrayList<Pelicula> peliculasAlq;

    public static void agregarEmpleado(GestionarEmpleado vista) {
        System.out.println("AGREGANDO EMPLEADOS...");
        EdicionEmpleado edicion = new EdicionEmpleado(vista, true);
        boolean flag = false;
        do {
            flag = false;
            edicion.setVisible(true);
            if (edicion.getReturnStatus() == 1) {
                int codigo = 0;
                try {
                    codigo = Integer.valueOf(edicion.getTxtLegajo().getText());
                    Empleado empleado = buscarEmpleado(codigo);
                    if (empleado == null) {
                        empleado = new Empleado();
                        empleado.setLegajo(Integer.parseInt(edicion.getTxtLegajo().getText()));
                        empleado.setDni(Integer.parseInt(edicion.getTxtDni().getText()));
                        empleado.setNombre(edicion.getTxtNombre().getText());
                        empleado.setNombreUsuario(edicion.getTxtUsuario().getText());
                        empleado.setClaveAcceso(edicion.getPassword().getText());
                        empleados.add(empleado);
                        actualizarModeloEmpleado(vista);
                        System.out.println(empleados);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Valores mal ingresados", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
                    flag = true;
                }
            }
        } while (flag);
    }

    public static void modificarEmpleado(GestionarEmpleado vista) {
        int idx = vista.getTblEmpleados().getSelectedRow();
        if (idx > -1) {
            EdicionEmpleado edicion = new EdicionEmpleado(vista, true);
            edicion.getTxtLegajo().setText(vista.getTblEmpleados().getModel().getValueAt(idx, 0).toString());
            edicion.getTxtDni().setText(vista.getTblEmpleados().getModel().getValueAt(idx, 1).toString());
            edicion.getTxtNombre().setText(vista.getTblEmpleados().getModel().getValueAt(idx, 2).toString());
            edicion.getTxtUsuario().setText(vista.getTblEmpleados().getModel().getValueAt(idx, 3).toString());
            edicion.setVisible(true);
            if (edicion.getReturnStatus() == 1) {
                Empleado empleado = new Empleado();
                empleado.setDni(Integer.parseInt(edicion.getTxtNombre().getText()));
                empleado.setLegajo(Integer.parseInt(edicion.getTxtLegajo().getText()));
                empleado.setNombre(edicion.getTxtNombre().getText());
                empleado.setNombreUsuario(edicion.getTxtUsuario().getText());
                empleado.setClaveAcceso(edicion.getPassword().getText());
                empleados.remove(idx);
                empleados.add(empleado);
                actualizarModeloEmpleado(vista);
                System.out.println(empleados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No seleccionó ningún empleado", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void eliminarEmpleado(GestionarEmpleado vista) {
        int idx = vista.getTblEmpleados().getSelectedRow();
        if (idx > -1) {
            int op = JOptionPane.showConfirmDialog(null, "Desea borrar?", "Mensaje de confirmación", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                int codigo = Integer.parseInt(vista.getTblEmpleados().getModel().getValueAt(idx, 0).toString());
                Empleado empleado = buscarEmpleado(codigo);
                if (empleado != null) {
                    empleados.remove(idx);
                    actualizarModeloEmpleado(vista);
                    System.out.println(empleados);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un empleado", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void agregarSocio(GestionarSocio vista) {
        System.out.println("AGREGANDO SOCIOS...");
        EdicionSocio edicion = new EdicionSocio(vista, true);
        boolean flag = false;
        do {
            flag = false;
            edicion.setVisible(true);
            if (edicion.getReturnStatus() == 1) {
                int codigo = 0;
                try {
                    codigo = Integer.valueOf(edicion.getTxtNro().getText());
                    Socio socio = buscarSocio(codigo);
                    if (socio == null) {
                        socio = new Socio();
                        socio.setDni(Integer.parseInt(edicion.getTxtDni().getText()));
                        socio.setNombre(edicion.getTxtNombre().getText());
                        socio.setNroCredencial(Integer.parseInt(edicion.getTxtNro().getText()));
                        socios.add(socio);
                        actualizarModeloSocio(vista);
                        System.out.println(socios);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Valores mal ingresados", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
                    flag = true;
                }
            }
        } while (flag);

    }

    public static void modificarSocio(GestionarSocio vista) {
        System.out.println("MODIFICANDO SOCIO...");
        int idx = vista.getTblSocios().getSelectedRow();
        if (idx > -1) {
            EdicionSocio edicion = new EdicionSocio(vista, true);
            edicion.getTxtNro().setText(vista.getTblSocios().getModel().getValueAt(idx, 0).toString());
            edicion.getTxtDni().setText(vista.getTblSocios().getModel().getValueAt(idx, 1).toString());
            edicion.getTxtNombre().setText(vista.getTblSocios().getModel().getValueAt(idx, 2).toString());
            edicion.setVisible(true);
            if (edicion.getReturnStatus() == 1) {
                Socio socio = new Socio();
                socio.setNroCredencial(Integer.parseInt(edicion.getTxtNro().getText()));
                socio.setDni(Integer.parseInt(edicion.getTxtDni().getText()));
                socio.setNombre(edicion.getTxtNombre().getText());
                socios.remove(idx);
                socios.add(socio);
                actualizarModeloSocio(vista);
                System.out.println(socios);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No selecciona ningun socio", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void eliminarSocio(GestionarSocio vista) {
        int idx = vista.getTblSocios().getSelectedRow();
        if (idx > -1) {
            int op = JOptionPane.showConfirmDialog(null, "Desea borrar?", "Mensaje de Confirmación", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                int codigo = Integer.parseInt(vista.getTblSocios().getModel().getValueAt(idx, 0).toString());
                Socio socio = buscarSocio(codigo);
                if (socio != null) {
                    socios.remove(idx);
                    actualizarModeloSocio(vista);
                    System.out.println(socios);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un socio", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void agregarPelicula(GestionarPelicula vista) {
        System.out.println("AGREGANDO PELICULAS...");
        EdicionPelicula edicion = new EdicionPelicula(vista, true);
        boolean flag = false;
        do {
            flag = false;
            edicion.setVisible(true);
            if (edicion.getReturnStatus() == 1) {
                int codigo = 0;
                try {
                    codigo = Integer.parseInt(edicion.getTxtCodigo().getText());
                    Pelicula pelicula = buscarPelicula(codigo);
                    if (pelicula == null) {
                        pelicula = new Pelicula();
                        pelicula.setCodigo(Integer.parseInt(edicion.getTxtCodigo().getText()));
                        pelicula.setNombre(edicion.getTxtNombre().getText());
                        pelicula.setPrecio(Float.parseFloat(edicion.getTxtPrecio().getText()));
                        peliculas.add(pelicula);
                        actualizarModeloPelicula(vista);
                        System.out.println(peliculas);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Valores mal ingresados", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
                    flag = true;
                }
            }
        } while (flag);
    }

    public static void modificarPelicula(GestionarPelicula vista) {
        int idx = vista.getTblPeliculas().getSelectedRow();
        if (idx > -1) {
            EdicionPelicula edicion = new EdicionPelicula(vista, true);
            edicion.getTxtCodigo().setText(vista.getTblPeliculas().getModel().getValueAt(idx, 0).toString());
            edicion.getTxtNombre().setText(vista.getTblPeliculas().getModel().getValueAt(idx, 1).toString());
            edicion.getTxtPrecio().setText(vista.getTblPeliculas().getModel().getValueAt(idx, 2).toString());
            edicion.setVisible(true);
            if (edicion.getReturnStatus() == 1) {
                Pelicula pelicula = new Pelicula();
                pelicula.setCodigo(Integer.parseInt(edicion.getTxtCodigo().getText()));
                pelicula.setNombre(edicion.getTxtNombre().getText());
                pelicula.setPrecio(Float.parseFloat(edicion.getTxtPrecio().getText()));
                peliculas.remove(idx);
                peliculas.add(pelicula);
                actualizarModeloPelicula(vista);
                System.out.println(peliculas);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No seleccionó ninguna pelicula", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void eliminarPelicula(GestionarPelicula vista) {
        int idx = vista.getTblPeliculas().getSelectedRow();
        if (idx > -1) {
            int op = JOptionPane.showConfirmDialog(null, "Desea borrar?", "Mensaje de confirmación", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                int codigo = Integer.parseInt(vista.getTblPeliculas().getModel().getValueAt(idx, 0).toString());
                Pelicula pelicula = buscarPelicula(codigo);
                if (pelicula != null) {
                    peliculas.remove(idx);
                    actualizarModeloPelicula(vista);
                    System.out.println(peliculas);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una película", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void agregarAlquiler(GestionarAlquiler vista) {
        System.out.println("AGREGANDO ALQUILER...");
        peliculasAlq = new ArrayList<>();
        EdicionAlquiler edicion = new EdicionAlquiler(vista, true);
        boolean flag = false;
        do {
            flag = false;
            edicion.getTxtDiad().setText("0");
            edicion.getTxtMesd().setText("0");
            edicion.getTxtAñod().setText("0");
            edicion.setVisible(true);
            if (edicion.getReturnStatus() == 1) {
                int codigo = 0;
                try {
                    Alquiler alquiler = new Alquiler();
                    if (socioAlq != null) {
                        alquiler.setSocio(getSocioAlq());
                    }
                    if (empleadoAlq != null) {
                        alquiler.setEmpleado(getEmpleadoAlq());
                    }
                    alquiler.setmPelicula(peliculasAlq);

                    int da = Integer.parseInt(edicion.getTxtDiaa().getText());
                    int ma = Integer.parseInt(edicion.getTxtMesa().getText());
                    int aa = Integer.parseInt(edicion.getTxtAñoa().getText());
                    if (da != 0 && ma != 0 && aa != 0) {
                        Fecha fa = new Fecha(da, ma, aa);
                        alquiler.setFechaAlquiler(fa);
                    }
                    int dd = Integer.parseInt(edicion.getTxtDiad().getText());
                    int md = Integer.parseInt(edicion.getTxtMesd().getText());
                    int ad = Integer.parseInt(edicion.getTxtAñod().getText());
                    Fecha fd = new Fecha(dd, md, ad);
                    alquiler.setFechaDevolucion(fd);
                    alquileres.add(alquiler);
                    actualizarModeloAlquiler(vista);
                    System.out.println(alquiler);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Valores mal ingresados", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
                    flag = true;
                }
            }
        } while (flag);
    }

    public static void modificarAlquiler(GestionarAlquiler vista) {
        int idx = vista.getTblAlquiler().getSelectedRow();
        if (idx > -1) {
            EdicionAlquiler edicion = new EdicionAlquiler(vista, true);
            Alquiler alquiler = buscarAlquiler(Integer.parseInt(vista.getTblAlquiler().getModel().getValueAt(idx, 0).toString()));
            edicion.getTxtSocio().setText(vista.getTblAlquiler().getModel().getValueAt(idx, 0).toString());
            edicion.getTxtEmpleado().setText(vista.getTblAlquiler().getModel().getValueAt(idx, 1).toString());
            edicion.getTxtDiaa().setText(vista.getTblAlquiler().getModel().getValueAt(idx, 3).toString());
            edicion.getTxtMesa().setText(vista.getTblAlquiler().getModel().getValueAt(idx, 4).toString());
            edicion.getTxtAñoa().setText(vista.getTblAlquiler().getModel().getValueAt(idx, 5).toString());
            edicion.getTxtDiad().setText(vista.getTblAlquiler().getModel().getValueAt(idx, 6).toString());
            edicion.getTxtMesd().setText(vista.getTblAlquiler().getModel().getValueAt(idx, 7).toString());
            edicion.getTxtAñod().setText(vista.getTblAlquiler().getModel().getValueAt(idx, 8).toString());

            dePeliculasaTabla(edicion, alquiler.getmPelicula());
            edicion.setVisible(true);
            if (edicion.getReturnStatus() == 1) {
                alquiler = new Alquiler();
                if (socioAlq != null) {
                    alquiler.setSocio(getSocioAlq());
                }
                if (empleadoAlq != null) {
                    alquiler.setEmpleado(getEmpleadoAlq());
                }
                alquiler.setmPelicula(peliculasAlq);
                int da = Integer.parseInt(edicion.getTxtDiaa().getText());
                int ma = Integer.parseInt(edicion.getTxtMesa().getText());
                int aa = Integer.parseInt(edicion.getTxtAñoa().getText());
                if (da != 0 && ma != 0 && aa != 0) {
                    Fecha fa = new Fecha(da, ma, aa);
                    alquiler.setFechaAlquiler(fa);
                }
                int dd = Integer.parseInt(edicion.getTxtDiad().getText());
                int md = Integer.parseInt(edicion.getTxtMesd().getText());
                int ad = Integer.parseInt(edicion.getTxtAñod().getText());
                Fecha fd = new Fecha(dd, md, ad);
                alquiler.setFechaDevolucion(fd);
                alquileres.remove(idx);
                alquileres.add(alquiler);
                actualizarModeloAlquiler(vista);
                System.out.println(alquiler);
            }

        } else {
            JOptionPane.showMessageDialog(null, "No seleccionó ningún alquiler", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void eliminarAlquiler(GestionarAlquiler vista) {
        int idx = vista.getTblAlquiler().getSelectedRow();
        if (idx > -1) {
            int op = JOptionPane.showConfirmDialog(null, "Desea borrar?", "Mensaje de confirmación", JOptionPane.YES_NO_OPTION);
            if (op == 0) {
                int codigo = Integer.parseInt(vista.getTblAlquiler().getModel().getValueAt(idx, 0).toString());
                Alquiler alquiler = buscarAlquiler(codigo);
                if (alquiler != null) {
                    alquileres.remove(idx);
                    actualizarModeloAlquiler(vista);
                    System.out.println(alquileres);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un alquiler", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void dePeliculasaTabla(EdicionAlquiler vista, ArrayList<Pelicula> peliculas) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        for (Pelicula pelicula : peliculas) {
            Object[] fila = new Object[3];
            fila[0] = pelicula.getCodigo();
            fila[1] = pelicula.getNombre();
            fila[2] = pelicula.getPrecio();
            modelo.addRow(fila);
        }
        vista.getTblPeliculas().setModel(modelo);
    }

    private static Socio buscarSocio(int codigo) {
        Socio auxSoc = null;
        for (Socio soc : socios) {
            if (soc.getNroCredencial() == codigo) {
                auxSoc = soc;
                break;
            }
        }
        return auxSoc;
    }

    private static Empleado buscarEmpleado(int codigo) {
        Empleado auxEmp = null;
        for (Empleado emp : empleados) {
            if (emp.getLegajo() == codigo) {
                auxEmp = emp;
                break;
            }
        }
        return auxEmp;
    }

    private static Pelicula buscarPelicula(int codigo) {
        Pelicula auxPel = null;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getCodigo() == codigo) {
                auxPel = pelicula;
                break;
            }
        }
        return auxPel;
    }

    private static Alquiler buscarAlquiler(int codigo) {
        Alquiler auxAlq = null;
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getSocio().getNroCredencial() == codigo) {
                auxAlq = alquiler;
                break;
            }
        }
        return auxAlq;
    }

    public static void actualizarModeloSocio(GestionarSocio vista) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Nro. de Credencial");
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        for (Socio socio : socios) {
            Object[] fila = new Object[3];
            fila[0] = socio.getNroCredencial();
            fila[1] = socio.getDni();
            fila[2] = socio.getNombre();
            modelo.addRow(fila);
        }
        vista.getTblSocios().setModel(modelo);
    }

    public static void actualizarModeloSocio(SeleccionarSocio vista) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Nro. de Credencial");
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        for (Socio socio : socios) {
            Object[] fila = new Object[3];
            fila[0] = socio.getNroCredencial();
            fila[1] = socio.getDni();
            fila[2] = socio.getNombre();
            modelo.addRow(fila);
        }
        vista.getTblSocios().setModel(modelo);
    }

    public static void actualizarModeloEmpleado(GestionarEmpleado vista) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Legajo");
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nomber de Usuario");
        for (Empleado empleado : empleados) {
            Object[] fila = new Object[4];
            fila[0] = empleado.getLegajo();
            fila[1] = empleado.getDni();
            fila[2] = empleado.getNombre();
            fila[3] = empleado.getNombreUsuario();
            modelo.addRow(fila);
        }
        vista.getTblEmpleados().setModel(modelo);
    }

    public static void actualizarModeloEmpleado(SeleccionarEmpleado vista) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Legajo");
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nomber de Usuario");
        for (Empleado empleado : empleados) {
            Object[] fila = new Object[4];
            fila[0] = empleado.getLegajo();
            fila[1] = empleado.getDni();
            fila[2] = empleado.getNombre();
            fila[3] = empleado.getNombreUsuario();
            modelo.addRow(fila);
        }
        vista.getTblEmpleados().setModel(modelo);
    }

    public static void actualizarModeloPelicula(GestionarPelicula vista) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        for (Pelicula pelicula : peliculas) {
            Object[] fila = new Object[3];
            fila[0] = pelicula.getCodigo();
            fila[1] = pelicula.getNombre();
            fila[2] = pelicula.getPrecio();
            modelo.addRow(fila);
        }
        vista.getTblPeliculas().setModel(modelo);
    }

    public static void actualizarModeloPelicula(SeleccionarPelicula vista) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        for (Pelicula pelicula : peliculas) {
            Object[] fila = new Object[3];
            fila[0] = pelicula.getCodigo();
            fila[1] = pelicula.getNombre();
            fila[2] = pelicula.getPrecio();
            modelo.addRow(fila);
        }
        vista.getTblPeliculas().setModel(modelo);
    }

    public static void actualizarModeloAlquiler(GestionarAlquiler vista) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Socio");
        modelo.addColumn("Empleado");
        modelo.addColumn("Cant. de Pelicula");
        modelo.addColumn("DiaA");
        modelo.addColumn("MesA");
        modelo.addColumn("AñoA");
        modelo.addColumn("DiaD");
        modelo.addColumn("MesD");
        modelo.addColumn("AñoD");
        for (Alquiler alquiler : alquileres) {
            Object[] fila = new Object[9];
            fila[0] = alquiler.getSocio().getNroCredencial();
            fila[1] = alquiler.getEmpleado().getLegajo();
            fila[2] = alquiler.getmPelicula().size();
            fila[3] = alquiler.getFechaAlquiler().getDia();
            fila[4] = alquiler.getFechaAlquiler().getMes();
            fila[5] = alquiler.getFechaAlquiler().getAnio();
            fila[6] = alquiler.getFechaDevolucion().getDia();
            fila[7] = alquiler.getFechaDevolucion().getMes();
            fila[8] = alquiler.getFechaDevolucion().getAnio();
            modelo.addRow(fila);
        }
        vista.getTblAlquiler().setModel(modelo);
    }

    public static void agregarSocioAlquiler(EdicionAlquiler vista) {
        SeleccionarSocio selecSocio = new SeleccionarSocio(vista, true);
        actualizarModeloSocio(selecSocio);
        selecSocio.setVisible(true);
        int idx = selecSocio.getTblSocios().getSelectedRow();
        if (selecSocio.getReturnStatus() == 1) {
            if (idx > -1) {
                vista.getTxtSocio().setText(selecSocio.getTblSocios().getModel().getValueAt(idx, 2).toString());
                int codigo = Integer.parseInt(selecSocio.getTblSocios().getModel().getValueAt(idx, 0).toString());
                socioAlq = buscarSocio(codigo);
            }
        }
    }

    public static void agregarEmpleadoAlquiler(EdicionAlquiler vista) {
        SeleccionarEmpleado selecEmpleado = new SeleccionarEmpleado(vista, true);
        actualizarModeloEmpleado(selecEmpleado);
        selecEmpleado.setVisible(true);
        int idx = selecEmpleado.getTblEmpleados().getSelectedRow();
        if (selecEmpleado.getReturnStatus() == 1) {
            if (idx > -1) {
                vista.getTxtEmpleado().setText(selecEmpleado.getTblEmpleados().getModel().getValueAt(idx, 2).toString());
                int codigo = Integer.parseInt(selecEmpleado.getTblEmpleados().getModel().getValueAt(idx, 0).toString());
                empleadoAlq = buscarEmpleado(codigo);
            }
        }
    }

    public static void agregarPeliculaAlquiler(EdicionAlquiler vista) {
        SeleccionarPelicula selecPelicula = new SeleccionarPelicula(vista, true);
        actualizarModeloPelicula(selecPelicula);
        selecPelicula.setVisible(true);
        int idx = selecPelicula.getTblPeliculas().getSelectedRow();
        if (idx > -1) {
            int codigo = Integer.parseInt(selecPelicula.getTblPeliculas().getModel().getValueAt(idx, 0).toString());
            Pelicula pelicula = buscarPelicula(codigo);
            peliculasAlq.add(pelicula);
            actualizarModeloPeliculasAlq(vista);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una pelicula", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void actualizarModeloPeliculasAlq(EdicionAlquiler vista) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        for (Pelicula pelicula : peliculasAlq) {
            Object[] fila = new Object[3];
            fila[0] = pelicula.getCodigo();
            fila[1] = pelicula.getNombre();
            fila[2] = pelicula.getPrecio();
            modelo.addRow(fila);
        }
        vista.getTblPeliculas().setModel(modelo);
    }

    public static Socio getSocioAlq() {
        return socioAlq;
    }

    public static Empleado getEmpleadoAlq() {
        return empleadoAlq;
    }

    public static ArrayList<Pelicula> getPeliculasAlq() {
        return peliculasAlq;
    }
}