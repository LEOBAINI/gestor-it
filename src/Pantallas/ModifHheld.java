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
import java.util.ArrayList;
import javax.swing.JTextPane;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
import java.awt.Color;

@SuppressWarnings("unused")
public class ModifHheld extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelAltaHheld = null;
	private JLabel jLabelFotohheld = null;
	private JLabel jLabelModelo = null;
	private JLabel jLabelNroSerie = null;
	private JLabel jLabelChapa = null;
	private JCheckBox jCheckBoxDual = null;
	private JLabel jLabelEsDual = null;
	private JTextField jTextFieldNroSerie = null;
	private JTextField jTextFieldChapa = null;
	private JButton jButtonModificarHheld = null;
	private JLabel jLabelChip = null;
	private JTextPane jTextPaneComentario = null;
	private JLabel jLabelComentario = null;
	private JLabel jLabelGarantiaHasta = null;
	private JTextField jTextFieldGarantiaHasta = null;
	private JLabel jLabelFormatoFecha = null;
	private JLabel jLabelMarcaChip = null;
	private String numeroChip="Sin chip";
	private Choice choiceModelo = null;
	private JLabel jLabelSeriales = null;
	private Choice choiceListadoSeriales = null;
	private JPanel jPanelMdif = null;
	private JLabel jLabelBusqueda = null;
	private JLabel jLabel = null;
	private JTextField jTextFieldFiltro = null;
	private JButton jButtonFiltro = null;
	private JButton jButtonListarTodo = null;
	private JTextField jTextFieldChipnro = null;
	/**
	 * This is the default constructor
	 */
	public ModifHheld() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		jLabelSeriales = new JLabel();
		jLabelSeriales.setText("Listado de números de serie");
		jLabelSeriales.setBounds(new Rectangle(7, 170, 170, 17));
		jLabelMarcaChip = new JLabel();
		jLabelMarcaChip.setBounds(new Rectangle(277, 87, 83, 22));
		jLabelMarcaChip.setText("");
		jLabelFormatoFecha = new JLabel();
		jLabelFormatoFecha.setBounds(new Rectangle(181, 247, 82, 18));
		jLabelFormatoFecha.setText("AAAA-MM-DD");
		jLabelGarantiaHasta = new JLabel();
		jLabelGarantiaHasta.setBounds(new Rectangle(181, 231, 271, 16));
		jLabelGarantiaHasta.setText("Garantía hasta (Si no tiene DEJAR EN BLANCO)");
		jLabelComentario = new JLabel();
		jLabelComentario.setBounds(new Rectangle(181, 165, 182, 14));
		jLabelComentario.setText("Comentario");
		jLabelChip = new JLabel();
		jLabelChip.setBounds(new Rectangle(181, 114, 181, 23));
		jLabelChip.setText("Chip nro");
		jLabelEsDual = new JLabel();
		jLabelEsDual.setBounds(new Rectangle(181, 87, 60, 22));
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
		jLabelFotohheld = new JLabel();
		jLabelFotohheld.setBounds(new Rectangle(847, 6, 162, 291));
		jLabelFotohheld.setIcon(new ImageIcon(getClass().getResource("/Imagenes/ep10.png")));
		jLabelFotohheld.setText("");
		jLabelAltaHheld = new JLabel();
		jLabelAltaHheld.setBounds(new Rectangle(319, 5, 279, 28));
		jLabelAltaHheld.setFont(new Font("Borg9", Font.ITALIC, 14));
		jLabelAltaHheld.setText("Modificación de Hand helds");
		this.setSize(1017, 368);
		this.setLayout(null);
		this.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		this.add(jLabelAltaHheld, null);
		this.add(jLabelFotohheld, null);
		this.add(jLabelModelo, null);
		this.add(jLabelNroSerie, null);
		this.add(jLabelChapa, null);
		this.add(getJCheckBoxDual(), null);
		this.add(jLabelEsDual, null);
		this.add(getJTextFieldNroSerie(), null);
		this.add(getJTextFieldChapa(), null);
		this.add(getJButtonModificarHheld(), null);
		this.add(jLabelChip, null);
		this.add(getJTextPaneComentario(), null);
		this.add(jLabelComentario, null);
		this.add(jLabelGarantiaHasta, null);
		this.add(getJTextFieldGarantiaHasta(), null);
		this.add(jLabelFormatoFecha, null);
		this.add(jLabelMarcaChip, null);
		this.add(getChoiceModelo(), null);
		this.add(getJPanelMdif(), null);
		this.add(getJTextFieldChipnro(), null);
	}

	/**
	 * This method initializes jCheckBoxDual	
	 * 	
	 * @return javax.swing.JCheckBox	
	 */
	private JCheckBox getJCheckBoxDual() {
		if (jCheckBoxDual == null) {
			jCheckBoxDual = new JCheckBox();
			jCheckBoxDual.setBounds(new Rectangle(245, 87, 23, 22));
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
	 * This method initializes jButtonModificarHheld	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonModificarHheld() {
		if (jButtonModificarHheld == null) {
			jButtonModificarHheld = new JButton();
			jButtonModificarHheld.setBounds(new Rectangle(25, 298, 340, 38));
			jButtonModificarHheld.setText("MODIFICAR");
			jButtonModificarHheld.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					try{
					String serialOrig=choiceListadoSeriales.getSelectedItem();
					int opcion=JOptionPane.showConfirmDialog(null, "Confirme MODIFICAR el elemento "+serialOrig+" ?", "Está seguro?", JOptionPane.YES_NO_OPTION);
					if(opcion==0){//"SI"
						
						String modelo=choiceModelo.getSelectedItem();
						String nroSerie=getJTextFieldNroSerie().getText();
						String chapaNro = null;
						try{
							if(!getJTextFieldChapa().getText().isEmpty()){
							chapaNro=getJTextFieldChapa().getText();
							}else{
								chapaNro=null;
							}
							
						}catch(Exception ex){
							
							JOptionPane.showMessageDialog(null,"Error en Chapa" );
						}
						String esDual="NO";
						if(getJCheckBoxDual().isSelected()){
							esDual="SI";
						}
						String comentario=getJTextPaneComentario().getText();
						String garantia="NO";
						if(getJTextFieldGarantiaHasta().getText().length()>9)
							garantia=getJTextFieldGarantiaHasta().getText();
						String chipMarca=jLabelMarcaChip.getText();
						String chipNro=numeroChip;
						
						
						
						
						HandHeld hand=new HandHeld(chapaNro, nroSerie,chipMarca ,modelo, comentario, esDual, garantia);
						if(!chipNro.equals("Sin chip")){
							hand.setChip(chipNro);
							
						}else{
							hand.setChip("SIN CHIP");
						}
					
					
						metodosSql metodos=new metodosSql();					
						//metodo cargado a mano por una particularidad, el serial del chip...
						String sentenciaSql="update handheld set modelo='"+modelo+"'" +
																",serial='"+nroSerie+"'" +
																",chapa_nro="+chapaNro+"" +
																",esdual='"+esDual+"'" +
																",comentario='"+comentario+"' " +
																", garantia_extendida_hasta='"+garantia+"'" +
																" where serial= '"+serialOrig+"'";
						int status=metodos.insertarOmodif(sentenciaSql);
						if(status==1){
							JOptionPane.showMessageDialog(null,"Datos modificados con éxito!");
						}else{
							JOptionPane.showMessageDialog(null,"ERROR! COLOQUE CORRECTAMENTE LOS DATOS EN LOS CAMPOS, EN LA CHAPA VA SÓLO NÚMERO CHECK IT!" );
						}
					
					
						
					}
					else{//"NO"
						
						JOptionPane.showMessageDialog(null,"La operación se canceló");
					}
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null,e1.getMessage());
						
					}
				
				}
			});
		}
		return jButtonModificarHheld;
	}

	/**
	 * This method initializes jTextPaneComentario	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getJTextPaneComentario() {
		if (jTextPaneComentario == null) {
			jTextPaneComentario = new JTextPane();
			jTextPaneComentario.setBounds(new Rectangle(181, 185, 184, 42));
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
			jTextFieldGarantiaHasta.setBounds(new Rectangle(181, 267, 184, 18));
			jTextFieldGarantiaHasta.setText("");
		}
		return jTextFieldGarantiaHasta;
	}

	/**
	 * This method initializes choiceMarca	
	 * 	
	 * @return java.awt.Choice	
	 */
	

	/**
	 * This method initializes choiceModelo	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceModelo() {
		if (choiceModelo == null) {
			choiceModelo = new Choice();
			choiceModelo.setBounds(new Rectangle(25, 117, 139, 21));
			metodosSql metodos=new metodosSql();
			ArrayList<String>modelos;
			modelos=metodos.consultarUnaColumna("select distinct(modelo) from modeloshandheld");
			for(int i=0;i<modelos.size();i++)
				choiceModelo.add(modelos.get(i));
		}
		return choiceModelo;
	}

	/**
	 * This method initializes choiceListadoSeriales	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceListadoSeriales() {
		if (choiceListadoSeriales == null) {
			choiceListadoSeriales = new Choice();
			choiceListadoSeriales.setBounds(new Rectangle(6, 215, 199, 21));
			choiceListadoSeriales.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					try{
					metodosSql metodos=new metodosSql();
					ArrayList<String>registro;
					registro=metodos.consultar("select chapa_nro,serial,chip,chipmarca,modelo,comentario,esdual,garantia_extendida_hasta" +
							" from handheld where serial= '"+choiceListadoSeriales.getSelectedItem()+"'").get(0);
					
					int chapaNro=0;
					if(registro.get(0)!=null){
				    chapaNro=Integer.parseInt(registro.get(0));		
					jTextFieldChapa.setText(String.valueOf(chapaNro));
					}else{
						jTextFieldChapa.setText("");
						
					}
					String nroSerie=registro.get(1);
					jTextFieldNroSerie.setText(nroSerie);
					String chipNro=registro.get(2);
					jTextFieldChipnro.setText(chipNro);
					String marcaChip=registro.get(3);
					jLabelMarcaChip.setText(marcaChip);
					String modelo=registro.get(4);
					//System.out.println(modelo);
					choiceModelo.select(modelo);
					String comentario=registro.get(5);
					jTextPaneComentario.setText(comentario);
					String esDual=registro.get(6);
					if(esDual.equals("SI")){
						jCheckBoxDual.setSelected(true);
					}else{
						jCheckBoxDual.setSelected(false);
					}
					String garantia=registro.get(7);
					jTextFieldGarantiaHasta.setText(garantia);
					}catch(Exception e2){
						JOptionPane.showMessageDialog(null,"Ups! hubo un error "+e2.getMessage() );
					}
					
					
					
					
					
					
					
					
					
					
				}
			});
		}
		return choiceListadoSeriales;
	}

	/**
	 * This method initializes jPanelMdif	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelMdif() {
		if (jPanelMdif == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(6, 68, 199, 23));
			jLabel.setText("Introduzca los útlimos 6 dígitos");
			jLabelBusqueda = new JLabel();
			jLabelBusqueda.setBounds(new Rectangle(6, 20, 148, 20));
			jLabelBusqueda.setText("Busqueda Avanzada");
			jPanelMdif = new JPanel();
			jPanelMdif.setLayout(null);
			jPanelMdif.setBounds(new Rectangle(487, 40, 354, 256));
			jPanelMdif.setBorder(BorderFactory.createTitledBorder(null, "Modifique desde aquí", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, new Font("Borg9", Font.ITALIC, 12), null));
			jPanelMdif.add(jLabelSeriales, null);
			jPanelMdif.add(getChoiceListadoSeriales(), null);
			jPanelMdif.add(jLabelBusqueda, null);
			jPanelMdif.add(jLabel, null);
			jPanelMdif.add(getJTextFieldFiltro(), null);
			jPanelMdif.add(getJButtonFiltro(), null);
			jPanelMdif.add(getJButtonListarTodo(), null);
		}
		return jPanelMdif;
	}

	/**
	 * This method initializes jTextFieldFiltro	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldFiltro() {
		if (jTextFieldFiltro == null) {
			jTextFieldFiltro = new JTextField();
			jTextFieldFiltro.setBounds(new Rectangle(6, 119, 199, 23));
		}
		return jTextFieldFiltro;
	}

	/**
	 * This method initializes jButtonFiltro	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonFiltro() {
		if (jButtonFiltro == null) {
			jButtonFiltro = new JButton();
			jButtonFiltro.setBounds(new Rectangle(231, 16, 107, 47));
			jButtonFiltro.setText("Filtrar listado");
			jButtonFiltro.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					choiceListadoSeriales.removeAll();
					String entrada;
					entrada=getJTextFieldFiltro().getText();
					metodosSql metodos=new metodosSql();
					if(entrada.length()>0){
						ArrayList<String>series;
						series=metodos.consultarUnaColumna("select serial from handheld " +
								"where serial like '%"+entrada+"'");
						
						for(int i=0;i<series.size();i++){
							choiceListadoSeriales.add(series.get(i));
						}
						
						
						
					}
					
					
					
					
					
				}
			});
		}
		return jButtonFiltro;
	}

	/**
	 * This method initializes jButtonListarTodo	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonListarTodo() {
		if (jButtonListarTodo == null) {
			jButtonListarTodo = new JButton();
			jButtonListarTodo.setBounds(new Rectangle(231, 192, 107, 47));
			jButtonListarTodo.setText("Listar todo");
			jButtonListarTodo.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					choiceListadoSeriales.removeAll();
					ArrayList<String>series;
					metodosSql metodos=new metodosSql();
					series=metodos.consultarUnaColumna("select serial from handheld ");
							
					
					for(int i=0;i<series.size();i++){
						choiceListadoSeriales.add(series.get(i));
					}
				}
			});
		}
		return jButtonListarTodo;
	}

	/**
	 * This method initializes jTextFieldChipnro	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldChipnro() {
		if (jTextFieldChipnro == null) {
			jTextFieldChipnro = new JTextField();
			jTextFieldChipnro.setBounds(new Rectangle(182, 137, 181, 24));
			jTextFieldChipnro.setEditable(false);
		}
		return jTextFieldChipnro;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
