package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.text.MessageFormat;

import javax.swing.JTable;

import Base.metodosSql;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable.PrintMode;

@SuppressWarnings("unused")
public class VerReparacionesVigentes extends JPanel {

	private static final long serialVersionUID = 1L;
	private JScrollPane jScrollPane = null;
	private JTable jTableRepas = null;
	private JButton jButtonHistorial = null;
	private JButton jButtonVerHistorialParticular = null;
	private JLabel jLabelQueVeo = null;
	private JButton jButtonVerActuales = null;
	private JButton jButtonRetirar = null;
	private JButton jButtonImprimir = null;

	/**
	 * This is the default constructor
	 */
	public VerReparacionesVigentes() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelQueVeo = new JLabel();
		jLabelQueVeo.setBounds(new Rectangle(15, 6, 552, 21));
		jLabelQueVeo.setText("Usted esta viendo los equipos que se encuentran en reparación actualmente");
		this.setSize(1067, 402);
		this.setLayout(null);
		this.add(getJScrollPane(), null);
		this.add(getJButtonHistorial(), null);
		this.add(getJButtonVerHistorialParticular(), null);
		this.add(jLabelQueVeo, null);
		this.add(getJButtonVerActuales(), null);
		this.add(getJButtonRetirar(), null);
		this.add(getJButtonImprimir(), null);
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(15, 32, 1049, 294));
			jScrollPane.setViewportView(getJTableRepas());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTableRepas	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableRepas() {
		if (jTableRepas == null) {
			jTableRepas = new JTable();
			metodosSql metodos=new metodosSql();
			metodos.llenarJtable(jTableRepas, "select * from reparacion;");
		}
		return jTableRepas;
	}

	/**
	 * This method initializes jButtonHistorial	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonHistorial() {
		if (jButtonHistorial == null) {
			jButtonHistorial = new JButton();
			jButtonHistorial.setBounds(new Rectangle(16, 333, 186, 25));
			jButtonHistorial.setText("Ver historial completo");
			jButtonHistorial.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					jTableRepas.removeAll();
					metodos.llenarJtable(jTableRepas, "select * from historialreparacion");
					jTableRepas.doLayout();
					jLabelQueVeo.setText("Usted está viendo las reparaciones historicas, no incluyen las actuales.");
				}
			});
		}
		return jButtonHistorial;
	}

	/**
	 * This method initializes jButtonVerHistorialParticular	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonVerHistorialParticular() {
		if (jButtonVerHistorialParticular == null) {
			jButtonVerHistorialParticular = new JButton();
			jButtonVerHistorialParticular.setBounds(new Rectangle(16, 362, 186, 23));
			jButtonVerHistorialParticular.setText("Ver historial particular");
			jButtonVerHistorialParticular
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							String serialHistorico=null;
							if(jTableRepas.getSelectedRow()==-1){
								JOptionPane.showInputDialog("Escriba o seleccione valor de una celda", serialHistorico);
							}else{
							   serialHistorico=(String) jTableRepas.getValueAt(jTableRepas.getSelectedRow(), jTableRepas.getSelectedColumn());
							}
							
							if(serialHistorico!=null){
							metodosSql metodos=new metodosSql();
							
							
							metodos.llenarJtable(jTableRepas, "select * from historialreparacion where serial= '"+serialHistorico+"';");
							jLabelQueVeo.setText("Usted está viendo el historial de reparaciones del equipo "+serialHistorico);
							try {
								this.finalize();
							} catch (Throwable e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						}
					});
		}
		return jButtonVerHistorialParticular;
	}

	/**
	 * This method initializes jButtonVerActuales	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonVerActuales() {
		if (jButtonVerActuales == null) {
			jButtonVerActuales = new JButton();
			jButtonVerActuales.setBounds(new Rectangle(211, 333, 207, 24));
			jButtonVerActuales.setText("Ver repas actuales de nuevo");
			jButtonVerActuales.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					jTableRepas.removeAll();
					metodos.llenarJtable(jTableRepas, "select * from reparacion");
					jLabelQueVeo.setText("Usted está viendo las reparaciones actuales, otra vez...");
				}
			});
		}
		return jButtonVerActuales;
	}

	/**
	 * This method initializes jButtonRetirar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonRetirar() {
		if (jButtonRetirar == null) {
			jButtonRetirar = new JButton();
			jButtonRetirar.setBounds(new Rectangle(211, 362, 208, 23));
			jButtonRetirar.setText("Retirar de reparacion");
			jButtonRetirar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int status=0;
					int fila=jTableRepas.getSelectedRow();
					if(fila==-1){
						JOptionPane.showMessageDialog(null,"Seleccione un registro");
					}else{
					int celdaValor=Integer.parseInt((String) jTableRepas.getValueAt(fila, 0));
					
					metodosSql metodos=new metodosSql();
					try {
						status=metodos.insertarOmodif("delete from reparacion where idrepa= "+celdaValor);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(status==1){
						JOptionPane.showMessageDialog(null,"Recibido, puede chequear en historial");
					}else{
						JOptionPane.showMessageDialog(null,"Error, sigue en reparación");
					}
					
				}
				}
			});
		}
		return jButtonRetirar;
	}

	/**
	 * This method initializes jButtonImprimir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonImprimir() {
		if (jButtonImprimir == null) {
			jButtonImprimir = new JButton();
			jButtonImprimir.setBounds(new Rectangle(428, 333, 182, 24));
			jButtonImprimir.setText("IMPRIMIR");
			jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String titulo;
					titulo=JOptionPane.showInputDialog("Ingrese título del informe");
					if(titulo!=null){
					MessageFormat headerFormat = new MessageFormat(titulo+" al "+metodos.dameFechaDeHoy());
		                     MessageFormat footerFormat = new MessageFormat("- Página {0} -");
		                     try {
								jTableRepas.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);//FIT_WIDTH
							} catch (PrinterException e1) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null, "Hubo un error intente de nuevo");
								e1.printStackTrace();
							}	
				}}
			});
		}
		return jButtonImprimir;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
