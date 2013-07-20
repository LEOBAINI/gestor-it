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

import Base.metodosSql;
import javax.swing.JTextField;
import javax.swing.JTable.PrintMode;

@SuppressWarnings("unused")
public class VerHandHelds extends JPanel {

	private static final long serialVersionUID = 1L;
	private String ordenTabla="order by SECTOR_ASIGNADO";  //  @jve:decl-index=0:
	private JScrollPane jScrollPaneHand = null;
	private JTable jTableHandHelds = null;
	private JLabel jLabelHand = null;
	private JButton jButtonImprimir = null;
	private JButton jButtonConsultaGral = null;
	private JButton LasQueTienenChip = null;
	private JButton jButtonSinChip = null;
	private JButton jButtonEnStock = null;
	private JLabel jLabelFilas = null;
	private JTextField jTextFieldFilas = null;

	/**
	 * This is the default constructor
	 */
	public VerHandHelds() {
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
		jLabelFilas.setBounds(new Rectangle(532, 3, 36, 18));
		jLabelFilas.setText("Filas");
		jLabelHand = new JLabel();
		jLabelHand.setBounds(new Rectangle(4, 3, 224, 19));
		jLabelHand.setText("Inventario de hand helds");
		this.setSize(1289, 356);
		this.setLayout(null);
		this.add(getJScrollPaneHand(), null);
		this.add(jLabelHand, null);
		this.add(getJButtonImprimir(), null);
		this.add(getJButtonConsultaGral(), null);
		this.add(getLasQueTienenChip(), null);
		this.add(getJButtonSinChip(), null);
		this.add(getJButtonEnStock(), null);
		this.add(jLabelFilas, null);
		this.add(getJTextFieldFilas(), null);
	}

	/**
	 * This method initializes jScrollPaneHand	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneHand() {
		if (jScrollPaneHand == null) {
			jScrollPaneHand = new JScrollPane();
			jScrollPaneHand.setBounds(new Rectangle(5, 27, 1275, 250));
			jScrollPaneHand.setViewportView(getJTableHandHelds());
		}
		return jScrollPaneHand;
	}

	/**
	 * This method initializes jTableHandHelds	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTableHandHelds() {
		if (jTableHandHelds == null) {
			jTableHandHelds = new JTable();
		}
		return jTableHandHelds;
	}

	/**
	 * This method initializes jButtonImprimir	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonImprimir() {
		if (jButtonImprimir == null) {
			jButtonImprimir = new JButton();
			jButtonImprimir.setBounds(new Rectangle(236, 3, 152, 19));
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
								jTableHandHelds.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);
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
	 * This method initializes jButtonConsultaGral	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonConsultaGral() {
		if (jButtonConsultaGral == null) {
			jButtonConsultaGral = new JButton();
			jButtonConsultaGral.setBounds(new Rectangle(5, 282, 169, 29));
			jButtonConsultaGral.setText("Consulta Gral");
			jButtonConsultaGral.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String query="select CHAPA_NRO,SERIAL,CHIP,CHIPMARCA," +
							" MODELO,ESTADO,SECTOR_ASIGNADO,COMENTARIO,LUGAR_FISICO_REAL,ESDUAL,GARANTIA_EXTENDIDA_HASTA AS 'GTIA HASTA' " +
							"  from handheld H "+ordenTabla+";";
					System.out.println(query);
					metodos.llenarJtable(jTableHandHelds,query );
					jTextFieldFilas.setText(String.valueOf(jTableHandHelds.getRowCount()));
				}
			});
		}
		return jButtonConsultaGral;
	}

	/**
	 * This method initializes LasQueTienenChip	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getLasQueTienenChip() {
		if (LasQueTienenChip == null) {
			LasQueTienenChip = new JButton();
			LasQueTienenChip.setBounds(new Rectangle(196, 282, 166, 29));
			LasQueTienenChip.setText("Con chip asoc");
			LasQueTienenChip.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String query="SELECT c.marca,c.serial as 'serial del chip',c.nrotelefono," +
							" h.serial,h.modelo,h.sector_asignado FROM furlong.chip c,furlong.handheld h where" +
							" c.serial=h.chip "+ordenTabla;

					metodos.llenarJtable(jTableHandHelds, query);
					jTextFieldFilas.setText(String.valueOf(jTableHandHelds.getRowCount()));
				}
			});
		}
		return LasQueTienenChip;
	}

	/**
	 * This method initializes jButtonSinChip	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSinChip() {
		if (jButtonSinChip == null) {
			jButtonSinChip = new JButton();
			jButtonSinChip.setBounds(new Rectangle(384, 282, 167, 29));
			jButtonSinChip.setText("Sin Chip");
			jButtonSinChip.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String query="CHAPA_NRO,SERIAL,CHIP,CHIPMARCA," +
					" MODELO,ESTADO,SECTOR_ASIGNADO,COMENTARIO,LUGAR_FISICO_REAL,ESDUAL,GARANTIA_EXTENDIDA_HASTA AS 'GTIA HASTA'";
					metodos.llenarJtable(jTableHandHelds, "select "+query+" from handheld WHERE CHIPMARCA='SIN CHIP' "+ordenTabla);
					jTextFieldFilas.setText(String.valueOf(jTableHandHelds.getRowCount()));
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
			jButtonEnStock.setBounds(new Rectangle(573, 282, 165, 29));
			jButtonEnStock.setText("En stock");
			jButtonEnStock.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					String query="CHAPA_NRO,SERIAL,CHIP,CHIPMARCA," +
					" MODELO,ESTADO,SECTOR_ASIGNADO,COMENTARIO,LUGAR_FISICO_REAL,ESDUAL,GARANTIA_EXTENDIDA_HASTA AS 'GTIA HASTA'";
					metodos.llenarJtable(jTableHandHelds, "select "+query+" from handheld" +
							" WHERE SECTOR_ASIGNADO='SIN ASIGNAR' "+ordenTabla);
					jTextFieldFilas.setText(String.valueOf(jTableHandHelds.getRowCount()));
				}
			});
		}
		return jButtonEnStock;
	}

	/**
	 * This method initializes jTextFieldFilas	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFilas() {
		if (jTextFieldFilas == null) {
			jTextFieldFilas = new JTextField();
			jTextFieldFilas.setBounds(new Rectangle(574, 1, 89, 23));
			jTextFieldFilas.setEditable(false);
		}
		return jTextFieldFilas;
	}

}  //  @jve:decl-index=0:visual-constraint="4,11"
