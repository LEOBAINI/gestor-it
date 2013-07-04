package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

import Abm.AdministradorABM;
import Objetos.Notebook;

@SuppressWarnings("unused")
public class AltaPcNtb extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelAltaPCNTB = null;
	private JTextField jTextFieldID = null;
	private JLabel jLabelID = null;
	private JLabel jLabelSO = null;
	private JTextField jTextFieldUsuario = null;
	private JLabel jLabelUsuarioAsignado = null;
	private JLabel jLabelUserLogin = null;
	private JTextField UserLogin = null;
	private JCheckBox jCheckBoxEsNotebook = null;
	private JLabel jLabelEsNotebook = null;
	private JCheckBox jCheckBoxEsVisible = null;
	private JLabel jLabelEsVisible = null;
	private Choice choiceSistemaOperativo = null;
	private JButton jButtonDarAlta = null;
	private JButton jButtonAutoCompletar = null;
	private JLabel jLabelImagen = null;
	private JTextArea jTextAreaComentario = null;
	private JLabel jLabelComentario = null;
	private JTextField jTextFieldNombre = null;
	private JLabel jLabelNombre = null;
	private Choice choiceOffice = null;
	private JLabel jLabelOffice = null;
	/**
	 * This is the default constructor
	 */
	public AltaPcNtb() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelOffice = new JLabel();
		jLabelOffice.setBounds(new Rectangle(25, 232, 109, 17));
		jLabelOffice.setText("Paquete Office");
		jLabelNombre = new JLabel();
		jLabelNombre.setBounds(new Rectangle(24, 199, 112, 12));
		jLabelNombre.setText("Nombre del equipo");
		jLabelComentario = new JLabel();
		jLabelComentario.setBounds(new Rectangle(210, 107, 141, 19));
		jLabelComentario.setText("Comentario");
		jLabelImagen = new JLabel();
		jLabelImagen.setBounds(new Rectangle(358, 25, 243, 143));
		jLabelImagen.setIcon(new ImageIcon(getClass().getResource("/Imagenes/NetBook.jpg")));
		jLabelImagen.setText("JLabel");
		jLabelEsVisible = new JLabel();
		jLabelEsVisible.setBounds(new Rectangle(210, 70, 118, 21));
		jLabelEsVisible.setText("Es Visible?");
		jLabelEsNotebook = new JLabel();
		jLabelEsNotebook.setBounds(new Rectangle(209, 42, 117, 21));
		jLabelEsNotebook.setText("Es una notebook?");
		jLabelUserLogin = new JLabel();
		jLabelUserLogin.setBounds(new Rectangle(24, 156, 114, 20));
		jLabelUserLogin.setText("Usuario logueado");
		jLabelUsuarioAsignado = new JLabel();
		jLabelUsuarioAsignado.setBounds(new Rectangle(24, 109, 114, 13));
		jLabelUsuarioAsignado.setText("Usuario asignado");
		jLabelSO = new JLabel();
		jLabelSO.setBounds(new Rectangle(24, 67, 114, 17));
		jLabelSO.setText("Sist. operativo");
		jLabelID = new JLabel();
		jLabelID.setBounds(new Rectangle(24, 22, 114, 18));
		jLabelID.setText("Identificador único");
		jLabelAltaPCNTB = new JLabel();
		jLabelAltaPCNTB.setBounds(new Rectangle(143, 7, 226, 16));
		jLabelAltaPCNTB.setFont(new Font("Borg9", Font.ITALIC, 12));
		jLabelAltaPCNTB.setText("Alta de Pc y Notebook");
		this.setSize(609, 306);
		this.setLayout(null);
		this.add(jLabelAltaPCNTB, null);
		this.add(getJTextFieldID(), null);
		this.add(jLabelID, null);
		this.add(jLabelSO, null);
		this.add(getJTextFieldUsuario(), null);
		this.add(jLabelUsuarioAsignado, null);
		this.add(jLabelUserLogin, null);
		this.add(getUserLogin(), null);
		this.add(getJCheckBoxEsNotebook(), null);
		this.add(jLabelEsNotebook, null);
		this.add(getJCheckBoxEsVisible(), null);
		this.add(jLabelEsVisible, null);
		this.add(getChoiceSistemaOperativo(), null);
		this.add(getJButtonDarAlta(), null);
		this.add(getJButtonAutoCompletar(), null);
		this.add(jLabelImagen, null);
		this.add(getJTextAreaComentario(), null);
		this.add(jLabelComentario, null);
		this.add(getJTextFieldNombre(), null);
		this.add(jLabelNombre, null);
		this.add(getChoiceOffice(), null);
		this.add(jLabelOffice, null);
	}

	/**
	 * This method initializes jTextFieldID	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldID() {
		if (jTextFieldID == null) {
			jTextFieldID = new JTextField();
			jTextFieldID.setBounds(new Rectangle(24, 43, 109, 20));
		}
		return jTextFieldID;
	}

	/**
	 * This method initializes jTextFieldUsuario	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldUsuario() {
		if (jTextFieldUsuario == null) {
			jTextFieldUsuario = new JTextField();
			jTextFieldUsuario.setBounds(new Rectangle(24, 127, 109, 21));
		}
		return jTextFieldUsuario;
	}

	/**
	 * This method initializes UserLogin	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getUserLogin() {
		if (UserLogin == null) {
			UserLogin = new JTextField();
			UserLogin.setBounds(new Rectangle(24, 181, 109, 19));
		}
		return UserLogin;
	}

	/**
	 * This method initializes jCheckBoxEsNotebook	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxEsNotebook() {
		if (jCheckBoxEsNotebook == null) {
			jCheckBoxEsNotebook = new JCheckBox();
			jCheckBoxEsNotebook.setBounds(new Rectangle(335, 42, 21, 21));
		}
		return jCheckBoxEsNotebook;
	}

	/**
	 * This method initializes jCheckBoxEsVisible	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxEsVisible() {
		if (jCheckBoxEsVisible == null) {
			jCheckBoxEsVisible = new JCheckBox();
			jCheckBoxEsVisible.setBounds(new Rectangle(335, 73, 17, 15));
		}
		return jCheckBoxEsVisible;
	}

	/**
	 * This method initializes choiceSistemaOperativo	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceSistemaOperativo() {
		if (choiceSistemaOperativo == null) {
			choiceSistemaOperativo = new Choice();
			choiceSistemaOperativo.add("Windows 2000");
			choiceSistemaOperativo.add("Windows 2000 server");
			choiceSistemaOperativo.add("Windows 2003 server");
			choiceSistemaOperativo.add("Windows 2008 server");
			choiceSistemaOperativo.add("Windows XP");
			choiceSistemaOperativo.add("Windows 7");
			choiceSistemaOperativo.add("Windows Vista");
			choiceSistemaOperativo.add("Windows 8");
			choiceSistemaOperativo.add("Otro");
			
			choiceSistemaOperativo.setBounds(new Rectangle(23, 85, 152, 21));
		}
		return choiceSistemaOperativo;
	}

	/**
	 * This method initializes jButtonDarAlta	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonDarAlta() {
		if (jButtonDarAlta == null) {
			jButtonDarAlta = new JButton();
			jButtonDarAlta.setBounds(new Rectangle(457, 212, 144, 17));
			jButtonDarAlta.setText("Dar de alta");
			jButtonDarAlta.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				if(getJCheckBoxEsNotebook().isSelected()){	
				Notebook ntb=new Notebook(jTextFieldNombre.getText(),jTextFieldID.getText());
				ntb.setSistemaOperativo(getChoiceSistemaOperativo().getSelectedItem());
				ntb.setUsuarioAsignado(getJTextFieldUsuario().getText());
				ntb.setUsuarioLogin(getUserLogin().getText());
				ntb.setNombre(getJTextFieldNombre().getText());
				ntb.setOffice(getChoiceOffice().getSelectedItem());
				ntb.setEsVisible(getJCheckBoxEsVisible().isSelected());
				AdministradorABM abm=new AdministradorABM();
				int stat=abm.darDeAlta(ntb, "furlong", "notebook");
				if(stat==1){
					JOptionPane.showMessageDialog(null,"Comando ejecutado correctamente");
				}else{
					JOptionPane.showMessageDialog(null,"Hubo un problema, los datos no se cargaron");
					
				}
				}
				else{
					
				}
				
					
					
					
					
					//ystem.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jButtonDarAlta;
	}

	/**
	 * This method initializes jButtonAutoCompletar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAutoCompletar() {
		if (jButtonAutoCompletar == null) {
			jButtonAutoCompletar = new JButton();
			jButtonAutoCompletar.setBounds(new Rectangle(293, 211, 144, 17));
			jButtonAutoCompletar.setText("Autocompletar");
		}
		return jButtonAutoCompletar;
	}

	/**
	 * This method initializes jTextAreaComentario	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextAreaComentario() {
		if (jTextAreaComentario == null) {
			jTextAreaComentario = new JTextArea();
			jTextAreaComentario.setBounds(new Rectangle(209, 127, 144, 71));
		}
		return jTextAreaComentario;
	}

	/**
	 * This method initializes jTextFieldNombre	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNombre() {
		if (jTextFieldNombre == null) {
			jTextFieldNombre = new JTextField();
			jTextFieldNombre.setBounds(new Rectangle(25, 213, 109, 18));
		}
		return jTextFieldNombre;
	}

	/**
	 * This method initializes choiceOffice	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceOffice() {
		if (choiceOffice == null) {
			choiceOffice = new Choice();
			choiceOffice.setBounds(new Rectangle(26, 250, 106, 20));
			choiceOffice.add("OF 2000 ");
			choiceOffice.add("OF 2003 ");
			choiceOffice.add("OF 2007 ");
			choiceOffice.add("OF 2010 ");
			choiceOffice.add("OTRO");
		}
		return choiceOffice;
	}

}  //  @jve:decl-index=0:visual-constraint="9,7"
