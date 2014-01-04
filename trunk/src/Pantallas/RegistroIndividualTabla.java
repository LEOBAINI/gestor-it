package Pantallas;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTable;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;

import Abm.AdministradorABM;
import Objetos.Impresora;

@SuppressWarnings("unused")
public class RegistroIndividualTabla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTable jTable = null;
	private JButton jButton = null;
	private JScrollPane jScrollPane = null;
	private JButton jButtonSalir = null;

	/**
	 * This is the default constructor
	 */
	public RegistroIndividualTabla() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(834, 140);
		this.setContentPane(getJContentPane());
		this.setTitle("Modificacion de registros");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJButton(), null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getJButtonSalir(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTable() {
		if (jTable == null) {
			jTable = new JTable();
		}
		return jTable;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(639, 72, 118, 26));
			jButton.setText("Guardar");
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String id=jTable.getValueAt(0, 0).toString();
					String marca=jTable.getValueAt(0, 1).toString();
					String modelo=jTable.getValueAt(0, 2).toString();
					String sector=jTable.getValueAt(0, 4).toString();
					String ubicacion=jTable.getValueAt(0, 3).toString();
					Impresora imp=new Impresora(id, marca, modelo);
					imp.setSector(sector);
					imp.setUbicacion(ubicacion);
					
					AdministradorABM Abm=new AdministradorABM();
					Abm.modificar(imp,"furlong", "impresora");
					//Impresora imp=new Impresora(title, title, title);
					/*int cantCols=jTable.getColumnCount();
					
					for(int i=0;i<cantCols;i++){
					System.out.print(jTable.getColumnName(i)+" ");
					System.out.print(jTable.getValueAt(0, i)+" "); 
					}*/
					dispose();
				}
				
			});
			
		}
		return jButton;
	}
	public void setearTablaModel(TableModel t){
		jTable.setModel(t);
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(5, 3, 801, 47));
			jScrollPane.setViewportView(getJTable());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jButtonSalir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSalir() {
		if (jButtonSalir == null) {
			jButtonSalir = new JButton();
			jButtonSalir.setBounds(new Rectangle(501, 72, 118, 26));
			jButtonSalir.setText("Salir");
			jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
				}
			});
		}
		return jButtonSalir;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
