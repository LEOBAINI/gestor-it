package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JLabel;

import Base.metodosSql;
import javax.swing.JButton;
import javax.swing.JTable.PrintMode;
import javax.swing.table.DefaultTableModel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

@SuppressWarnings("unused")
public class VerImpresoras extends JPanel {

	private static final long serialVersionUID = 1L;
	private JScrollPane jScrollPaneImpresora = null;
	private JTable jTableImpresoras = null;
	private JLabel jLabelListado = null;
	private JButton jButtoniMPRIMIR = null;
	private JButton jButtonRefresh = null;
	private JLabel jLabel = null;

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
		jLabel = new JLabel();
		jLabel.setBounds(new Rectangle(8, 24, 439, 27));
		jLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		jLabel.setBackground(Color.white);
		jLabel.setText("Haciendo click en un elemento, se puede modificar un registro.");
		jLabelListado = new JLabel();
		jLabelListado.setBounds(new Rectangle(9, 2, 199, 18));
		jLabelListado.setText("Listado de impresoras existentes ");
		this.setSize(698, 348);
		this.setLayout(null);
		this.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.white));
		this.setBackground(SystemColor.control);
		this.add(getJScrollPaneImpresora(), null);
		this.add(jLabelListado, null);
		this.add(getJButtoniMPRIMIR(), null);
		this.add(getJButtonRefresh(), null);
		this.add(jLabel, null);
	}

	/**
	 * This method initializes jScrollPaneImpresora	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneImpresora() {
		if (jScrollPaneImpresora == null) {
			jScrollPaneImpresora = new JScrollPane();
			jScrollPaneImpresora.setBounds(new Rectangle(4, 136, 687, 209));
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
			jTableImpresoras.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					/*int cantCols=jTableImpresoras.getColumnCount();
					
					for(int i=0;i<cantCols;i++){
					System.out.print(jTableImpresoras.getColumnName(i)+" ");
					System.out.print(jTableImpresoras.getValueAt(jTableImpresoras.getSelectedRow(), i)+" "); 
					}*/
					 RegistroIndividualTabla t=new RegistroIndividualTabla();
					 DefaultTableModel tmodel=new DefaultTableModel();
					 int cantCol=jTableImpresoras.getModel().getColumnCount();
					 Object[]columnas=new Object[cantCol];
					 Object[]campos=new Object[cantCol];
					 for(int i=0;i<columnas.length;i++){
						 columnas[i]=jTableImpresoras.getColumnName(i);
						 campos[i]=jTableImpresoras.getValueAt(jTableImpresoras.getSelectedRow(), i);
					 }
					 
					 tmodel.setColumnIdentifiers(columnas);
					 tmodel.addRow(campos);
					 		
					
					 t.setearTablaModel(tmodel);
					 t.setVisible(true);
					
				}
			});
			metodosSql metodos=new metodosSql();
			metodos.llenarJtable(jTableImpresoras, "select * from impresora order by ubicacion");
		}
		return jTableImpresoras;
	}
public static void refresh(){
	
	
	
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

	/**
	 * This method initializes jButtonRefresh	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonRefresh() {
		if (jButtonRefresh == null) {
			jButtonRefresh = new JButton();
			jButtonRefresh.setBounds(new Rectangle(415, 5, 145, 15));
			jButtonRefresh.setText("Refresh!");
			jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jTableImpresoras.removeAll();
					metodosSql metodos=new metodosSql();
					metodos.llenarJtable(jTableImpresoras, "select * from impresora order by ubicacion");
				}
			});
		}
		return jButtonRefresh;
	}

}  //  @jve:decl-index=0:visual-constraint="-68,-18"
