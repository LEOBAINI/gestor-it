package Pantallas;

import java.awt.GridBagLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Choice;
import java.awt.TextArea;
import javax.swing.BorderFactory;

import Abm.AdministradorABM;
import Base.metodosSql;
import Objetos.Reparacion;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JButton;


@SuppressWarnings("unused")
public class Areparar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField jTextFieldSerial = null;
	private JLabel jLabelSerial = null;
	private JLabel jLabelTipo = null;
	private Choice choiceEquipos = null;
	private JTextField jTextFieldModelo = null;
	private JLabel jLabelModelo = null;
	private TextArea textAreaDescripcion = null;
	private JLabel jLabelDescripcion = null;
	private JLabel jLabelFecha = null;
	private JTextField jTextFieldFecha = null;
	private JLabel jLabelEstado = null;
	private Choice choiceEstado = null;
	private JLabel jLabelMail = null;
	private JTextField jTextFieldMail = null;
	private JLabel jLabelTelefono = null;
	private JTextField jTextFieldTelefono = null;
	private JLabel jLabelLugar = null;
	private Choice choiceLugar = null;
	private JButton jButtonInfoTabla = null;
	private JButton jButtonAceptar = null;
	/**
	 * This is the default constructor
	 * @throws SQLException 
	 */
	public Areparar() throws SQLException {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		jLabelLugar = new JLabel();
		jLabelLugar.setBounds(new Rectangle(365, 293, 216, 23));
		jLabelLugar.setText("Lugar del que viene");
		jLabelTelefono = new JLabel();
		jLabelTelefono.setBounds(new Rectangle(364, 247, 218, 20));
		jLabelTelefono.setText("Telefono");
		jLabelMail = new JLabel();
		jLabelMail.setBounds(new Rectangle(364, 200, 218, 20));
		jLabelMail.setText("Mail de contacto");
		jLabelEstado = new JLabel();
		jLabelEstado.setBounds(new Rectangle(21, 285, 220, 21));
		jLabelEstado.setText("Estado");
		jLabelFecha = new JLabel();
		jLabelFecha.setBounds(new Rectangle(21, 217, 220, 21));
		jLabelFecha.setText("Fecha                                 AAAA-MM-DD");
		jLabelDescripcion = new JLabel();
		jLabelDescripcion.setBounds(new Rectangle(364, 6, 218, 20));
		jLabelDescripcion.setText("Descripcion");
		jLabelModelo = new JLabel();
		jLabelModelo.setBounds(new Rectangle(21, 149, 220, 21));
		jLabelModelo.setText("Modelo");
		jLabelTipo = new JLabel();
		jLabelTipo.setBounds(new Rectangle(21, 81, 220, 21));
		jLabelTipo.setText("Tipo de equipo");
		this.setSize(728, 360);
		this.setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(Color.white, 5));
		this.add(getJTextFieldSerial(), null);
		this.add(getJLabelSerial(), null);
		this.add(jLabelTipo, null);
		this.add(getChoiceEquipos(), null);
		this.add(getJTextFieldModelo(), null);
		this.add(jLabelModelo, null);
		this.add(getTextAreaDescripcion(), null);
		this.add(jLabelDescripcion, null);
		this.add(jLabelFecha, null);
		this.add(getJTextFieldFecha(), null);
		this.add(jLabelEstado, null);
		this.add(getChoiceEstado(), null);
		this.add(jLabelMail, null);
		this.add(getJTextFieldMail(), null);
		this.add(jLabelTelefono, null);
		this.add(getJTextFieldTelefono(), null);
		this.add(jLabelLugar, null);
		this.add(getChoiceLugar(), null);
		this.add(getJButtonInfoTabla(), null);
		this.add(getJButtonAceptar(), null);
	}

	/**
	 * This method initializes jTextFieldSerial	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldSerial() {
		if (jTextFieldSerial == null) {
			jTextFieldSerial = new JTextField();
			jTextFieldSerial.setBounds(new Rectangle(21, 47, 220, 21));
		}
		return jTextFieldSerial;
	}

	/**
	 * This method initializes jLabelSerial	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabelSerial() {
		if (jLabelSerial == null) {
			jLabelSerial = new JLabel();
			jLabelSerial.setText("Serial del equipo");
			jLabelSerial.setBounds(new Rectangle(21, 13, 220, 21));
		}
		return jLabelSerial;
	}

	/**
	 * This method initializes choiceEquipos	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceEquipos() {
		if (choiceEquipos == null) {
			choiceEquipos = new Choice();
			choiceEquipos.add("PC");
			choiceEquipos.add("Notebook");
			choiceEquipos.add("HandHeld");
			choiceEquipos.add("Impresora");
			choiceEquipos.add("Otro");
			choiceEquipos.setBounds(new Rectangle(21, 115, 220, 21));
			  
				
			choiceEquipos.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
						if(choiceEquipos.getSelectedItem().equals("Otro")){
						
						choiceEquipos.add(JOptionPane.showInputDialog("Ingrese el nuevo tipo de equipo, selecciónelo de la lista y avise a su administrador"));
						
					}
				}
			});
		}
		return choiceEquipos;
	}

	/**
	 * This method initializes jTextFieldModelo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldModelo() {
		if (jTextFieldModelo == null) {
			jTextFieldModelo = new JTextField();
			jTextFieldModelo.setBounds(new Rectangle(21, 183, 220, 21));
		}
		return jTextFieldModelo;
	}

	/**
	 * This method initializes textAreaDescripcion	
	 * 	
	 * @return java.awt.TextArea	
	 */
	private TextArea getTextAreaDescripcion() {
		if (textAreaDescripcion == null) {
			textAreaDescripcion = new TextArea();
			textAreaDescripcion.setBounds(new Rectangle(364, 34, 218, 161));
			textAreaDescripcion.addTextListener(new java.awt.event.TextListener() {
				public void textValueChanged(java.awt.event.TextEvent e) {
					if(textAreaDescripcion.getText().length()>198){
						JOptionPane.showMessageDialog(null,"Demasiados caracteres, solo hasta 200");
						textAreaDescripcion.setText(textAreaDescripcion.getText().substring(0, 198));
					}
				}
			});
			
		}
		return textAreaDescripcion;
	}

	/**
	 * This method initializes jTextFieldFecha	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFecha() {
		if (jTextFieldFecha == null) {
			jTextFieldFecha = new JTextField();
			jTextFieldFecha.setBounds(new Rectangle(21, 251, 71, 21));
			metodosSql metodos = new metodosSql();
			jTextFieldFecha.setText(metodos.dameFechaDeHoy());
			
		}
		return jTextFieldFecha;
	}

	/**
	 * This method initializes choiceEstado	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceEstado() {
		if (choiceEstado == null) {
			choiceEstado = new Choice();
			choiceEstado.setBounds(new Rectangle(21, 319, 220, 29));
			choiceEstado.add("ROTO REPARABLE");
			choiceEstado.add("ROTO ESPERANDO PIEZA");
			choiceEstado.add("CON FALLA");
		}
		return choiceEstado;
	}

	/**
	 * This method initializes jTextFieldMail	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldMail() {
		if (jTextFieldMail == null) {
			jTextFieldMail = new JTextField();
			jTextFieldMail.setBounds(new Rectangle(364, 225, 218, 20));
		}
		return jTextFieldMail;
	}

	/**
	 * This method initializes jTextFieldTelefono	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTelefono() {
		if (jTextFieldTelefono == null) {
			jTextFieldTelefono = new JTextField();
			jTextFieldTelefono.setBounds(new Rectangle(364, 271, 218, 20));
		}
		return jTextFieldTelefono;
	}

	/**
	 * This method initializes choiceLugar	
	 * 	
	 * @return java.awt.Choice	
	 * @throws SQLException 
	 */
	private Choice getChoiceLugar() throws SQLException {
		if (choiceLugar == null) {
			choiceLugar = new Choice();
			choiceLugar.setBounds(new Rectangle(365, 319, 215, 22));
			metodosSql metodos=new metodosSql();
			metodos.llenarChoice(choiceLugar, "select nombre from locacion");
			
		}
		return choiceLugar;
	}

	/**
	 * This method initializes jButtonInfoTabla	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonInfoTabla() {
		if (jButtonInfoTabla == null) {
			jButtonInfoTabla = new JButton();
			jButtonInfoTabla.setBounds(new Rectangle(641, 7, 55, 26));
			jButtonInfoTabla.setText("INF");
			jButtonInfoTabla.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JOptionPane.showMessageDialog(null, 
							
							
							"IDREPA	int(11)	NO	PRI		auto_increment \n"+
							"lugar	varchar(45)	YES						\n"+
							"fecha	date	YES							\n"+
							"serial_del_equipo	varchar(45)	YES	MUL		\n"+
							"tipo	varchar(45)	YES						\n"+
							"modelo	varchar(45)	YES						\n"+
							"descripcion	varchar(200)	YES 		\n"+			
							"estado	varchar(200)	YES					\n"+
							"mail_de_contacto	varchar(45)	YES			\n"+		
							"telefono	varchar(45)	YES					\n"		);
				}
			});
		}
		return jButtonInfoTabla;
	}

	/**
	 * This method initializes jButtonAceptar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAceptar() {
		if (jButtonAceptar == null) {
			jButtonAceptar = new JButton();
			jButtonAceptar.setBounds(new Rectangle(608, 286, 106, 29));
			jButtonAceptar.setText("Aceptar");
			jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					Reparacion repa=new Reparacion();
					repa.setDescripcion(textAreaDescripcion.getText());
					repa.setEstado(choiceEstado.getSelectedItem());
					repa.setFecha_enviado(jTextFieldFecha.getText());
					repa.setLugar(choiceLugar.getSelectedItem());
					repa.setMail_de_contacto(jTextFieldMail.getText());
					repa.setModelo(jTextFieldModelo.getText());
					repa.setSerial_del_equipo(jTextFieldSerial.getText());
					repa.setTelefono(jTextFieldTelefono.getText());
					repa.setTipo(choiceEquipos.getSelectedItem());		
					AdministradorABM abm=new AdministradorABM();
					int status=0;
					status=abm.darDeAlta(repa, "furlong", "reparacion");
					if(status==1){
						JOptionPane.showMessageDialog(null, "Operación exitosa!");
						metodosSql metodos=new metodosSql();
						metodos.actualizarEstadoRepararEnReparacion();
					}
					else{
						JOptionPane.showMessageDialog(null, "Operación fallida.");
					}
					
				}
			});
		}
		return jButtonAceptar;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
