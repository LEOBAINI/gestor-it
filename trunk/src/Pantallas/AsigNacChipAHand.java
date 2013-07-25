package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Choice;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;

import Base.metodosSql;

import java.awt.Font;
import java.awt.Color;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class AsigNacChipAHand extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelSim = null;
	private JLabel jLabelSerieHand = null;
	private Choice choiceNroChip = null;
	private Choice choiceSerieHand = null;
	private JTextField jTextFieldFiltroSim = null;
	private JButton jButtonFiltroSim = null;
	private JButton jButtonListarTodo = null;
	private JButton jButtonListarHand = null;
	private JTextField jTextFieldFiltrarHand = null;
	private JButton jButtonFiltrar = null;
	private JButton Asignar = null;
	private JPanel jPanelmensaje = null;

	/**
	 * This is the default constructor
	 */
	public AsigNacChipAHand() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelSerieHand = new JLabel();
		jLabelSerieHand.setBounds(new Rectangle(383, 102, 227, 26));
		jLabelSerieHand.setText("Número de serie de la hand held");
		jLabelSim = new JLabel();
		jLabelSim.setBounds(new Rectangle(78, 101, 227, 26));
		jLabelSim.setText("Número de SIM del chip");
		this.setSize(688, 326);
		this.setLayout(null);
		this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white, 5), "Asignación / reasignación de CHIP a HAND HELD", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("Borg9", Font.BOLD | Font.ITALIC, 12), null));
		this.add(jLabelSim, null);
		this.add(jLabelSerieHand, null);
		this.add(getChoiceNroChip(), null);
		this.add(getChoiceSerieHand(), null);
		this.add(getJTextFieldFiltroSim(), null);
		this.add(getJButtonFiltroSim(), null);
		this.add(getJButtonListarTodo(), null);
		this.add(getJButtonListarHand(), null);
		this.add(getJTextFieldFiltrarHand(), null);
		this.add(getJButtonFiltrar(), null);
		this.add(getAsignar(), null);
		this.add(getJPanelmensaje(), null);
	}

	/**
	 * This method initializes choiceNroChip	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceNroChip() {
		if (choiceNroChip == null) {
			choiceNroChip = new Choice();
			choiceNroChip.setBounds(new Rectangle(78, 185, 227, 26));
		}
		return choiceNroChip;
	}

	/**
	 * This method initializes choiceSerieHand	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceSerieHand() {
		if (choiceSerieHand == null) {
			choiceSerieHand = new Choice();
			choiceSerieHand.setBounds(new Rectangle(383, 186, 227, 21));
		}
		return choiceSerieHand;
	}

	/**
	 * This method initializes jTextFieldFiltroSim	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFiltroSim() {
		if (jTextFieldFiltroSim == null) {
			jTextFieldFiltroSim = new JTextField();
			jTextFieldFiltroSim.setBounds(new Rectangle(78, 129, 227, 26));
		}
		return jTextFieldFiltroSim;
	}

	/**
	 * This method initializes jButtonFiltroSim	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonFiltroSim() {
		if (jButtonFiltroSim == null) {
			jButtonFiltroSim = new JButton();
			jButtonFiltroSim.setBounds(new Rectangle(78, 157, 227, 26));
			jButtonFiltroSim.setText("Filtrar");
			jButtonFiltroSim.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String serie=jTextFieldFiltroSim.getText();
					String consulta="select serial from chip where serial like '%"+serie+"'";
					metodosSql metodos=new metodosSql();
					ArrayList<String>lista;
					lista=metodos.consultarUnaColumna(consulta);
					choiceNroChip.removeAll();
					for(int i=0;i<lista.size();i++){
						choiceNroChip.add(lista.get(i));
					}
					metodos.consultarUnaColumna(consulta);
				}
			});
		}
		return jButtonFiltroSim;
	}

	/**
	 * This method initializes jButtonListarTodo	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonListarTodo() {
		if (jButtonListarTodo == null) {
			jButtonListarTodo = new JButton();
			jButtonListarTodo.setBounds(new Rectangle(78, 208, 227, 26));
			jButtonListarTodo.setText("Listar todo");
			jButtonListarTodo.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					ArrayList<String>listaSerieChip;
					String consulta="select serial from chip ";
					listaSerieChip=metodos.consultarUnaColumna(consulta);
					choiceNroChip.removeAll();
					for(int i=0;i<listaSerieChip.size();i++)
						choiceNroChip.add(listaSerieChip.get(i));
				}
			});
		}
		return jButtonListarTodo;
	}

	/**
	 * This method initializes jButtonListarHand	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonListarHand() {
		if (jButtonListarHand == null) {
			jButtonListarHand = new JButton();
			jButtonListarHand.setBounds(new Rectangle(383, 209, 227, 26));
			jButtonListarHand.setText("Listar todo");
			jButtonListarHand.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					metodosSql metodos=new metodosSql();
					ArrayList<String>listaSerieChip;
					String consulta="select serial from handheld ";
					listaSerieChip=metodos.consultarUnaColumna(consulta);
					choiceSerieHand.removeAll();
					for(int i=0;i<listaSerieChip.size();i++)
						choiceSerieHand.add(listaSerieChip.get(i));
				}
			});
		}
		return jButtonListarHand;
	}

	/**
	 * This method initializes jTextFieldFiltrarHand	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFiltrarHand() {
		if (jTextFieldFiltrarHand == null) {
			jTextFieldFiltrarHand = new JTextField();
			jTextFieldFiltrarHand.setBounds(new Rectangle(383, 130, 227, 26));
		}
		return jTextFieldFiltrarHand;
	}

	/**
	 * This method initializes jButtonFiltrar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonFiltrar() {
		if (jButtonFiltrar == null) {
			jButtonFiltrar = new JButton();
			jButtonFiltrar.setBounds(new Rectangle(383, 158, 227, 26));
			jButtonFiltrar.setText("Filtrar");
			jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String serie=jTextFieldFiltrarHand.getText();
					String consulta="select serial from handheld where serial like '%"+serie+"'";
					metodosSql metodos=new metodosSql();
					ArrayList<String>lista;
					lista=metodos.consultarUnaColumna(consulta);
					choiceSerieHand.removeAll();
					for(int i=0;i<lista.size();i++){
						choiceSerieHand.add(lista.get(i));
					}
					metodos.consultarUnaColumna(consulta);
				
				}
			});
		}
		return jButtonFiltrar;
	}

	/**
	 * This method initializes Asignar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getAsignar() {
		if (Asignar == null) {
			Asignar = new JButton();
			Asignar.setBounds(new Rectangle(256, 260, 177, 45));
			Asignar.setText("Asignar");
			Asignar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					metodosSql metodos=new metodosSql();
					
					String serieHand=choiceSerieHand.getSelectedItem();
					String serieChip=choiceNroChip.getSelectedItem();
					if(!serieHand.equals(null)&&!serieChip.equals(null)){
						
						String estadoChip=metodos.estadoDeChip(serieChip);
						String chipDeLaHand=metodos.chipDeLaHandHeld(serieHand);
						//SI EL CHIP ESTA EN STOCK
						 if(estadoChip.equalsIgnoreCase("EN STOCK*")){
							 //SI LA HANDHELD NO TIENE CHIP
							if(chipDeLaHand==null){
								int status=0;
								status=metodos.AsignarChipAHand(serieChip,serieHand);
								if(status==1){
									JOptionPane.showMessageDialog(null,"Asignación correcta");
								}else{
									JOptionPane.showMessageDialog(null,"Hubo un problema verifique coherencia de datos.Reportelo urgentemente\n" +
											" verifique estado en chip con serial "+serieChip+" y handheld con serial "+serieHand);
									
								}
							}//SI LA HANDHELD YA TIENE CHIP?
							else{
								int pregunta=JOptionPane.showConfirmDialog(null, "La HAND HELD ya tiene CHIP, seguro que quiere REASIGNARLE UN CHIP???");
								String[] estados = { "EN STOCK*", "UNKNOWN", "DADO DE BAJA", "DESTRUIDO" };

								switch(pregunta){
								case 0:
									int status=0;
									String nuevoEstadoDelChip= (String) JOptionPane.showInputDialog(null, 
									        "Que estado tendrá el antigüo chip?",
									        "Estado del antigüo chip",
									        JOptionPane.QUESTION_MESSAGE, 
									        null, 
									        estados, 
									        estados[0]);
									String nuevoComentarioDelChip=JOptionPane.showInputDialog("Coloque un comentario corto");

									status=metodos.reAsignarChipAHand(serieChip, serieHand, nuevoEstadoDelChip, nuevoComentarioDelChip);
									if(status==1){
										JOptionPane.showMessageDialog(null,"Datos cargados con éxito!");
									}else{
										JOptionPane.showMessageDialog(null,"Error, verifique asignación");
									}
									break;//si
								case 1:JOptionPane.showMessageDialog(null,"Ok, no haré cambios");break;//si;//no
								case 2:JOptionPane.showMessageDialog(null,"Jamás estuve aquí....");break;//si;//cancelar
								}
							}
							
							
							
						}// FIN SI EL CHIP ESTA EN STOCK*
						 
						 
						 if(estadoChip.equalsIgnoreCase("DADO DE BAJA")){
							 int opcion=JOptionPane.showConfirmDialog(null, "Chip esta DADO DE BAJA, seguro que quiere REASIGNARLO?");
								System.out.println(opcion);
							
						}if(estadoChip.equalsIgnoreCase("OPERATIVO")){
							int opcion=JOptionPane.showConfirmDialog(null, "Chip YA OPERATIVO, seguro que quiere REASIGNARLO?");
							System.out.println(opcion);
						}if(estadoChip.equalsIgnoreCase("DESTRUIDO")){
							
						}
						if(!estadoChip.equalsIgnoreCase("DESTRUIDO")
								&&!estadoChip.equalsIgnoreCase("EN STOCK*")
								&&!estadoChip.equalsIgnoreCase("OPERATIVO")
								&&!estadoChip.equalsIgnoreCase("UNKNOWN")
								&&!estadoChip.equalsIgnoreCase("DADO DE BAJA")){
							JOptionPane.showMessageDialog(null,"CORRIJA ESTADO DEL CHIP: "+estadoChip);
						}
						
						
						
						//SI EL CHIP ESTÁ OPERATIVO(NO EN STOCK)
						//EL APARATO QUE LO PORTABA, QUEDA SIN CHIP.
						
						
						
						//SI LA HANDHELD YA TIENE UN CHIP ASIGNADO
						//PERO FISICAMENTE NO ESTÁ EL CHIP, POR CUALQUIER RAZÓN.
						//EL CHIP QUE TIENE ASIGNADO... VA A STOCK SI LO TENGO FÍSICAMENTE.
						//PERO SI NO ESTÁ, PIDO LA BAJA?
						
						
						
						
						
						
						
						
					
					}	
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null,"No pueden quedar vacios!", "ERROR!!! revise los campos :( ", JOptionPane.ERROR_MESSAGE);

				
				
				}
			}
			});
		}
		return Asignar;
	}

	/**
	 * This method initializes jPanelmensaje	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelmensaje() {
		if (jPanelmensaje == null) {
			jPanelmensaje = new JPanel();
			jPanelmensaje.setLayout(new GridBagLayout());
			jPanelmensaje.setBounds(new Rectangle(108, 48, 471, 32));
			jPanelmensaje.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white, 5), "Ingrese al menos 6 dígitos para más precisión", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12), null));
		}
		return jPanelmensaje;
	}

}  //  @jve:decl-index=0:visual-constraint="3,8"
