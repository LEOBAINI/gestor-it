package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTable.PrintMode;
import javax.swing.table.DefaultTableModel;

import com.sun.xml.internal.ws.api.addressing.WSEndpointReference.Metadata;

import Base.metodosSql;

@SuppressWarnings("unused")
public class ConsultaSQL extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelConsultaSQL = null;
	private JTextArea jTextAreaConsulta = null;
	private JScrollPane jScrollPaneConsulta = null;
	private JTable jTableConsulta = null;
	private JButton jButtonEjecutar = null;
	private JScrollPane jScrollPaneTabla = null;
	private JButton jButtonImprimir = null;
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
		this.add(getJButtonImprimir(), null);
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
					metodosSql metodos=new metodosSql();
					metodos.llenarJtable(jTableConsulta, jTextAreaConsulta.getText());
				}
			});
			
		   
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

	/**
	 * This method initializes jButtonImprimir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonImprimir() {
		if (jButtonImprimir == null) {
			jButtonImprimir = new JButton();
			jButtonImprimir.setText("IMPRIMIR");
			jButtonImprimir.setBounds(new Rectangle(97, 7, 138, 22));
			jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String titulo;
					titulo=JOptionPane.showInputDialog("Ingrese título del informe");
					if(titulo!=null){
					MessageFormat headerFormat = new MessageFormat(titulo+"\n al "+metodos.dameFechaDeHoy()+" ,"+getJTableConsulta().getRowCount()+" filas.");
		                     MessageFormat footerFormat = new MessageFormat("- Página {0} -");
		                     try {
								jTableConsulta.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
							} catch (PrinterException e1) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null, "Hubo un error intente de nuevo");
								e1.printStackTrace();
							}	
				}
			}
			});
		}
		return jButtonImprimir;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
