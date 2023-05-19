/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;
/**
 *
 * @author
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Socio;
import vista.EdicionSocio;
import vista.GestionarSocio;
import vista.SeleccionarSocio;

/**
 *
 * @author keniobats
 */
public class Controlador {

    private static ArrayList<Socio> socios = new ArrayList<>();
    private static Socio socioAlq;

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

    public static Socio getSocioAlq() {
        return socioAlq;
    }
}