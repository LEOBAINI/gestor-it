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

import Base.metodosSql;
import javax.swing.JButton;
import javax.swing.JTable.PrintMode;

@SuppressWarnings("unused")
public class VerImpresoras extends JPanel {

	private static final long serialVersionUID = 1L;
	private JScrollPane jScrollPaneImpresora = null;
	private JTable jTableImpresoras = null;
	private JLabel jLabelListado = null;
	private JButton jButtoniMPRIMIR = null;

	/**
	 * This is the default constructor
	 */
	public VerImpresoras() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelListado = new JLabel();
		jLabelListado.setBounds(new Rectangle(9, 2, 199, 18));
		jLabelListado.setText("Listado de impresoras existentes ");
		this.setSize(698, 236);
		this.setLayout(null);
		this.add(getJScrollPaneImpresora(), null);
		this.add(jLabelListado, null);
		this.add(getJButtoniMPRIMIR(), null);
	}

	/**
	 * This method initializes jScrollPaneImpresora	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneImpresora() {
		if (jScrollPaneImpresora == null) {
			jScrollPaneImpresora = new JScrollPane();
			jScrollPaneImpresora.setBounds(new Rectangle(8, 23, 687, 209));
			jScrollPaneImpresora.setViewportView(getJTableImpresoras());
		}
		return jScrollPaneImpresora;
	}

	/**
	 * This method initializes jTableImpresoras	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableImpresoras() {
		if (jTableImpresoras == null) {
			jTableImpresoras = new JTable();
			metodosSql metodos=new metodosSql();
			metodos.llenarJtable(jTableImpresoras, "select * from impresora order by ubicacion");
		}
		return jTableImpresoras;
	}

	/**
	 * This method initializes jButtoniMPRIMIR	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtoniMPRIMIR() {
		if (jButtoniMPRIMIR == null) {
			jButtoniMPRIMIR = new JButton();
			jButtoniMPRIMIR.setBounds(new Rectangle(549, 5, 145, 15));
			jButtoniMPRIMIR.setText("IMPRIMIR");
			jButtoniMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					MessageFormat headerFormat = new MessageFormat("Listado de impresoras al "+metodos.dameFechaDeHoy());
		                     MessageFormat footerFormat = new MessageFormat("- Página {0} -");
		                     try {
								jTableImpresoras.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
							} catch (PrinterException e1) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null, "Hubo un error intente de nuevo");
								e1.printStackTrace();
							}
				}
			});
		}
		return jButtoniMPRIMIR;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
