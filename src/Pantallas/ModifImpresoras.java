package Pantallas;

import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Choice;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Abm.AdministradorABM;
import Base.metodosSql;
import Objetos.Impresora;
import javax.swing.JDialog;
import java.awt.BorderLayout;

@SuppressWarnings("unused")
public class ModifImpresoras extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel jLabelAltaImpresora = null;
	private JLabel jLabelNroSerie = null;
	private JLabel jLabelMarca = null;
	private JLabel jLabelModelo = null;
	private JTextField jTextFieldNroSerie = null;
	private JTextField jTextFieldMarca = null;
	private JTextField jTextFieldModelo = null;
	private JButton jButtonModificar = null;
	private JLabel Impresora = null;
	private JLabel jLabelImpresora = null;
	private JTextField jTextFieldAyuda = null;
	private JLabel jLabelBusqueda = null;
	private JLabel jLabelRef = null;
	private Choice choiceNrosSerie = null;
	private JLabel jLabelListado = null;
	private JButton jButtonFiltrar = null;
	private JButton jButtonListar = null;
	private JButton jButtonSQL = null;
	private JButton jButtonEjemplo = null;
	private JButton jButtonEjemplo1 = null;
	private JTextField jTextFieldLocacion = null;
	private JTextField jTextFieldSector = null;
	private JLabel jLabel = null;
	private JLabel jLabel1LOcacion = null;
	/**
	 * This is the default constructor
	 */
	public ModifImpresoras() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
		
		
		
		
		jLabel1LOcacion = new JLabel();
		jLabel1LOcacion.setBounds(new Rectangle(22, 237, 132, 15));
		jLabel1LOcacion.setText("Locacion");
		jLabel = new JLabel();
		jLabel.setBounds(new Rectangle(22, 185, 132, 16));
		jLabel.setText("Sector");
		jLabelListado = new JLabel();
		jLabelListado.setBounds(new Rectangle(217, 196, 156, 21));
		jLabelListado.setText("Listado");
		jLabelRef = new JLabel();
		jLabelRef.setBounds(new Rectangle(217, 114, 157, 18));
		jLabelRef.setText("Introduzca últimos 6 dígitos");
		jLabelBusqueda = new JLabel();
		jLabelBusqueda.setBounds(new Rectangle(217, 95, 139, 17));
		jLabelBusqueda.setText("Búsqueda avanzada");
		jLabelImpresora = new JLabel();
		jLabelImpresora.setBounds(new Rectangle(377, 61, 227, 199));
		jLabelImpresora.setIcon(new ImageIcon(getClass().getResource("/Imagenes/impresora.jpg")));
		jLabelImpresora.setText("");
		jLabelModelo = new JLabel();
		jLabelModelo.setBounds(new Rectangle(22, 132, 132, 16));
		jLabelModelo.setText("Modelo");
		jLabelMarca = new JLabel();
		jLabelMarca.setBounds(new Rectangle(22, 71, 132, 24));
		jLabelMarca.setText("Marca");
		jLabelNroSerie = new JLabel();
		jLabelNroSerie.setBounds(new Rectangle(22, 8, 132, 26));
		jLabelNroSerie.setText("Nro de serie");
		jLabelAltaImpresora = new JLabel();
		jLabelAltaImpresora.setBounds(new Rectangle(159, 10, 246, 35));
		jLabelAltaImpresora.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
		jLabelAltaImpresora.setFont(new Font("Borg9", Font.ITALIC, 12));
		jLabelAltaImpresora.setText("Modificación de impresoras");
		this.setSize(617, 299);
		this.setLayout(null);
		this.add(jLabelAltaImpresora, null);
		this.add(jLabelNroSerie, null);
		this.add(jLabelMarca, null);
		this.add(jLabelModelo, null);
		this.add(getJTextFieldNroSerie(), null);
		this.add(getJTextFieldMarca(), null);
		this.add(getJTextFieldModelo(), null);
		this.add(getJButtonModificar(), null);
		this.add(jLabelImpresora, null);
		//this.add(Impresora, null);
		this.add(getJTextFieldAyuda(), null);
		this.add(jLabelBusqueda, null);
		this.add(jLabelRef, null);
		this.add(getChoiceNrosSerie(), null);
		this.add(jLabelListado, null);
		this.add(getJButtonFiltrar(), null);
		this.add(getJButtonListar(), null);
		this.add(getJButtonSQL(), null);
		this.add(getJButtonEjemplo(), null);
		this.add(getJButtonEjemplo1(), null);
		this.add(getJTextFieldLocacion(), null);
		this.add(getJTextFieldSector(), null);
		this.add(jLabel, null);
		this.add(jLabel1LOcacion, null);
	}

	/**
	 * This method initializes jTextFieldNroSerie	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldNroSerie() {
		if (jTextFieldNroSerie == null) {
			jTextFieldNroSerie = new JTextField();
			jTextFieldNroSerie.setBounds(new Rectangle(22, 42, 132, 21));
			jTextFieldNroSerie.setEditable(false);
		}
		return jTextFieldNroSerie;
	}

	/**
	 * This method initializes jTextFieldMarca	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldMarca() {
		if (jTextFieldMarca == null) {
			jTextFieldMarca = new JTextField();
			jTextFieldMarca.setBounds(new Rectangle(22, 103, 132, 21));
		}
		return jTextFieldMarca;
	}

	/**
	 * This method initializes jTextFieldModelo	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldModelo() {
		if (jTextFieldModelo == null) {
			jTextFieldModelo = new JTextField();
			jTextFieldModelo.setBounds(new Rectangle(22, 156, 132, 21));
		}
		return jTextFieldModelo;
	}

	/**
	 * This method initializes jButtonModificar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonModificar() {
		if (jButtonModificar == null) {
			jButtonModificar = new JButton();
			jButtonModificar.setBounds(new Rectangle(498, 265, 106, 26));
			jButtonModificar.setText("Modificar");
			jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					String nroSerie=jTextFieldNroSerie.getText();
					String marca=jTextFieldMarca.getText();
					String modelo=jTextFieldModelo.getText();
					String ubicacion=jTextFieldLocacion.getText();
					String sector=jTextFieldSector.getText();
					if(nroSerie.isEmpty() || marca.isEmpty() || modelo.isEmpty()){
						JOptionPane.showMessageDialog(null, "Hay campos vacios, reintente");
					}else{
					AdministradorABM abm=new AdministradorABM();
					Impresora imp=new Impresora(nroSerie.toUpperCase(),marca.toUpperCase(),modelo.toUpperCase());
					imp.setSector(sector);
					imp.setUbicacion(ubicacion);
					int status=	abm.modificar(imp, "furlong", "impresora");
					if(status==1){
						JOptionPane.showMessageDialog(null, "Impresora modificada correctamente");
					}else{
						JOptionPane.showMessageDialog(null, "Hubo un problema, los datos no se cargaron reintente");
					}
					}
				}
			});
		}
		return jButtonModificar;
	}

	/**
	 * This method initializes jTextFieldAyuda	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldAyuda() {
		if (jTextFieldAyuda == null) {
			jTextFieldAyuda = new JTextField();
			jTextFieldAyuda.setBounds(new Rectangle(217, 142, 145, 19));
		}
		return jTextFieldAyuda;
	}

	/**
	 * This method initializes choiceNrosSerie	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoiceNrosSerie() {
		if (choiceNrosSerie == null) {
			choiceNrosSerie = new Choice();
			choiceNrosSerie.setBounds(new Rectangle(218, 221, 153, 22));
			choiceNrosSerie.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent e) {
					metodosSql metodos=new metodosSql();
					ArrayList<String>campos;
					campos=metodos.consultar("select * from furlong.impresora " +
							" where id= '"+getChoiceNrosSerie().getSelectedItem()+"'").get(0);
					if(campos.size()>0){
						String serie=campos.get(0);
						String marca=campos.get(1);
						String modelo=campos.get(2);
						String locacion=campos.get(3);
						String sector=campos.get(4);
						jTextFieldNroSerie.setText(serie);
						jTextFieldMarca.setText(marca);
						jTextFieldModelo.setText(modelo);
						jTextFieldSector.setText(sector);
						jTextFieldLocacion.setText(locacion);
						
					}
				}
			});
		}
		return choiceNrosSerie;
	}

	/**
	 * This method initializes jButtonFiltrar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonFiltrar() {
		if (jButtonFiltrar == null) {
			jButtonFiltrar = new JButton();
			jButtonFiltrar.setBounds(new Rectangle(217, 163, 144, 20));
			jButtonFiltrar.setText("Filtrar listado");
			jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					choiceNrosSerie.removeAll();
					metodosSql metodos=new metodosSql();
					ArrayList<String>lista;
					lista=metodos.consultarUnaColumna("select id from furlong.impresora" +
							" where id like"+"'%"+jTextFieldAyuda.getText()+"';");
					for(int i=0;i<lista.size();i++)
						choiceNrosSerie.add(lista.get(i));
				}
			});
		}
		return jButtonFiltrar;
	}

	/**
	 * This method initializes jButtonListar	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonListar() {
		if (jButtonListar == null) {
			jButtonListar = new JButton();
			jButtonListar.setBounds(new Rectangle(217, 244, 155, 21));
			jButtonListar.setText("Listar todo");
			jButtonListar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					choiceNrosSerie.removeAll();
					metodosSql metodos=new metodosSql();
					ArrayList<String>lista;
					lista=metodos.consultarUnaColumna("select id from furlong.impresora");
					for(int i=0;i<lista.size();i++){
						System.out.println(lista.get(i));
						choiceNrosSerie.add(lista.get(i));
					}
						choiceNrosSerie.select(0);
				}
			});
		}
		return jButtonListar;
	}

	/**
	 * This method initializes jButtonSQL	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSQL() {
		if (jButtonSQL == null) {
			jButtonSQL = new JButton();
			jButtonSQL.setBounds(new Rectangle(445, 9, 159, 26));
			jButtonSQL.setText("SQL(insert o update)");
			jButtonSQL.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String sentencia;
					sentencia=JOptionPane.showInputDialog(null, "Ingrese modificación en lenguaje SQL");
			
					
					if(sentencia!=null){
					metodosSql metodos=new metodosSql();
					
					int status=metodos.insertarOmodif(sentencia);
					if(status==1){
						JOptionPane.showMessageDialog(null,"Comando ejecutado ok");
					}else{
						JOptionPane.showMessageDialog(null,"Error en el comando intente de nuevo o abra workbench");
					}
					}else{
						JOptionPane.showMessageDialog(null, "Se canceló la operación","Cancelación", JOptionPane.WARNING_MESSAGE);
					}
				}
			});
		}
		return jButtonSQL;
	}

	/**
	 * This method initializes jButtonEjemplo	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonEjemplo() {
		if (jButtonEjemplo == null) {
			jButtonEjemplo = new JButton();
		}
		return jButtonEjemplo;
	}

	/**
	 * This method initializes jButtonEjemplo1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonEjemplo1() {
		if (jButtonEjemplo1 == null) {
			jButtonEjemplo1 = new JButton();
			jButtonEjemplo1.setBounds(new Rectangle(508, 39, 95, 17));
			jButtonEjemplo1.setText("Ejemplo");
			jButtonEjemplo1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JOptionPane.showMessageDialog(null,"EJ: update impresora set id='32' where id='1'");
				}
			});
		}
		return jButtonEjemplo1;
	}

	/**
	 * This method initializes jTextFieldLocacion	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldLocacion() {
		if (jTextFieldLocacion == null) {
			jTextFieldLocacion = new JTextField();
			jTextFieldLocacion.setBounds(new Rectangle(22, 209, 132, 20));
		}
		return jTextFieldLocacion;
	}

	/**
	 * This method initializes jTextFieldSector	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldSector() {
		if (jTextFieldSector == null) {
			jTextFieldSector = new JTextField();
			jTextFieldSector.setBounds(new Rectangle(22, 260, 132, 21));
		}
		return jTextFieldSector;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
