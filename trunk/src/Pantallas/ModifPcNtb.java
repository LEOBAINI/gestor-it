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
import Base.metodosSql;
import Objetos.Notebook;
import Objetos.Pc;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class ModifPcNtb extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelAltaPCNTB = null;
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
	private JButton jButtonModificar = null;
	private JTextArea jTextAreaComentario = null;
	private JLabel jLabelComentario = null;
	private JTextField jTextFieldNombre = null;
	private JLabel jLabelNombre = null;
	private Choice choiceOffice = null;
	private JLabel jLabelOffice = null;
	private JLabel jLabelSeleccionarEquipo = null;
	private Choice choiceEquiposAModif = null;
	private int seleccionLleno=0;
	/**
	 * This is the default constructor
	 */
	public ModifPcNtb() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelSeleccionarEquipo = new JLabel();
		jLabelSeleccionarEquipo.setBounds(new Rectangle(410, 40, 182, 23));
		jLabelSeleccionarEquipo.setText("Seleccionar equipo a modificar");
		jLabelOffice = new JLabel();
		jLabelOffice.setBounds(new Rectangle(25, 232, 109, 17));
		jLabelOffice.setText("Paquete Office");
		jLabelNombre = new JLabel();
		jLabelNombre.setBounds(new Rectangle(24, 199, 112, 12));
		jLabelNombre.setText("Nombre del equipo");
		jLabelComentario = new JLabel();
		jLabelComentario.setBounds(new Rectangle(210, 107, 141, 19));
		jLabelComentario.setText("Comentario");
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
		jLabelAltaPCNTB = new JLabel();
		jLabelAltaPCNTB.setBounds(new Rectangle(143, 7, 292, 16));
		jLabelAltaPCNTB.setFont(new Font("Borg9", Font.ITALIC, 12));
		jLabelAltaPCNTB.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
		jLabelAltaPCNTB.setText("Modificación de Pc y Notebook");
		this.setSize(609, 306);
		this.setLayout(null);
		this.add(jLabelAltaPCNTB, null);
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
		this.add(getJButtonModificar(), null);
		this.add(getJTextAreaComentario(), null);
		this.add(jLabelComentario, null);
		this.add(getJTextFieldNombre(), null);
		this.add(jLabelNombre, null);
		this.add(getChoiceOffice(), null);
		this.add(jLabelOffice, null);
		this.add(jLabelSeleccionarEquipo, null);
		this.add(getChoiceEquiposAModif(), null);
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
	 * This method initializes jButtonModificar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonModificar() {
		if (jButtonModificar == null) {
			jButtonModificar = new JButton();
			jButtonModificar.setBounds(new Rectangle(375, 205, 232, 48));
			jButtonModificar.setText("Modificar");
			jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					
					//*****************alta***************************
					if(getJCheckBoxEsNotebook().isSelected()){	
						Notebook ntb=new Notebook(jTextFieldNombre.getText().toUpperCase());
						ntb.setSistemaOperativo(getChoiceSistemaOperativo().getSelectedItem());
						ntb.setUsuarioAsignado(getJTextFieldUsuario().getText().toUpperCase());
						ntb.setUsuarioLogin(getUserLogin().getText().toUpperCase());
						ntb.setNombre(getJTextFieldNombre().getText().toUpperCase());
						ntb.setOffice(getChoiceOffice().getSelectedItem());
						ntb.setEsVisible(getJCheckBoxEsVisible().isSelected());
						ntb.setEsNotebook("SI");
						if(jTextAreaComentario.getText().length()>0)
						ntb.setComentario(jTextAreaComentario.getText().toUpperCase());
						AdministradorABM abm=new AdministradorABM();
						
						int stat=abm.modificar(ntb, "furlong", "PC");
						if(stat==1){
							JOptionPane.showMessageDialog(null,"Comando ejecutado correctamente");
						}else{
							JOptionPane.showMessageDialog(null,"Hubo un problema, los datos no se cargaron");
							
						}
						}
						else{
							Pc pc=new Pc(jTextFieldNombre.getText().toUpperCase());
							pc.setSistemaOperativo(getChoiceSistemaOperativo().getSelectedItem());
							pc.setUsuarioAsignado(getJTextFieldUsuario().getText().toUpperCase());
							pc.setUsuarioLogin(getUserLogin().getText().toUpperCase());
							pc.setNombre(getJTextFieldNombre().getText().toUpperCase());
							pc.setOffice(getChoiceOffice().getSelectedItem());
							pc.setEsVisible(getJCheckBoxEsVisible().isSelected());
							if(jTextAreaComentario.getText().length()>0)
								pc.setComentario(jTextAreaComentario.getText().toUpperCase());
							pc.setEsNotebook("NO");
							AdministradorABM abm=new AdministradorABM();
							int stat=abm.modificar(pc, "furlong", "PC");
							if(stat==1){
								JOptionPane.showMessageDialog(null,"Comando ejecutado correctamente");
							}else{
								JOptionPane.showMessageDialog(null,"Hubo un problema, los datos no se cargaron");
								
							}
						}
					
					
					
					
					
					//*********************************************
					
				}
			});
		}
		return jButtonModificar;
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

	/**
	 * This method initializes choiceEquiposAModif	
	 * 	
	 * @return java.awt.Choice	
	 */
	
	private Choice getChoiceEquiposAModif() {
		if (choiceEquiposAModif == null) {
			choiceEquiposAModif = new Choice();
			choiceEquiposAModif.setBounds(new Rectangle(410, 65, 181, 22));
			choiceEquiposAModif.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mouseEntered(java.awt.event.MouseEvent e) { 
					if(seleccionLleno==0){
					choiceEquiposAModif.removeAll();
					ArrayList<String>nombres;
					metodosSql metodos=new metodosSql();
					nombres=metodos.consultarUnaColumna("select nombre from furlong.pc");
					for(int i=0;i<nombres.size();i++)
						choiceEquiposAModif.add(nombres.get(i));
				}   
					seleccionLleno=1;
				}
				


				
			});
			choiceEquiposAModif.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					String nombre=null;
					ArrayList<String> fila;
					nombre=getChoiceEquiposAModif().getSelectedItem();
					//System.out.println(nombre);
					metodosSql metodos=new metodosSql();
					fila=metodos.consultar("select * from furlong.pc where nombre = "+"'"+nombre+"'").get(0);
					String nombrePc=fila.get(0);
					jTextFieldNombre.setText(nombrePc);
					String so=fila.get(1);
					choiceSistemaOperativo.select(so);
					String usuario=fila.get(2);
					jTextFieldUsuario.setText(usuario);
					String usuarioLog=fila.get(3);
					UserLogin.setText(usuarioLog);
					String esVisible=fila.get(4);
					System.out.println("Es visible= "+esVisible);
					if(esVisible.equals("1")){
						jCheckBoxEsVisible.setSelected(true);
					}else{
						jCheckBoxEsVisible.setSelected(false);
					}
					String office=fila.get(5);
					choiceOffice.select(office);
					String comentario=fila.get(6);
					jTextAreaComentario.setText(comentario);
					String esNotebook=fila.get(7);
					
					if(esNotebook.equals("SI")){
					jCheckBoxEsNotebook.setSelected(true);
					}else{
						jCheckBoxEsNotebook.setSelected(false);
					}
				}
			});
		}
		return choiceEquiposAModif;
	}

}  //  @jve:decl-index=0:visual-constraint="9,7"
