package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;

import Base.metodosSql;

@SuppressWarnings("unused")
public class VerPcs extends JPanel {

	private static final long serialVersionUID = 1L;
	private JScrollPane jScrollPaneVerPcs = null;
	private JTable jTableVerPcs = null;
	private JLabel jLabelInventario = null;
	private JButton jButtonVer = null;
	private JButton jButtonNtb = null;
	private JLabel jLabelTotalPc = null;

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
		jLabelTotalPc = new JLabel();
		jLabelTotalPc.setBounds(new Rectangle(760, 4, 116, 15));
		jLabelTotalPc.setText("JLabel");
		jLabelInventario = new JLabel();
		jLabelInventario.setBounds(new Rectangle(4, 4, 233, 20));
		jLabelInventario.setText("Inventario de PCs y Notebooks");
		this.setSize(883, 331);
		this.setLayout(null);
		this.add(getJScrollPaneVerPcs(), null);
		this.add(jLabelInventario, null);
		this.add(getJButtonVer(), null);
		this.add(getJButtonNtb(), null);
		this.add(jLabelTotalPc, null);
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
			jButtonVer.setBounds(new Rectangle(244, 3, 172, 19));
			jButtonVer.setText("Consultar PC");
			jButtonVer.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String consulta=null;
					consulta="select * from pc ";
					metodos.llenarJtable(jTableVerPcs, consulta);
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
			jButtonNtb.setBounds(new Rectangle(424, 3, 172, 19));
			jButtonNtb.setText("Consultar Notebook");
			jButtonNtb.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String consulta=null;
					consulta="select * from pc ";
					metodos.llenarJtable(jTableVerPcs, consulta);
				}
			});
		}
		return jButtonNtb;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
