package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.awt.print.PrinterException;
import java.text.MessageFormat;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable.PrintMode;

import Base.metodosSql;
import javax.swing.JTextField;

@SuppressWarnings("unused")
public class VerPcs extends JPanel {

	private static final long serialVersionUID = 1L;
	private JScrollPane jScrollPaneVerPcs = null;
	private JTable jTableVerPcs = null;
	private JLabel jLabelInventario = null;
	private JButton jButtonVer = null;
	private JButton jButtonNtb = null;
	private JButton jButtonImprimir = null;
	private JButton jButtonSoloPc = null;
	private JLabel jLabelCant = null;
	private JTextField jTextFieldFilas = null;
	private JButton jButtonTodoLovisible = null;
	private JButton jButtonTodoloInvisible = null;
	/**
	 * This is the default constructor
	 */
	public VerPcs() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelInventario = new JLabel();
		jLabelInventario.setBounds(new Rectangle(4, 4, 233, 20));
		jLabelInventario.setText("Inventario de PCs y Notebooks");
		this.setSize(1020, 331);
		this.setLayout(null);
		this.add(getJScrollPaneVerPcs(), null);
		this.add(jLabelInventario, null);
		this.add(getJButtonVer(), null);
		this.add(getJButtonNtb(), null);
		this.add(getJButtonImprimir(), null);
		this.add(getJButtonSoloPc(), null);
		this.add(getJLabelCant(), null);
		this.add(getJTextFieldFilas(), null);
		this.add(getJButtonTodoLovisible(), null);
		this.add(getJButtonTodoloInvisible(), null);
		
		
	}

	/**
	 * This method initializes jScrollPaneVerPcs	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneVerPcs() {
		if (jScrollPaneVerPcs == null) {
			jScrollPaneVerPcs = new JScrollPane();
			jScrollPaneVerPcs.setBounds(new Rectangle(4, 31, 748, 288));
			jScrollPaneVerPcs.setViewportView(getJTableVerPcs());
		}
		return jScrollPaneVerPcs;
	}

	/**
	 * This method initializes jTableVerPcs	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableVerPcs() {
		if (jTableVerPcs == null) {
			jTableVerPcs = new JTable();
			
		}
		return jTableVerPcs;
	}

	/**
	 * This method initializes jButtonVer	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonVer() {
		if (jButtonVer == null) {
			jButtonVer = new JButton();
			jButtonVer.setBounds(new Rectangle(758, 39, 232, 19));
			jButtonVer.setText("Consulta GENERAL");
			jButtonVer.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String consulta=null;
					consulta="select * from pc ";
					metodos.llenarJtable(jTableVerPcs, consulta);
					jTextFieldFilas.setText(String.valueOf(getJTableVerPcs().getRowCount()));
				}
			});
		}
		return jButtonVer;
	}

	/**
	 * This method initializes jButtonNtb	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonNtb() {
		if (jButtonNtb == null) {
			jButtonNtb = new JButton();
			jButtonNtb.setBounds(new Rectangle(758, 97, 234, 19));
			jButtonNtb.setText("Consultar sólo Notebook");
			jButtonNtb.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String consulta=null;
					consulta="select * from pc where esnotebook='SI' ";
					metodos.llenarJtable(jTableVerPcs, consulta);
					jTextFieldFilas.setText(String.valueOf(getJTableVerPcs().getRowCount()));
				}
			});
		}
		return jButtonNtb;
	}

	/**
	 * This method initializes jButtonImprimir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonImprimir() {
		if (jButtonImprimir == null) {
			jButtonImprimir = new JButton();
			jButtonImprimir.setBounds(new Rectangle(247, 4, 103, 20));
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
								jTableVerPcs.print(PrintMode.NORMAL, headerFormat, footerFormat);//FIT_WIDTH
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

	/**
	 * This method initializes jButtonSoloPc	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSoloPc() {
		if (jButtonSoloPc == null) {
			jButtonSoloPc = new JButton();
			jButtonSoloPc.setBounds(new Rectangle(758, 155, 234, 19));
			jButtonSoloPc.setText("Consultar sólo PC");
			jButtonSoloPc.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String consulta=null;
					consulta="select * from pc where esnotebook='NO' ";
					metodos.llenarJtable(jTableVerPcs, consulta);
					jTextFieldFilas.setText(String.valueOf(getJTableVerPcs().getRowCount()));				}
			});
		}
		return jButtonSoloPc;
	}

	/**
	 * This method initializes jLabelCant	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabelCant() {
		if (jLabelCant == null) {
			jLabelCant = new JLabel();
			jLabelCant.setText("Total de filas");
			jLabelCant.setBounds(new Rectangle(537, 7, 84, 19));
		}
		return jLabelCant;
	}

	/**
	 * This method initializes jTextFieldFilas	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFilas() {
		if (jTextFieldFilas == null) {
			jTextFieldFilas = new JTextField();
			jTextFieldFilas.setBounds(new Rectangle(630, 1, 98, 31));
			jTextFieldFilas.setEditable(false);
		}
		return jTextFieldFilas;
	}

	/**
	 * This method initializes jButtonTodoLovisible	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonTodoLovisible() {
		if (jButtonTodoLovisible == null) {
			jButtonTodoLovisible = new JButton();
			jButtonTodoLovisible.setBounds(new Rectangle(758, 213, 234, 19));
			jButtonTodoLovisible.setText("Consultar todo lo visible");
			jButtonTodoLovisible.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String consulta=null;
					consulta="select * from pc where esvisible='1' ";
					metodos.llenarJtable(jTableVerPcs, consulta);
					jTextFieldFilas.setText(String.valueOf(getJTableVerPcs().getRowCount()));
				}
			});
		}
		return jButtonTodoLovisible;
	}

	/**
	 * This method initializes jButtonTodoloInvisible	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonTodoloInvisible() {
		if (jButtonTodoloInvisible == null) {
			jButtonTodoloInvisible = new JButton();
			jButtonTodoloInvisible.setBounds(new Rectangle(758, 271, 232, 19));
			jButtonTodoloInvisible.setText("Consultar todo lo invisible");
			jButtonTodoloInvisible.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String consulta=null;
					consulta="select * from pc where esvisible='0' ";
					metodos.llenarJtable(jTableVerPcs, consulta);
					jTextFieldFilas.setText(String.valueOf(getJTableVerPcs().getRowCount()));
				}
			});
		}
		return jButtonTodoloInvisible;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
