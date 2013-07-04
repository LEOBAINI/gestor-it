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
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;

@SuppressWarnings("unused")
public class BajaDeEquipos extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelBajaDeEquipos = null;
	private JCheckBox jCheckBoxPc = null;
	private JCheckBox jCheckBoxNotebook = null;
	private JCheckBox jCheckBoxHandHeld = null;
	private JCheckBox jCheckBoxImpresora = null;
	private JLabel jLabelPC = null;
	private JLabel jLabelNTB = null;
	private JLabel jLabelHandHeld = null;
	private JLabel jLabelImpresora = null;
	private JTextField jTextFieldID = null;
	private JLabel jLabelID = null;
	private JTextArea jTextAreaMotivo = null;
	private JLabel jLabelMotivo = null;
	private JButton jButtonBuscar = null;
	private JButton jButtonDarBaja = null;
	private JLabel jLabelBaja = null;
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
		jLabelBaja = new JLabel();
		jLabelBaja.setBounds(new Rectangle(401, 65, 136, 131));
		jLabelBaja.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
		jLabelBaja.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FlechaBaja.jpg")));
		jLabelBaja.setText("");
		jLabelMotivo = new JLabel();
		jLabelMotivo.setBounds(new Rectangle(21, 117, 131, 16));
		jLabelMotivo.setText("Motivo de la baja");
		jLabelID = new JLabel();
		jLabelID.setBounds(new Rectangle(21, 70, 118, 16));
		jLabelID.setText("Identificador único");
		jLabelImpresora = new JLabel();
		jLabelImpresora.setBounds(new Rectangle(398, 44, 76, 18));
		jLabelImpresora.setText("Impresora");
		jLabelHandHeld = new JLabel();
		jLabelHandHeld.setBounds(new Rectangle(252, 46, 79, 16));
		jLabelHandHeld.setText("HandHeld");
		jLabelNTB = new JLabel();
		jLabelNTB.setBounds(new Rectangle(115, 47, 70, 15));
		jLabelNTB.setText("Notebook");
		jLabelPC = new JLabel();
		jLabelPC.setBounds(new Rectangle(21, 45, 25, 17));
		jLabelPC.setText("PC");
		this.setSize(548, 237);
		this.setLayout(null);
		this.add(getJLabelBajaDeEquipos(), null);
		this.add(getJCheckBoxPc(), null);
		this.add(getJCheckBoxNotebook(), null);
		this.add(getJCheckBoxHandHeld(), null);
		this.add(getJCheckBoxImpresora(), null);
		this.add(jLabelPC, null);
		this.add(jLabelNTB, null);
		this.add(jLabelHandHeld, null);
		this.add(jLabelImpresora, null);
		this.add(getJTextFieldID(), null);
		this.add(jLabelID, null);
		this.add(getJTextAreaMotivo(), null);
		this.add(jLabelMotivo, null);
		this.add(getJButtonBuscar(), null);
		this.add(getJButtonDarBaja(), null);
		this.add(jLabelBaja, null);
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
			jLabelBajaDeEquipos.setBounds(new Rectangle(184, 8, 143, 30));
		}
		return jLabelBajaDeEquipos;
	}

	/**
	 * This method initializes jCheckBoxPc	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxPc() {
		if (jCheckBoxPc == null) {
			jCheckBoxPc = new JCheckBox();
			jCheckBoxPc.setBounds(new Rectangle(71, 44, 21, 21));
		}
		return jCheckBoxPc;
	}

	/**
	 * This method initializes jCheckBoxNotebook	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxNotebook() {
		if (jCheckBoxNotebook == null) {
			jCheckBoxNotebook = new JCheckBox();
			jCheckBoxNotebook.setBounds(new Rectangle(208, 44, 21, 21));
		}
		return jCheckBoxNotebook;
	}

	/**
	 * This method initializes jCheckBoxHandHeld	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxHandHeld() {
		if (jCheckBoxHandHeld == null) {
			jCheckBoxHandHeld = new JCheckBox();
			jCheckBoxHandHeld.setBounds(new Rectangle(354, 44, 21, 21));
		}
		return jCheckBoxHandHeld;
	}

	/**
	 * This method initializes jCheckBoxImpresora	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxImpresora() {
		if (jCheckBoxImpresora == null) {
			jCheckBoxImpresora = new JCheckBox();
			jCheckBoxImpresora.setBounds(new Rectangle(497, 44, 21, 21));
		}
		return jCheckBoxImpresora;
	}

	/**
	 * This method initializes jTextFieldID	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldID() {
		if (jTextFieldID == null) {
			jTextFieldID = new JTextField();
			jTextFieldID.setBounds(new Rectangle(21, 96, 116, 18));
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
			jTextAreaMotivo.setBounds(new Rectangle(21, 140, 215, 55));
		}
		return jTextAreaMotivo;
	}

	/**
	 * This method initializes jButtonBuscar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBuscar() {
		if (jButtonBuscar == null) {
			jButtonBuscar = new JButton();
			jButtonBuscar.setBounds(new Rectangle(157, 96, 89, 16));
			jButtonBuscar.setText("Buscar");
		}
		return jButtonBuscar;
	}

	/**
	 * This method initializes jButtonDarBaja	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonDarBaja() {
		if (jButtonDarBaja == null) {
			jButtonDarBaja = new JButton();
			jButtonDarBaja.setBounds(new Rectangle(363, 203, 176, 27));
			jButtonDarBaja.setText("Dar de baja");
		}
		return jButtonDarBaja;
	}

}  //  @jve:decl-index=0:visual-constraint="78,-10"
