package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

import Base.metodosSql;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

@SuppressWarnings("unused")
public class AltaBam extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelAltaBAm = null;
	private JLabel jLabelFotoBam = null;
	private JLabel jLabelMarca = null;
	private JLabel jLabelModelo = null;
	private JLabel jLabelProveedor = null;
	private JLabel jLabelImei = null;
	private JTextField jTextFieldMarca = null;
	private JTextField jTextFieldModelo = null;
	private JTextField jTextFieldProveedor = null;
	private JTextField jTextFieldImei = null;
	private JButton jButtonDarAltaBam = null;
	private JTextPane jTextPaneSugerencias = null;
	private JLabel jLabelInfo = null;
	private JScrollPane jScrollPaneRuedita = null;
	/**
	 * This is the default constructor
	 */
	public AltaBam() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelInfo = new JLabel();
		jLabelInfo.setBounds(new Rectangle(217, 47, 31, 25));
		jLabelInfo.setText("Info");
		jLabelImei = new JLabel();
		jLabelImei.setBounds(new Rectangle(13, 204, 175, 17));
		jLabelImei.setText("Imei");
		jLabelProveedor = new JLabel();
		jLabelProveedor.setBounds(new Rectangle(13, 139, 175, 17));
		jLabelProveedor.setText("Proveedor predeterminado");
		jLabelModelo = new JLabel();
		jLabelModelo.setBounds(new Rectangle(13, 75, 175, 17));
		jLabelModelo.setText("Modelo");
		jLabelMarca = new JLabel();
		jLabelMarca.setBounds(new Rectangle(13, 12, 175, 17));
		jLabelMarca.setText("Marca");
		jLabelFotoBam = new JLabel();
		jLabelFotoBam.setBounds(new Rectangle(464, 57, 221, 166));
		jLabelFotoBam.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Bam.jpg")));
		jLabelFotoBam.setText("");
		jLabelAltaBAm = new JLabel();
		jLabelAltaBAm.setBounds(new Rectangle(214, 19, 256, 25));
		jLabelAltaBAm.setFont(new Font("Borg9", Font.ITALIC, 14));
		jLabelAltaBAm.setText("Alta de banda ancha movil");
		this.setSize(698, 274);
		this.setLayout(null);
		this.add(jLabelAltaBAm, null);
		this.add(jLabelFotoBam, null);
		this.add(jLabelMarca, null);
		this.add(jLabelModelo, null);
		this.add(jLabelProveedor, null);
		this.add(jLabelImei, null);
		this.add(getJTextFieldMarca(), null);
		this.add(getJTextFieldModelo(), null);
		this.add(getJTextFieldProveedor(), null);
		this.add(getJTextFieldImei(), null);
		this.add(getJButtonDarAltaBam(), null);
		this.add(jLabelInfo, null);
		this.add(getJScrollPaneRuedita(), null);
	}

	/**
	 * This method initializes jTextFieldMarca	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldMarca() {
		if (jTextFieldMarca == null) {
			jTextFieldMarca = new JTextField();
			jTextFieldMarca.setBounds(new Rectangle(13, 41, 175, 17));
			jTextFieldMarca.addKeyListener(new java.awt.event.KeyAdapter() {
				public void keyReleased(java.awt.event.KeyEvent e) {
					int code=e.getKeyCode();
					if(code!=KeyEvent.VK_BACK_SPACE ){
					metodosSql metodos=new metodosSql();
					String campo=jTextFieldMarca.getText();
					System.out.println(campo);
					try {
						jTextPaneSugerencias.setText("");
						String relleno=metodos.consultarUnaColumna("SELECT nombre  FROM furlong.notebook where nombre like '"+campo+"%';").get(0).toString();
						jTextFieldMarca.setText(relleno);
						jTextPaneSugerencias.setText("Se autocompletó con:\n"+relleno);
						System.out.println("keyReleased()");
						
					} catch (Exception e2) {
						jTextPaneSugerencias.setText("No hay sugerencias");// TODO: handle exception
					}
					 // used to consumed the key in the keytyped event
						}

					// TODO Auto-generated Event stub keyReleased()
				}
			});
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
			jTextFieldModelo.setBounds(new Rectangle(13, 104, 175, 17));
		}
		return jTextFieldModelo;
	}

	/**
	 * This method initializes jTextFieldProveedor	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldProveedor() {
		if (jTextFieldProveedor == null) {
			jTextFieldProveedor = new JTextField();
			jTextFieldProveedor.setBounds(new Rectangle(13, 168, 175, 17));
		}
		return jTextFieldProveedor;
	}

	/**
	 * This method initializes jTextFieldImei	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldImei() {
		if (jTextFieldImei == null) {
			jTextFieldImei = new JTextField();
			jTextFieldImei.setBounds(new Rectangle(13, 233, 175, 17));
		}
		return jTextFieldImei;
	}

	/**
	 * This method initializes jButtonDarAltaBam	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonDarAltaBam() {
		if (jButtonDarAltaBam == null) {
			jButtonDarAltaBam = new JButton();
			jButtonDarAltaBam.setBounds(new Rectangle(557, 226, 129, 30));
			jButtonDarAltaBam.setText("Dar alta");
			jButtonDarAltaBam.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String marca=jTextFieldMarca.getText();
					String modelo=jTextFieldModelo.getText();
					String proveedor=jTextFieldProveedor.getText();
					String imei=jTextFieldImei.getText();
					System.out.println(marca+modelo+proveedor+imei);
					
				}
			});
		}
		return jButtonDarAltaBam;
	}

	/**
	 * This method initializes jTextPaneSugerencias	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getJTextPaneSugerencias() {
		if (jTextPaneSugerencias == null) {
			jTextPaneSugerencias = new JTextPane();
			jTextPaneSugerencias.setEditable(false);
		}
		return jTextPaneSugerencias;
	}

	/**
	 * This method initializes jScrollPaneRuedita	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneRuedita() {
		if (jScrollPaneRuedita == null) {
			jScrollPaneRuedita = new JScrollPane();
			jScrollPaneRuedita.setBounds(new Rectangle(217, 77, 240, 61));
			jScrollPaneRuedita.setViewportView(getJTextPaneSugerencias());
		}
		return jScrollPaneRuedita;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
