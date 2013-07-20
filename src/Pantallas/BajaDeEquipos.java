package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

import Base.metodosSql;

@SuppressWarnings("unused")
public class BajaDeEquipos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelBajaDeEquipos = null;
	private JLabel jLabelPC = null;
	private JLabel jLabelHandHeld = null;
	private JLabel jLabelImpresora = null;
	private JTextField jTextFieldID = null;
	private JLabel jLabelID = null;
	private JTextArea jTextAreaMotivo = null;
	private JLabel jLabelMotivo = null;
	private JButton jButtonDarBaja = null;
	private JLabel jLabelBaja = null;
	private JLabel bam = null;
	private JLabel jLabelChip = null;
	private JRadioButton jRadioButtonChip = null;
	private JRadioButton jRadioButtonImpresora = null;
	private JRadioButton jRadioButtonHand = null;
	private JRadioButton jRadioButtonBam = null;
	private JRadioButton jRadioButtonPc = null;
	private JPanel jPanelBases = null;
	private JLabel jLabelPCNAME = null;
	private JLabel jLabelidbam = null;
	private JLabel jLabelSerieh = null;
	private JLabel jLabelId = null;
	private JLabel jLabelserialChip = null;
	/**
	 * This is the default constructor
	 */
	public BajaDeEquipos() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelChip = new JLabel();
		jLabelChip.setText("Chip");
		jLabelChip.setBounds(new Rectangle(638, 26, 40, 21));
		bam = new JLabel();
		bam.setText("Bam");
		bam.setBounds(new Rectangle(140, 26, 81, 21));
		jLabelBaja = new JLabel();
		jLabelBaja.setBounds(new Rectangle(668, 181, 136, 131));
		jLabelBaja.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
		jLabelBaja.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlechaBaja.jpg")));
		jLabelBaja.setText("");
		jLabelMotivo = new JLabel();
		jLabelMotivo.setBounds(new Rectangle(25, 261, 131, 16));
		jLabelMotivo.setText("Motivo de la baja");
		jLabelID = new JLabel();
		jLabelID.setBounds(new Rectangle(25, 190, 118, 16));
		jLabelID.setText("Identificador único");
		jLabelImpresora = new JLabel();
		jLabelImpresora.setText("Impresora");
		jLabelImpresora.setBounds(new Rectangle(473, 26, 76, 21));
		jLabelHandHeld = new JLabel();
		jLabelHandHeld.setText("HandHeld");
		jLabelHandHeld.setBounds(new Rectangle(308, 26, 79, 21));
		jLabelPC = new JLabel();
		jLabelPC.setText("PC");
		jLabelPC.setBounds(new Rectangle(31, 26, 25, 21));
		this.setSize(812, 360);
		this.setLayout(null);
		this.add(getJLabelBajaDeEquipos(), null);
		this.add(getJTextFieldID(), null);
		this.add(jLabelID, null);
		this.add(getJTextAreaMotivo(), null);
		this.add(jLabelMotivo, null);
		this.add(getJButtonDarBaja(), null);
		this.add(jLabelBaja, null);
		this.add(getJPanelBases(), null);
	}

	/**
	 * This method initializes jLabelBajaDeEquipos	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getJLabelBajaDeEquipos() {
		if (jLabelBajaDeEquipos == null) {
			jLabelBajaDeEquipos = new JLabel();
			jLabelBajaDeEquipos.setText("Baja de equipos");
			jLabelBajaDeEquipos.setFont(new Font("Borg9", Font.ITALIC, 12));
			jLabelBajaDeEquipos.setBounds(new Rectangle(325, 14, 143, 30));
		}
		return jLabelBajaDeEquipos;
	}

	/**
	 * This method initializes jTextFieldID	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldID() {
		if (jTextFieldID == null) {
			jTextFieldID = new JTextField();
			jTextFieldID.setBounds(new Rectangle(25, 213, 194, 18));
		}
		return jTextFieldID;
	}

	/**
	 * This method initializes jTextAreaMotivo	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextAreaMotivo() {
		if (jTextAreaMotivo == null) {
			jTextAreaMotivo = new JTextArea();
			jTextAreaMotivo.setBounds(new Rectangle(25, 284, 215, 55));
		}
		return jTextAreaMotivo;
	}

	/**
	 * This method initializes jButtonDarBaja	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonDarBaja() {
		if (jButtonDarBaja == null) {
			jButtonDarBaja = new JButton();
			jButtonDarBaja.setBounds(new Rectangle(701, 320, 100, 24));
			jButtonDarBaja.setText("Dar de baja");
			jButtonDarBaja.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
				String identif=jTextFieldID.getText();
				String motivo=jTextAreaMotivo.getText();
				 metodosSql metodos=new metodosSql();
				/* if(jRadioButtonPc.isSelected()){
					 try{
						 
						metodos.insertarOmodif("delete from pc where ")
						 
					 }catch(Exception e1){
						 
					 }
					
				}/*if(jRadioButtonBam.isSelected()){
					try{
						 
					 }catch(){
						 
					 }
				}*/if(jRadioButtonHand.isSelected()){
					try{
						int status=0;
						 status=status+metodos.insertarOmodif("delete from handheld where serial= '"+identif+"';");
						 status=status+metodos.insertarOmodif("update bajahandheld set motivo= '"+motivo+ "' where serial= '"+identif+"'");
					if(status==2){
						JOptionPane.showMessageDialog(null,"Datos de HandHelds borrados con éxito");
					}
					
					}catch(Exception e2){
						 JOptionPane.showMessageDialog(null,"Error "+e2.getMessage());
					 }
				}/*if(jRadioButtonImpresora.isSelected()){
					try{
						 
					 }catch(){
						 
					 }
				}if(jRadioButtonChip.isSelected()){
					try{
						 
					 }catch(){
						 
					 }
				}*/
				
				
				
				
				}
			});
		}
		return jButtonDarBaja;
	}

	/**
	 * This method initializes jRadioButtonChip	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButtonChip() {
		if (jRadioButtonChip == null) {
			jRadioButtonChip = new JRadioButton();
			jRadioButtonChip.setBounds(new Rectangle(709, 26, 21, 21));
			jRadioButtonChip.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(jRadioButtonChip.isSelected()){
						desactivarRadio(jRadioButtonImpresora, jRadioButtonHand, jRadioButtonPc, jRadioButtonBam);
						
					}
				}
			});
		}
		return jRadioButtonChip;
	}

	/**
	 * This method initializes jRadioButtonImpresora	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButtonImpresora() {
		if (jRadioButtonImpresora == null) {
			jRadioButtonImpresora = new JRadioButton();
			jRadioButtonImpresora.setBounds(new Rectangle(580, 26, 27, 21));
			jRadioButtonImpresora.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(jRadioButtonImpresora.isSelected()){
						desactivarRadio(jRadioButtonPc, jRadioButtonHand, jRadioButtonChip, jRadioButtonBam);
						
					}
				}
			});
		}
		return jRadioButtonImpresora;
	}

	/**
	 * This method initializes jRadioButtonHand	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButtonHand() {
		if (jRadioButtonHand == null) {
			jRadioButtonHand = new JRadioButton();
			jRadioButtonHand.setBounds(new Rectangle(418, 26, 24, 21));
			jRadioButtonHand.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(jRadioButtonHand.isSelected()){
						desactivarRadio(jRadioButtonImpresora, jRadioButtonPc, jRadioButtonChip, jRadioButtonBam);
						
					}
				}
			});
		}
		return jRadioButtonHand;
	}

	/**
	 * This method initializes jRadioButtonBam	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	private JRadioButton getJRadioButtonBam() {
		if (jRadioButtonBam == null) {
			jRadioButtonBam = new JRadioButton();
			jRadioButtonBam.setBounds(new Rectangle(252, 26, 25, 21));
			jRadioButtonBam.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(jRadioButtonBam.isSelected()){
						desactivarRadio(jRadioButtonImpresora, jRadioButtonHand, jRadioButtonChip, jRadioButtonPc);
						
					}	
				
				
				}
			});
		}
		return jRadioButtonBam;
	}

	/**
	 * This method initializes jRadioButtonPc	
	 * 	
	 * @return javax.swing.JRadioButton	
	 */
	
	private void desactivarRadio(JRadioButton a,JRadioButton b,JRadioButton c,JRadioButton d){
		a.setSelected(false);
		b.setSelected(false);
		c.setSelected(false);
		d.setSelected(false);
	}
	private JRadioButton getJRadioButtonPc() {
		if (jRadioButtonPc == null) {
			jRadioButtonPc = new JRadioButton();
			jRadioButtonPc.setBounds(new Rectangle(87, 26, 22, 21));
			jRadioButtonPc.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if(jRadioButtonPc.isSelected()){
						desactivarRadio(jRadioButtonImpresora, jRadioButtonHand, jRadioButtonChip, jRadioButtonBam);
						
					}
				}
			});
		}
		return jRadioButtonPc;
	}

	/**
	 * This method initializes jPanelBases	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelBases() {
		if (jPanelBases == null) {
			jLabelserialChip = new JLabel();
			jLabelserialChip.setBounds(new Rectangle(639, 49, 107, 20));
			jLabelserialChip.setText("(Serial)");
			jLabelId = new JLabel();
			jLabelId.setBounds(new Rectangle(473, 50, 75, 17));
			jLabelId.setText("(Id)");
			jLabelSerieh = new JLabel();
			jLabelSerieh.setBounds(new Rectangle(308, 48, 79, 20));
			jLabelSerieh.setText("(Serial)");
			jLabelidbam = new JLabel();
			jLabelidbam.setBounds(new Rectangle(141, 50, 81, 17));
			jLabelidbam.setText("(Id)");
			jLabelPCNAME = new JLabel();
			jLabelPCNAME.setBounds(new Rectangle(31, 48, 72, 19));
			jLabelPCNAME.setText("(Nombre)");
			jPanelBases = new JPanel();
			jPanelBases.setLayout(null);
			jPanelBases.setBounds(new Rectangle(22, 76, 764, 75));
			jPanelBases.setBorder(BorderFactory.createTitledBorder(null, "SELECCIONE DE ALGUNA DE LAS BASES DISPONIBLES", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("Copperplate Gothic Light", Font.PLAIN, 12), null));
			jPanelBases.add(jLabelPC, null);
			jPanelBases.add(getJRadioButtonPc(), null);
			jPanelBases.add(bam, null);
			jPanelBases.add(getJRadioButtonBam(), null);
			jPanelBases.add(jLabelHandHeld, null);
			jPanelBases.add(getJRadioButtonHand(), null);
			jPanelBases.add(jLabelImpresora, null);
			jPanelBases.add(getJRadioButtonImpresora(), null);
			jPanelBases.add(jLabelChip, null);
			jPanelBases.add(getJRadioButtonChip(), null);
			jPanelBases.add(jLabelPCNAME, null);
			jPanelBases.add(jLabelidbam, null);
			jPanelBases.add(jLabelSerieh, null);
			jPanelBases.add(jLabelId, null);
			jPanelBases.add(jLabelserialChip, null);
		}
		return jPanelBases;
	}

}  //  @jve:decl-index=0:visual-constraint="78,-10"
