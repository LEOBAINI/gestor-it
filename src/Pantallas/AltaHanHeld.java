package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import Base.metodosSql;

import java.awt.Choice;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class AltaHanHeld extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelAltaHheld = null;
	private JLabel jLabelFotohheld = null;
	private JLabel jLabelMarca = null;
	private JLabel jLabelModelo = null;
	private JLabel jLabelNroSerie = null;
	private JLabel jLabelChapa = null;
	private JCheckBox jCheckBoxDual = null;
	private JLabel jLabelEsDual = null;
	private JTextField jTextFieldMarca = null;
	private JTextField jTextFieldModelo = null;
	private JTextField jTextFieldNroSerie = null;
	private JTextField jTextFieldChapa = null;
	private JButton jButtonDarAltaHheld = null;
	private Choice choiceChip = null;
	private JLabel jLabelChip = null;
	private JButton jButtonAyuda = null;
	/**
	 * This is the default constructor
	 */
	public AltaHanHeld() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelChip = new JLabel();
		jLabelChip.setBounds(new Rectangle(227, 87, 181, 23));
		jLabelChip.setText("Chip nro");
		jLabelEsDual = new JLabel();
		jLabelEsDual.setBounds(new Rectangle(254, 63, 60, 17));
		jLabelEsDual.setText("Es dual?");
		jLabelChapa = new JLabel();
		jLabelChapa.setBounds(new Rectangle(25, 229, 139, 23));
		jLabelChapa.setText("Chapa nro");
		jLabelNroSerie = new JLabel();
		jLabelNroSerie.setBounds(new Rectangle(25, 157, 139, 23));
		jLabelNroSerie.setText("Numero de serie");
		jLabelModelo = new JLabel();
		jLabelModelo.setBounds(new Rectangle(25, 85, 139, 23));
		jLabelModelo.setText("Modelo");
		jLabelMarca = new JLabel();
		jLabelMarca.setBounds(new Rectangle(25, 13, 139, 23));
		jLabelMarca.setText("Marca");
		jLabelFotohheld = new JLabel();
		jLabelFotohheld.setBounds(new Rectangle(502, 11, 162, 291));
		jLabelFotohheld.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ep10.png")));
		jLabelFotohheld.setText("");
		jLabelAltaHheld = new JLabel();
		jLabelAltaHheld.setBounds(new Rectangle(230, 12, 181, 39));
		jLabelAltaHheld.setFont(new Font("Borg9", Font.ITALIC, 14));
		jLabelAltaHheld.setText("Alta de hand held");
		this.setSize(685, 309);
		this.setLayout(null);
		this.add(jLabelAltaHheld, null);
		this.add(jLabelFotohheld, null);
		this.add(jLabelMarca, null);
		this.add(jLabelModelo, null);
		this.add(jLabelNroSerie, null);
		this.add(jLabelChapa, null);
		this.add(getJCheckBoxDual(), null);
		this.add(jLabelEsDual, null);
		this.add(getJTextFieldMarca(), null);
		this.add(getJTextFieldModelo(), null);
		this.add(getJTextFieldNroSerie(), null);
		this.add(getJTextFieldChapa(), null);
		this.add(getJButtonDarAltaHheld(), null);
		this.add(getChoiceChip(), null);
		this.add(jLabelChip, null);
		this.add(getJButtonAyuda(), null);
	}

	/**
	 * This method initializes jCheckBoxDual	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxDual() {
		if (jCheckBoxDual == null) {
			jCheckBoxDual = new JCheckBox();
			jCheckBoxDual.setBounds(new Rectangle(358, 59, 31, 25));
		}
		return jCheckBoxDual;
	}

	/**
	 * This method initializes jTextFieldMarca	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldMarca() {
		if (jTextFieldMarca == null) {
			jTextFieldMarca = new JTextField();
			jTextFieldMarca.setBounds(new Rectangle(25, 49, 139, 23));
		}
		return jTextFieldMarca;
	}

	/**
	 * This method initializes jTextFieldModelo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldModelo() {
		if (jTextFieldModelo == null) {
			jTextFieldModelo = new JTextField();
			jTextFieldModelo.setBounds(new Rectangle(25, 121, 139, 23));
		}
		return jTextFieldModelo;
	}

	/**
	 * This method initializes jTextFieldNroSerie	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNroSerie() {
		if (jTextFieldNroSerie == null) {
			jTextFieldNroSerie = new JTextField();
			jTextFieldNroSerie.setBounds(new Rectangle(25, 193, 139, 23));
		}
		return jTextFieldNroSerie;
	}

	/**
	 * This method initializes jTextFieldChapa	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldChapa() {
		if (jTextFieldChapa == null) {
			jTextFieldChapa = new JTextField();
			jTextFieldChapa.setBounds(new Rectangle(25, 265, 139, 23));
		}
		return jTextFieldChapa;
	}

	/**
	 * This method initializes jButtonDarAltaHheld	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonDarAltaHheld() {
		if (jButtonDarAltaHheld == null) {
			jButtonDarAltaHheld = new JButton();
			jButtonDarAltaHheld.setBounds(new Rectangle(372, 226, 115, 38));
			jButtonDarAltaHheld.setText("Dar alta");
			jButtonDarAltaHheld.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int opcion=JOptionPane.showConfirmDialog(null, "Confirme", "Está seguro que desea dar el alta?", JOptionPane.YES_NO_OPTION);
					if(opcion==0){//"SI"
						
					System.out.println("Eligió si!");	
					}
					else{//"NO"
						
						System.out.println("Eligió no!");
					}
				
				}
			});
		}
		return jButtonDarAltaHheld;
	}

	/**
	 * This method initializes choiceChip	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceChip() {
		if (choiceChip == null) {
			choiceChip = new Choice();
			choiceChip.setBounds(new Rectangle(226, 121, 183, 20));
			choiceChip.add("Sin chip");
			choiceChip.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mousePressed(java.awt.event.MouseEvent e) {
					String chipsDisponibles="select serial from furlong.chip" +
							" where estado = 'EN STOCK*'";
					ArrayList<String>chips;
					metodosSql metodos=new metodosSql();
					chips=metodos.consultarUnaColumna(chipsDisponibles);
					choiceChip.removeAll();
					choiceChip.add("Sin chip");
					for(int i=0;i<chips.size();i++)
						choiceChip.add(chips.get(i));
						jButtonAyuda.setVisible(true);
				}
				
			});
		}
		return choiceChip;
	}

	/**
	 * This method initializes jButtonAyuda	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAyuda() {
		if (jButtonAyuda == null) {
			jButtonAyuda = new JButton();
			jButtonAyuda.setBounds(new Rectangle(416, 120, 80, 21));
			jButtonAyuda.setText("Ayuda");
			jButtonAyuda.setVisible(false);
			jButtonAyuda.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String numero=JOptionPane.showInputDialog(null, null, "Ingrese los 6 ultimos numeros",JOptionPane.INFORMATION_MESSAGE);
					int encontrado=0;
					if(numero!=null){
					for(int i=0;i<choiceChip.getItemCount();i++){
						if(choiceChip.getItem(i).contains(numero)){
							choiceChip.select(i);
							encontrado=1;
						}
					}if(encontrado==0){
						
							JOptionPane.showMessageDialog(null, "No existe el elemento buscado","Reintente por favor" , JOptionPane.WARNING_MESSAGE);
						
					}
					}
				}
			});
		}
		return jButtonAyuda;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
