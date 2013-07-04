package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

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
		}
		return jButtonDarAltaHheld;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
