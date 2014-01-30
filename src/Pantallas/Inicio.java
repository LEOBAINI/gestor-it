package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

@SuppressWarnings("unused")
public class Inicio extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelGestorIT = null;

	/**
	 * This is the default constructor
	 */
	public Inicio() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelGestorIT = new JLabel();
		jLabelGestorIT.setBounds(new Rectangle(476, 219, 317, 229));
		jLabelGestorIT.setFont(new Font("Dialog", Font.BOLD, 12));
		jLabelGestorIT.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Logo.jpg")));
		jLabelGestorIT.setText("");
		this.setSize(1404, 680);
		this.setLayout(null);
		this.setBackground(new Color(204, 204, 255));
		this.add(jLabelGestorIT, null);
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
