package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import Abm.AdministradorABM;
import Base.metodosSql;
import Objetos.Bam;

import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.Choice;
import java.sql.SQLException;

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
	private JTextField jTextFieldImei = null;
	private JButton jButtonDarAltaBam = null;
	private Choice choiceProveedorPred = null;
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
		this.add(getJTextFieldImei(), null);
		this.add(getJButtonDarAltaBam(), null);
		this.add(getChoiceProveedorPred(), null);
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
					int status=0;
					metodosSql metodos=new metodosSql();
					String marca=jTextFieldMarca.getText();
					String modelo=jTextFieldModelo.getText();
					String proveedor=choiceProveedorPred.getSelectedItem();
					String imei=jTextFieldImei.getText();
					if(marca.length()==0 ||modelo.length()==0||imei.length()==0){
						JOptionPane.showMessageDialog(null,"Hay campos vaciós, corrija");
					}else{
					Bam b=new Bam(imei.toUpperCase(),marca.toUpperCase(),modelo.toUpperCase(),proveedor.toUpperCase());
					String sentenciaSql="insert into registrodebam" +
							" (locacion,solicitante,imei,proveedor_predet)" +
							" values('COMPUTOS','SIN SOLIC','"+b.getImei()+"','"+b.getProveedor()+"');";
					AdministradorABM abm=new AdministradorABM();
					
					status=status+abm.darDeAlta(b, "furlong", "bam");
					
					
					if(status==1){
						
						
						
						try {
							status=status+metodos.insertarOmodif(sentenciaSql);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						if(status==2){
							JOptionPane.showMessageDialog(null, "Éxito al cargar los datos");
							
						}else{
							try {
								metodos.insertarOmodif("delete FROM furlong.bam where imei='"+b.getImei()+"'; delete FROM furlong.registrodebam where imei='"+b.getImei()+"';");
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							JOptionPane.showMessageDialog(null,"Los datos no se cargaron porque no se pudo ejecutar --> "+sentenciaSql);
						}
						
						
					}else{
						//
						JOptionPane.showMessageDialog(null,"Hubo un problema al cargar los datos,reintente");
						
					}
					}
					
				}
			});
		}
		return jButtonDarAltaBam;
	}

	/**
	 * This method initializes choiceProveedorPred	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceProveedorPred() {
		if (choiceProveedorPred == null) {
			choiceProveedorPred = new Choice();
			choiceProveedorPred.setBounds(new Rectangle(14, 165, 173, 21));
			choiceProveedorPred.add("Movistar");
			choiceProveedorPred.add("Claro");
			choiceProveedorPred.add("Personal");
			choiceProveedorPred.add("Otro");
		}
		return choiceProveedorPred;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
