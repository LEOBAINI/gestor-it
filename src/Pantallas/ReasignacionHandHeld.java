package Pantallas;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Choice;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

import Base.metodosSql;

import java.awt.Color;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class ReasignacionHandHeld extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private Choice choiceHandHeld = null;
	private Choice choiceLocacion = null;
	private JButton jButtonReasignar = null;
	private JLabel jLabelSerialHandHeld = null;
	private JLabel jLabelLocacion = null;
	private JLabel jLabelEtiqueta = null;

	/**
	 * This is the default constructor
	 */
	public ReasignacionHandHeld() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setResizable(false);
	
		this.setTitle("Reasignación de Hand Helds");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelEtiqueta = new JLabel();
			jLabelEtiqueta.setText("JLabel");
			jLabelLocacion = new JLabel();
			jLabelLocacion.setBounds(new Rectangle(16, 75, 139, 20));
			jLabelLocacion.setText("Locación");
			jLabelSerialHandHeld = new JLabel();
			jLabelSerialHandHeld.setBounds(new Rectangle(14, 6, 137, 21));
			jLabelSerialHandHeld.setText("Serial Hand Held");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.blue));
			jContentPane.add(getChoiceHandHeld(), null);
			jContentPane.add(getChoiceLocacion(), null);
			jContentPane.add(getJButtonReasignar(), null);
			jContentPane.add(jLabelSerialHandHeld, null);
			jContentPane.add(jLabelLocacion, null);
			jContentPane.add(jLabelEtiqueta, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes choiceHandHeld	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceHandHeld() {
		if (choiceHandHeld == null) {
			choiceHandHeld = new Choice();
			choiceHandHeld.setBounds(new Rectangle(14, 32, 144, 21));
			choiceHandHeld.addMouseListener(new java.awt.event.MouseAdapter() {   
				public void mousePressed(java.awt.event.MouseEvent e) {    
					metodosSql metodos=new metodosSql();
					try {
						metodos.llenarChoice(choiceHandHeld, "select serial from handheld order by serial");
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(null, "Error! "+e1.getMessage());
						e1.printStackTrace();
					}
				}   
			
				
			});
		}
		return choiceHandHeld;
	}

	/**
	 * This method initializes choiceLocacion	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceLocacion() {
		if (choiceLocacion == null) {
			choiceLocacion = new Choice();
			choiceLocacion.setBounds(new Rectangle(14, 100, 144, 27));
			choiceLocacion.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mousePressed(java.awt.event.MouseEvent e) {
					metodosSql metodos=new metodosSql();
					try {
						metodos.llenarChoice(choiceLocacion, "select nombre from locacion order by nombre");
					} catch (SQLException e1) {
						JOptionPane.showMessageDialog(null, "Error! "+e1.getMessage());
						e1.printStackTrace();
					}
				}
			});
		}
		return choiceLocacion;
	}

	/**
	 * This method initializes jButtonReasignar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonReasignar() {
		if (jButtonReasignar == null) {
			jButtonReasignar = new JButton();
			jButtonReasignar.setBounds(new Rectangle(172, 135, 113, 30));
			jButtonReasignar.setText("Reasignar");
			jButtonReasignar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int status=0;
					metodosSql metodos=new metodosSql();
					status=metodos.reasignarHandHeld(choiceHandHeld.getSelectedItem(),choiceLocacion.getSelectedItem());
					if(status==1){
						JOptionPane.showMessageDialog(null,"HandHeld reasignada!");
					}else{
						JOptionPane.showMessageDialog(null,"Ups!, hay un problema, volvé a intentar...");
					}
				}
			});
		}
		return jButtonReasignar;
	}

}
