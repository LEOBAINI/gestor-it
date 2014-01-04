package Pantallas;

import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import Abm.AdministradorABM;
import Base.metodosSql;
import Objetos.HandHeld;

import java.awt.Choice;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTextPane;

@SuppressWarnings("unused")
public class AltaHanHeld extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelAltaHheld = null;
	private JLabel jLabelFotohheld = null;
	private JLabel jLabelMarca = null;
	private JLabel jLabelModelo = null;
	private JLabel jLabelNroSerie = null;
	private JLabel jLabelChapa = null;
	private JCheckBox jCheckBoxDual = null;
	private JLabel jLabelEsDual = null;
	private JTextField jTextFieldNroSerie = null;
	private JTextField jTextFieldChapa = null;
	private JButton jButtonDarAltaHheld = null;
	private Choice choiceChip = null;
	private JLabel jLabelChip = null;
	private JButton jButtonAyuda = null;
	private JTextPane jTextPaneComentario = null;
	private JLabel jLabelComentario = null;
	private JLabel jLabelGarantiaHasta = null;
	private JTextField jTextFieldGarantiaHasta = null;
	private JLabel jLabelFormatoFecha = null;
	private JLabel jLabelMarcaChip = null;
	private String numeroChip="Sin chip";
	private Choice choiceMarca = null;
	private Choice choiceModelo = null;
	/**
	 * This is the default constructor
	 */
	public AltaHanHeld() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelMarcaChip = new JLabel();
		jLabelMarcaChip.setBounds(new Rectangle(416, 86, 83, 22));
		jLabelMarcaChip.setText("");
		jLabelFormatoFecha = new JLabel();
		jLabelFormatoFecha.setBounds(new Rectangle(416, 224, 82, 18));
		jLabelFormatoFecha.setText("AAAA-MM-DD");
		jLabelGarantiaHasta = new JLabel();
		jLabelGarantiaHasta.setBounds(new Rectangle(226, 207, 271, 16));
		jLabelGarantiaHasta.setText("Garantía hasta (Si no tiene DEJAR EN BLANCO)");
		jLabelComentario = new JLabel();
		jLabelComentario.setBounds(new Rectangle(226, 143, 182, 14));
		jLabelComentario.setText("Comentario");
		jLabelChip = new JLabel();
		jLabelChip.setBounds(new Rectangle(227, 87, 181, 23));
		jLabelChip.setText("Chip nro");
		jLabelEsDual = new JLabel();
		jLabelEsDual.setBounds(new Rectangle(254, 63, 60, 17));
		jLabelEsDual.setText("Es dual?");
		jLabelChapa = new JLabel();
		jLabelChapa.setBounds(new Rectangle(25, 229, 139, 23));
		jLabelChapa.setText("Chapa nro");
		jLabelNroSerie = new JLabel();
		jLabelNroSerie.setBounds(new Rectangle(25, 157, 139, 23));
		jLabelNroSerie.setText("Numero de serie");
		jLabelModelo = new JLabel();
		jLabelModelo.setBounds(new Rectangle(25, 85, 139, 23));
		jLabelModelo.setText("Modelo");
		jLabelMarca = new JLabel();
		jLabelMarca.setBounds(new Rectangle(25, 13, 139, 23));
		jLabelMarca.setText("Marca");
		jLabelFotohheld = new JLabel();
		jLabelFotohheld.setBounds(new Rectangle(502, 11, 162, 291));
		jLabelFotohheld.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ep10.png")));
		jLabelFotohheld.setText("");
		jLabelAltaHheld = new JLabel();
		jLabelAltaHheld.setBounds(new Rectangle(230, 12, 181, 39));
		jLabelAltaHheld.setFont(new Font("Borg9", Font.ITALIC, 14));
		jLabelAltaHheld.setText("Alta de hand held");
		this.setSize(685, 309);
		this.setLayout(null);
		this.add(jLabelAltaHheld, null);
		this.add(jLabelFotohheld, null);
		this.add(jLabelMarca, null);
		this.add(jLabelModelo, null);
		this.add(jLabelNroSerie, null);
		this.add(jLabelChapa, null);
		this.add(getJCheckBoxDual(), null);
		this.add(jLabelEsDual, null);
		this.add(getJTextFieldNroSerie(), null);
		this.add(getJTextFieldChapa(), null);
		this.add(getJButtonDarAltaHheld(), null);
		this.add(getChoiceChip(), null);
		this.add(jLabelChip, null);
		this.add(getJButtonAyuda(), null);
		this.add(getJTextPaneComentario(), null);
		this.add(jLabelComentario, null);
		this.add(jLabelGarantiaHasta, null);
		this.add(getJTextFieldGarantiaHasta(), null);
		this.add(jLabelFormatoFecha, null);
		this.add(jLabelMarcaChip, null);
		this.add(getChoiceMarca(), null);
		this.add(getChoiceModelo(), null);
	}

	/**
	 * This method initializes jCheckBoxDual	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxDual() {
		if (jCheckBoxDual == null) {
			jCheckBoxDual = new JCheckBox();
			jCheckBoxDual.setBounds(new Rectangle(358, 59, 31, 25));
		}
		return jCheckBoxDual;
	}

	/**
	 * This method initializes jTextFieldNroSerie	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNroSerie() {
		if (jTextFieldNroSerie == null) {
			jTextFieldNroSerie = new JTextField();
			jTextFieldNroSerie.setBounds(new Rectangle(25, 193, 139, 23));
		}
		return jTextFieldNroSerie;
	}

	/**
	 * This method initializes jTextFieldChapa	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldChapa() {
		if (jTextFieldChapa == null) {
			jTextFieldChapa = new JTextField();
			jTextFieldChapa.setBounds(new Rectangle(25, 265, 139, 23));
		}
		return jTextFieldChapa;
	}

	/**
	 * This method initializes jButtonDarAltaHheld	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonDarAltaHheld() {
		if (jButtonDarAltaHheld == null) {
			jButtonDarAltaHheld = new JButton();
			jButtonDarAltaHheld.setBounds(new Rectangle(383, 265, 115, 38));
			jButtonDarAltaHheld.setText("Dar alta");
			jButtonDarAltaHheld.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					int opcion=JOptionPane.showConfirmDialog(null, "Confirme", "Está seguro que desea dar el alta?", JOptionPane.YES_NO_OPTION);
					if(opcion==0){//"SI"
						String marca=choiceMarca.getSelectedItem();
						String modelo=choiceModelo.getSelectedItem();
						String nroSerie=getJTextFieldNroSerie().getText();
						String chapaNro=null;
						try{
							chapaNro=getJTextFieldChapa().getText();
						}catch(Exception ex){
							JOptionPane.showMessageDialog(null,"Valor inválido,se colocará 0 por default" );
						}
						String esDual="NO";
						if(getJCheckBoxDual().isSelected()){
							esDual="SI";
						}
						String comentario=getJTextPaneComentario().getText();
						String garantia="NO";
						if(getJTextFieldGarantiaHasta().getText().length()>9)
							garantia=getJTextFieldGarantiaHasta().getText();
						String chipMarca=jLabelMarca.getText();
						String chipNro=numeroChip;
						
						
						
						
						HandHeld hand=new HandHeld(chapaNro, nroSerie,chipMarca ,modelo, comentario, esDual, garantia);
						if(!chipNro.equals("Sin chip")){
							hand.setChip(chipNro);
							
						}else{
							hand.setChip("SIN CHIP");
						}
					AdministradorABM abm=new AdministradorABM();
					int status=0;
					status=abm.darDeAlta(hand, "furlong", "handheld");
					if(status==1){
						metodosSql metodos=new metodosSql();
						String sentenciaSql="update chip set estado='OPERATIVO' where serial= '"+hand.getChip()+"'";
						try {
							metodos.insertarOmodif(sentenciaSql);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "Hand Held creada con éxito!");
					}else{
						JOptionPane.showMessageDialog(null,"Algo salió mal, no se guardaron los datos...Reintente.");
					}
					
						
					
					}
					else{//"NO"
						
						JOptionPane.showMessageDialog(null,"La operación se canceló");
					}
				
				}
			});
		}
		return jButtonDarAltaHheld;
	}

	/**
	 * This method initializes choiceChip	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceChip() {
		if (choiceChip == null) {
			choiceChip = new Choice();
			choiceChip.setBounds(new Rectangle(225, 115, 183, 20));
			choiceChip.add("Sin chip");
			choiceChip.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					metodosSql metodos=new metodosSql();
					
					String marcaChip=getChoiceChip().getSelectedItem();
					numeroChip=marcaChip;
					String consulta="SELECT MARCA FROM furlong.chip WHERE SERIAL='"+marcaChip+"';";
					try{
						marcaChip=metodos.consultarUnaColumna(consulta).get(0);
						jLabelMarcaChip.setText(marcaChip);
					}catch(Exception e1){
						
					}
				}
			});
			choiceChip.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mousePressed(java.awt.event.MouseEvent e) {
					String chipsDisponibles="select serial from furlong.chip" +
							" where estado = 'EN STOCK*'";
					ArrayList<String>chips;
					metodosSql metodos=new metodosSql();
					chips=metodos.consultarUnaColumna(chipsDisponibles);
					choiceChip.removeAll();
					choiceChip.add("Sin chip");
					for(int i=0;i<chips.size();i++)
						choiceChip.add(chips.get(i));
						jButtonAyuda.setVisible(true);
				}
				
			});
			
			
			
			
		}
		return choiceChip;
	}

	/**
	 * This method initializes jButtonAyuda	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonAyuda() {
		if (jButtonAyuda == null) {
			jButtonAyuda = new JButton();
			jButtonAyuda.setBounds(new Rectangle(416, 120, 80, 21));
			jButtonAyuda.setText("Ayuda");
			jButtonAyuda.setVisible(false);
			jButtonAyuda.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String numero=JOptionPane.showInputDialog(null, null, "Ingrese los 6 ultimos numeros",JOptionPane.INFORMATION_MESSAGE);
					int encontrado=0;
					if(numero!=null){
					for(int i=0;i<choiceChip.getItemCount();i++){
						if(choiceChip.getItem(i).contains(numero)){
							choiceChip.select(i);
							
							numeroChip=choiceChip.getItem(i);
									metodosSql metodos=new metodosSql();
									
									String marcaChip=null;
									String consulta="SELECT MARCA FROM furlong.chip WHERE SERIAL='"+choiceChip.getItem(i)+"';";
									try{
										marcaChip=metodos.consultarUnaColumna(consulta).get(0);
										jLabelMarcaChip.setText(marcaChip);
									}catch(Exception e1){
										
									}
								}
							
							
							
							encontrado=1;
						}
					}if(encontrado==0){
						
							JOptionPane.showMessageDialog(null, "No existe el elemento buscado","Reintente por favor" , JOptionPane.WARNING_MESSAGE);
						
					}
				}
				});//fin action listener
			
		}//fin if ppal
		return jButtonAyuda;
	}

	/**
	 * This method initializes jTextPaneComentario	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getJTextPaneComentario() {
		if (jTextPaneComentario == null) {
			jTextPaneComentario = new JTextPane();
			jTextPaneComentario.setBounds(new Rectangle(226, 159, 184, 42));
		}
		return jTextPaneComentario;
	}

	/**
	 * This method initializes jTextFieldGarantiaHasta	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldGarantiaHasta() {
		if (jTextFieldGarantiaHasta == null) {
			jTextFieldGarantiaHasta = new JTextField();
			jTextFieldGarantiaHasta.setBounds(new Rectangle(227, 225, 184, 18));
			jTextFieldGarantiaHasta.setText("");
		}
		return jTextFieldGarantiaHasta;
	}

	/**
	 * This method initializes choiceMarca	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceMarca() {
		if (choiceMarca == null) {
			choiceMarca = new Choice();
			choiceMarca.setBounds(new Rectangle(26, 45, 137, 24));
			choiceMarca.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseEntered(java.awt.event.MouseEvent e) {
					choiceMarca.removeAll();
					metodosSql metodos=new metodosSql();
					ArrayList<String>marcas;
					marcas=metodos.consultarUnaColumna("select distinct(marca) from modeloshandheld");
					for(int i=0;i<marcas.size();i++)
						choiceMarca.add(marcas.get(i));
				}
			});
		}
		return choiceMarca;
	}

	/**
	 * This method initializes choiceModelo	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceModelo() {
		if (choiceModelo == null) {
			choiceModelo = new Choice();
			choiceModelo.setBounds(new Rectangle(25, 117, 138, 24));
			choiceModelo.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseEntered(java.awt.event.MouseEvent e) {
					choiceModelo.removeAll();
					metodosSql metodos=new metodosSql();
					ArrayList<String>modelos;
					modelos=metodos.consultarUnaColumna("select distinct(modelo) from modeloshandheld");
					for(int i=0;i<modelos.size();i++)
						choiceModelo.add(modelos.get(i));
				
				
				}
			});
		}
		return choiceModelo;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
