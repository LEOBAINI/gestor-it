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
import javax.swing.JOptionPane;

import Abm.AdministradorABM;
import Objetos.Impresora;

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
	private JButton jButtonLimpiar = null;
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
		this.add(getJButtonLimpiar(), null);
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
			jButtonDarAlta.setBounds(new Rectangle(138, 266, 106, 26));
			jButtonDarAlta.setText("Dar de alta");
			jButtonDarAlta.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					String nroSerie=jTextFieldNroSerie.getText();
					String marca=jTextFieldMarca.getText();
					String modelo=jTextFieldModelo.getText();
					if(nroSerie.isEmpty() || marca.isEmpty() || modelo.isEmpty()){
						JOptionPane.showMessageDialog(null, "Hay campos vacios, reintente");
					}else{
					AdministradorABM abm=new AdministradorABM();
					Impresora imp=new Impresora(nroSerie.toUpperCase(),marca.toUpperCase(),modelo.toUpperCase());
					int status=	abm.darDeAlta(imp, "furlong", "impresora");
					if(status==1){
						JOptionPane.showMessageDialog(null, "Impresora agregada correctamente");
					}else{
						JOptionPane.showMessageDialog(null, "Hubo un problema, los datos no se cargaron reintente");
					}
					}
				}
			});
		}
		return jButtonDarAlta;
	}

	/**
	 * This method initializes jButtonLimpiar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonLimpiar() {
		if (jButtonLimpiar == null) {
			jButtonLimpiar = new JButton();
			jButtonLimpiar.setBounds(new Rectangle(382, 266, 96, 26));
			jButtonLimpiar.setText("Limpiar");
			jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jTextFieldNroSerie.setText("");
					jTextFieldMarca.setText("");
					jTextFieldModelo.setText("");
				}
			});
		}
		return jButtonLimpiar;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
