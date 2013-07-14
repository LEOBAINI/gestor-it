package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import com.sun.xml.internal.ws.api.addressing.WSEndpointReference.Metadata;

import Base.metodosSql;

public class ConsultaSQL extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelConsultaSQL = null;
	private JTextArea jTextAreaConsulta = null;
	private JScrollPane jScrollPaneConsulta = null;
	private JTable jTableConsulta = null;
	private JButton jButtonEjecutar = null;
	private JScrollPane jScrollPaneTabla = null;
	/**
	 * This is the default constructor
	 */
	public ConsultaSQL() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelConsultaSQL = new JLabel();
		jLabelConsultaSQL.setBounds(new Rectangle(5, 6, 85, 23));
		jLabelConsultaSQL.setText("Consulta SQL");
		this.setSize(1100, 387);
		this.setLayout(null);
		this.add(jLabelConsultaSQL, null);
		this.add(getJScrollPaneConsulta(), null);
		this.add(getJButtonEjecutar(), null);
		this.add(getJScrollPaneTabla(), null);
	}

	/**
	 * This method initializes jTextAreaConsulta	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextAreaConsulta() {
		if (jTextAreaConsulta == null) {
			jTextAreaConsulta = new JTextArea();
		}
		return jTextAreaConsulta;
	}

	/**
	 * This method initializes jScrollPaneConsulta	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneConsulta() {
		if (jScrollPaneConsulta == null) {
			jScrollPaneConsulta = new JScrollPane();
			jScrollPaneConsulta.setBounds(new Rectangle(5, 31, 1087, 40));
			jScrollPaneConsulta.setViewportView(getJTextAreaConsulta());
		}
		return jScrollPaneConsulta;
	}

	/**
	 * This method initializes jTableConsulta	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableConsulta() {
		if (jTableConsulta == null) {
			jTableConsulta = new JTable();
		}
		return jTableConsulta;
	}

	/**
	 * This method initializes jButtonEjecutar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonEjecutar() {
		if (jButtonEjecutar == null) {
			jButtonEjecutar = new JButton();
			jButtonEjecutar.setBounds(new Rectangle(938, 3, 152, 26));
			jButtonEjecutar.setText("Ejecutar consulta");
			jButtonEjecutar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				try{
				jTableConsulta.removeAll();
				ArrayList<ArrayList<String>> fullConsulta=new ArrayList<ArrayList<String>>();
				metodosSql metodos=new metodosSql();
					
					
				String consulta=jTextAreaConsulta.getText();
				fullConsulta=metodos.consultar(consulta);
				//ResultSet res=metodos.consultarResultSet(consulta);
				
				int columnas=fullConsulta.get(0).size();
				int filas=fullConsulta.size();
				DefaultTableModel modelo = new DefaultTableModel();
				
				modelo.setColumnCount(columnas);
				modelo.setRowCount(filas);
				
				
				
				
				for(int i=0;i<filas;i++){
				
				for(int j=0;j<columnas;j++){
				
				
				
				 modelo.setValueAt(fullConsulta.get(i).get(j), i, j);
				}
				}
				modelo.setColumnIdentifiers(metodos.consultarNombresColumnas(consulta));
				
				
				
				jTableConsulta.setModel(modelo);
				}catch(Exception r){
					
				}
				}
				}
									
				
			);
		}
		return jButtonEjecutar;
	}

	/**
	 * This method initializes jScrollPaneTabla	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneTabla() {
		if (jScrollPaneTabla == null) {
			jScrollPaneTabla = new JScrollPane();
			jScrollPaneTabla.setBounds(new Rectangle(5, 73, 1090, 310));
			jScrollPaneTabla.setViewportView(getJTableConsulta());
		}
		return jScrollPaneTabla;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
