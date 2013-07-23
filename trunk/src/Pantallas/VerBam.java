package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.Rectangle;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;

import Base.metodosSql;
import javax.swing.JTextField;
import javax.swing.JTable.PrintMode;

import java.awt.ComponentOrientation;
import java.awt.print.PrinterException;
import java.text.MessageFormat;

@SuppressWarnings("unused")
public class VerBam extends JPanel {

	private static final long serialVersionUID = 1L;
	private JScrollPane jScrollPaneBam = null;
	private JTable jTableBam = null;
	private JLabel jLabelBam = null;
	private JButton jButtonGral = null;
	private JButton jButtonConChipAsoc = null;
	private JButton jButtonSinChip = null;
	private JButton jButtonEnStock = null;
	private JButton jButtonImprimir = null;
	private JLabel jLabelFilas = null;
	private JTextField jTextFieldFilas = null;
	/**
	 * This is the default constructor
	 */
	public VerBam() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelFilas = new JLabel();
		jLabelFilas.setBounds(new Rectangle(66, 6, 101, 22));
		jLabelFilas.setText("Cantidad de filas");
		jLabelBam = new JLabel();
		jLabelBam.setBounds(new Rectangle(428, 6, 256, 22));
		jLabelBam.setText("Consulta de Banda Ancha Móvil");
		this.setSize(998, 318);
		this.setLayout(null);
		this.add(getJScrollPaneBam(), null);
		this.add(jLabelBam, null);
		this.add(getJButtonGral(), null);
		this.add(getJButtonConChipAsoc(), null);
		this.add(getJButtonSinChip(), null);
		this.add(getJButtonEnStock(), null);
		this.add(getJButtonImprimir(), null);
		this.add(jLabelFilas, null);
		this.add(getJTextFieldFilas(), null);
	}

	/**
	 * This method initializes jScrollPaneBam	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneBam() {
		if (jScrollPaneBam == null) {
			jScrollPaneBam = new JScrollPane();
			jScrollPaneBam.setBounds(new Rectangle(4, 34, 991, 229));
			jScrollPaneBam.setViewportView(getJTableBam());
		}
		return jScrollPaneBam;
	}

	/**
	 * This method initializes jTableBam	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableBam() {
		if (jTableBam == null) {
			jTableBam = new JTable();
		}
		return jTableBam;
	}

	/**
	 * This method initializes jButtonGral	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonGral() {
		if (jButtonGral == null) {
			jButtonGral = new JButton();
			jButtonGral.setBounds(new Rectangle(90, 270, 136, 37));
			jButtonGral.setText("Consulta Gral");
			jButtonGral.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String query="select * from registrodebam";
					
					metodos.llenarJtable(jTableBam, query);
					jTextFieldFilas.setText(String.valueOf(jTableBam.getRowCount()));
					
				}
			});
		}
		return jButtonGral;
	}

	/**
	 * This method initializes jButtonConChipAsoc	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonConChipAsoc() {
		if (jButtonConChipAsoc == null) {
			jButtonConChipAsoc = new JButton();
			jButtonConChipAsoc.setBounds(new Rectangle(316, 270, 136, 37));
			jButtonConChipAsoc.setText("Con Chip Asoc");
			jButtonConChipAsoc.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String query="SELECT b.locacion,b.solicitante,b.chipnro,c.nrotelefono,c.marca,b.imei " +
							" FROM furlong.registrodebam b,furlong.chip c where b.chipnro=c.serial;";
					
					metodos.llenarJtable(jTableBam, query);
					jTextFieldFilas.setText(String.valueOf(jTableBam.getRowCount()));
				}
			});
		}
		return jButtonConChipAsoc;
	}

	/**
	 * This method initializes jButtonSinChip	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSinChip() {
		if (jButtonSinChip == null) {
			jButtonSinChip = new JButton();
			jButtonSinChip.setBounds(new Rectangle(542, 270, 136, 37));
			jButtonSinChip.setText("Sin chip");
			jButtonSinChip.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String query="SELECT * from registrodebam where chipnro is null;";
					
					metodos.llenarJtable(jTableBam, query);
					jTextFieldFilas.setText(String.valueOf(jTableBam.getRowCount()));
				}
			
					
				
			});
		}
		return jButtonSinChip;
	}

	/**
	 * This method initializes jButtonEnStock	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonEnStock() {
		if (jButtonEnStock == null) {
			jButtonEnStock = new JButton();
			jButtonEnStock.setBounds(new Rectangle(768, 270, 136, 37));
			jButtonEnStock.setText("En Stock");
			jButtonEnStock.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String query="SELECT * from registrodebam where locacion= 'computos';";
					
					metodos.llenarJtable(jTableBam, query);
					jTextFieldFilas.setText(String.valueOf(jTableBam.getRowCount()));
				
				}
			});
		}
		return jButtonEnStock;
	}

	/**
	 * This method initializes jButtonImprimir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonImprimir() {
		if (jButtonImprimir == null) {
			jButtonImprimir = new JButton();
			jButtonImprimir.setBounds(new Rectangle(750, 6, 181, 22));
			jButtonImprimir.setText("Imprimir");
			jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String titulo;
					titulo=JOptionPane.showInputDialog("Ingrese título del informe");
					if(titulo!=null){
					MessageFormat headerFormat = new MessageFormat(titulo+" al "+metodos.dameFechaDeHoy());
		                     MessageFormat footerFormat = new MessageFormat("- Página {0} -");
		                     try {
								jTableBam.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
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

	/**
	 * This method initializes jTextFieldFilas	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFilas() {
		if (jTextFieldFilas == null) {
			jTextFieldFilas = new JTextField();
			jTextFieldFilas.setBounds(new Rectangle(233, 6, 129, 22));
			jTextFieldFilas.setEditable(false);
			jTextFieldFilas.setComponentOrientation(ComponentOrientation.UNKNOWN);
		}
		return jTextFieldFilas;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
