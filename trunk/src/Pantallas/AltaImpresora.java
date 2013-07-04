package Pantallas;

import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Choice;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.ImageIcon;

@SuppressWarnings("unused")
public class AltaImpresora extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelAltaImpresora = null;
	private JLabel jLabelNroSerie = null;
	private JLabel jLabelMarca = null;
	private JLabel jLabelModelo = null;
	private JTextField jTextFieldNroSerie = null;
	private JTextField jTextFieldMarca = null;
	private JTextField jTextFieldModelo = null;
	private JButton jButtonDarAlta = null;
	private JLabel Impresora = null;
	private JLabel jLabelImpresora = null;

	/**
	 * This is the default constructor
	 */
	public AltaImpresora() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
		
		
		
		
		jLabelImpresora = new JLabel();
		jLabelImpresora.setBounds(new Rectangle(377, 61, 227, 199));
		jLabelImpresora.setIcon(new ImageIcon(getClass().getResource("/Imagenes/impresora.jpg")));
		jLabelImpresora.setText("");
		jLabelModelo = new JLabel();
		jLabelModelo.setBounds(new Rectangle(21, 174, 71, 16));
		jLabelModelo.setText("Modelo");
		jLabelMarca = new JLabel();
		jLabelMarca.setBounds(new Rectangle(21, 111, 71, 24));
		jLabelMarca.setText("Marca");
		jLabelNroSerie = new JLabel();
		jLabelNroSerie.setBounds(new Rectangle(21, 45, 71, 26));
		jLabelNroSerie.setText("Nro de serie");
		jLabelAltaImpresora = new JLabel();
		jLabelAltaImpresora.setBounds(new Rectangle(176, 10, 174, 35));
		jLabelAltaImpresora.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
		jLabelAltaImpresora.setFont(new Font("Borg9", Font.ITALIC, 12));
		jLabelAltaImpresora.setText("Alta de impresoras");
		this.setSize(617, 299);
		this.setLayout(null);
		this.add(jLabelAltaImpresora, null);
		this.add(jLabelNroSerie, null);
		this.add(jLabelMarca, null);
		this.add(jLabelModelo, null);
		this.add(getJTextFieldNroSerie(), null);
		this.add(getJTextFieldMarca(), null);
		this.add(getJTextFieldModelo(), null);
		this.add(getJButtonDarAlta(), null);
		this.add(jLabelImpresora, null);
		//this.add(Impresora, null);
	}

	/**
	 * This method initializes jTextFieldNroSerie	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNroSerie() {
		if (jTextFieldNroSerie == null) {
			jTextFieldNroSerie = new JTextField();
			jTextFieldNroSerie.setBounds(new Rectangle(21, 76, 176, 21));
		}
		return jTextFieldNroSerie;
	}

	/**
	 * This method initializes jTextFieldMarca	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldMarca() {
		if (jTextFieldMarca == null) {
			jTextFieldMarca = new JTextField();
			jTextFieldMarca.setBounds(new Rectangle(21, 141, 176, 21));
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
			jTextFieldModelo.setBounds(new Rectangle(21, 199, 176, 21));
		}
		return jTextFieldModelo;
	}

	/**
	 * This method initializes jButtonDarAlta	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonDarAlta() {
		if (jButtonDarAlta == null) {
			jButtonDarAlta = new JButton();
			jButtonDarAlta.setBounds(new Rectangle(408, 270, 197, 23));
			jButtonDarAlta.setText("Dar de alta");
		}
		return jButtonDarAlta;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
