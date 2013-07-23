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
import java.awt.Choice;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.JScrollPane;
import javax.swing.JButton;

import Abm.AdministradorABM;
import Objetos.Chip;

@SuppressWarnings("unused")
public class AltaChip extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelAltaChip = null;
	private JLabel jLabelSimNumber = null;
	private JTextField jTextFieldNroSim = null;
	private JLabel jLabelCompania = null;
	private Choice choiceCompania = null;
	private JLabel jLabelComentario = null;
	private JTextPane jTextPaneComentario = null;
	private JScrollPane jScrollPaneComentario = null;
	private JTextField jTextFieldCaracteres = null;
	private JLabel jLabelCaracteres = null;
	private JButton jButtonDarAlta = null;
	private JLabel jLabelNroTelefono = null;
	private JTextField jTextFieldNroTelefono = null;
	private JLabel jLabelInfo = null;
	/**
	 * This is the default constructor
	 */
	public AltaChip() {
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
		jLabelInfo.setBounds(new Rectangle(231, 83, 182, 25));
		jLabelInfo.setText("Campos obligatorios (*)");
		jLabelNroTelefono = new JLabel();
		jLabelNroTelefono.setBounds(new Rectangle(229, 32, 94, 25));
		jLabelNroTelefono.setText("Nro de teléfono");
		jLabelCaracteres = new JLabel();
		jLabelCaracteres.setBounds(new Rectangle(45, 236, 159, 18));
		jLabelCaracteres.setText("Cont caracteres MAX 30");
		jLabelComentario = new JLabel();
		jLabelComentario.setBounds(new Rectangle(18, 148, 160, 24));
		jLabelComentario.setText("Comentario");
		jLabelCompania = new JLabel();
		jLabelCompania.setBounds(new Rectangle(15, 84, 178, 30));
		jLabelCompania.setText("Compañia (*)");
		jLabelSimNumber = new JLabel();
		jLabelSimNumber.setBounds(new Rectangle(14, 32, 119, 25));
		jLabelSimNumber.setText("Numero de SIM (*)");
		jLabelAltaChip = new JLabel();
		jLabelAltaChip.setBounds(new Rectangle(243, 4, 131, 32));
		jLabelAltaChip.setFont(new Font("Borg9", Font.ITALIC, 14));
		jLabelAltaChip.setText("Alta de chips");
		this.setSize(632, 301);
		this.setLayout(null);
		this.add(jLabelAltaChip, null);
		this.add(jLabelSimNumber, null);
		this.add(getJTextFieldNroSim(), null);
		this.add(jLabelCompania, null);
		this.add(getChoiceCompania(), null);
		this.add(jLabelComentario, null);
		this.add(getJScrollPaneComentario(), null);
		this.add(getJTextFieldCaracteres(), null);
		this.add(jLabelCaracteres, null);
		this.add(getJButtonDarAlta(), null);
		this.add(jLabelNroTelefono, null);
		this.add(getJTextFieldNroTelefono(), null);
		this.add(jLabelInfo, null);
	}

	/**
	 * This method initializes jTextFieldNroSim	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNroSim() {
		if (jTextFieldNroSim == null) {
			jTextFieldNroSim = new JTextField();
			jTextFieldNroSim.setBounds(new Rectangle(15, 60, 193, 19));
		}
		return jTextFieldNroSim;
	}

	/**
	 * This method initializes choiceCompania	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceCompania() {
		if (choiceCompania == null) {
			choiceCompania = new Choice();
			choiceCompania.add("Movistar");
			choiceCompania.add("Claro");
			choiceCompania.add("Personal");
			choiceCompania.add("Otro");
			choiceCompania.setBounds(new Rectangle(15, 115, 191, 27));
			
		}
		return choiceCompania;
	}

	/**
	 * This method initializes jTextPaneComentario	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getJTextPaneComentario() {
		if (jTextPaneComentario == null) {
			jTextPaneComentario = new JTextPane();
			jTextPaneComentario.addKeyListener(new java.awt.event.KeyAdapter() {
				public void keyPressed(java.awt.event.KeyEvent e) {
					jTextFieldCaracteres.setText(String.valueOf(jTextPaneComentario.getText().length()));
					if(jTextPaneComentario.getText().length()>29){
						
						JOptionPane.showMessageDialog(null,"Demasiados caracteres max 30");
						try {
							jTextPaneComentario.setText(jTextPaneComentario.getText(0, 29));
							jTextFieldCaracteres.setText(String.valueOf(jTextPaneComentario.getText().length()));
						} catch (BadLocationException e1) {
							// TODO Auto-generated catch block
							//e1.printStackTrace();
						}
					}
				}
			});
			
			
			
			
		}
		return jTextPaneComentario;
	}

	/**
	 * This method initializes jScrollPaneComentario	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPaneComentario() {
		if (jScrollPaneComentario == null) {
			jScrollPaneComentario = new JScrollPane();
			jScrollPaneComentario.setBounds(new Rectangle(18, 176, 192, 55));
			jScrollPaneComentario.setViewportView(getJTextPaneComentario());
		}
		return jScrollPaneComentario;
	}

	/**
	 * This method initializes jTextFieldCaracteres	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldCaracteres() {
		if (jTextFieldCaracteres == null) {
			jTextFieldCaracteres = new JTextField();
			jTextFieldCaracteres.setBounds(new Rectangle(18, 234, 23, 20));
			jTextFieldCaracteres.setEditable(false);
		}
		return jTextFieldCaracteres;
	}

	/**
	 * This method initializes jButtonDarAlta	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonDarAlta() {
		if (jButtonDarAlta == null) {
			jButtonDarAlta = new JButton();
			jButtonDarAlta.setBounds(new Rectangle(451, 53, 169, 112));
			jButtonDarAlta.setText("Dar alta");
			jButtonDarAlta.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Chip.gif")));
			jButtonDarAlta.addActionListener(new java.awt.event.ActionListener() {   
				public void actionPerformed(java.awt.event.ActionEvent e) {    
					if(jTextFieldNroSim.getText().length() < 1){
						JOptionPane.showMessageDialog(null,"Por favor complete el número de SIM");
					}
					else{
						if(getChoiceCompania().getSelectedItem().isEmpty()){
							JOptionPane.showMessageDialog(null,"Por favor seleccione una compañia");
							
						}else{
							try{
							Chip c=new Chip(getChoiceCompania().getSelectedItem(),getJTextFieldNroSim().getText());
							
							c.setNroTelefono(jTextFieldNroTelefono.getText());
							c.setComentario(getJTextPaneComentario().getText());
							
							AdministradorABM abm=new AdministradorABM();
							int status=0;
							status=abm.darDeAlta(c, "furlong", "chip");
							if(status==1){
								JOptionPane.showMessageDialog(null,"Éxito al cargar!");
							}else{
								JOptionPane.showMessageDialog(null,"Falla al cargar, reintente");
							}
							}catch(Exception e2){
								JOptionPane.showMessageDialog(null, "MAL "+e2.getMessage());
								
							}
							
						}
					
					}
					
					
					
				}
			
			});
		}
		return jButtonDarAlta;
	}

	/**
	 * This method initializes jTextFieldNroTelefono	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNroTelefono() {
		if (jTextFieldNroTelefono == null) {
			jTextFieldNroTelefono = new JTextField();
			jTextFieldNroTelefono.setBounds(new Rectangle(229, 60, 185, 19));
		}
		return jTextFieldNroTelefono;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
