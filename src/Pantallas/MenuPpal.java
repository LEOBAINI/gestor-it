package Pantallas;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.JProgressBar;
import javax.swing.JToolBar;
import javax.swing.JButton;

@SuppressWarnings("unused")
public class MenuPpal extends JFrame {

	private static final long serialVersionUID = 1L;
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenuArchivo = null;
	private JMenuItem jMenuItemAltas = null;
	private JMenuItem jMenuItemBajas = null;
	private JMenuItem jMenuItemModif = null;
	private JMenu jMenuRepas = null;
	private JMenuItem jMenuItemEnviar = null;
	private JMenuItem jMenuItemRetirar = null;
	private JMenu jMenuInventario = null;
	private JMenuItem jMenuItemPc = null;
	private JMenuItem jMenuItemNtb = null;
	private JMenuItem jMenuItemImpresoras = null;
	private JMenuItem jMenuItemHandheld = null;
	private JMenu jMenuABM2 = null;
	private JMenu jMenuAltas2 = null;
	private JMenu jMenuModificaciones = null;
	private JMenuItem jMenuItemPCyNTB = null;
	private JMenuItem jMenuItemImpresoras2 = null;
	private JMenuItem jMenuItemHandHelds = null;
	private JMenuItem jMenuItemBajas2 = null;
	private JMenuItem jMenuItemPcModif = null;
	private JMenuItem jMenuItemImpresorasModif = null;
	private JMenuItem jMenuItemHandHeldsModif = null;
	private JToolBar jToolBar = null;
	private JProgressBar jProgressBar = null;
	private JMenu jMenuArchivo1 = null;
	private JMenuItem jMenuItemSalir = null;
	private JMenu jMenuReasignaciones = null;
	private JMenu jMenuConsultas = null;
	/**
	 * This is the default constructor
	 */
	public MenuPpal() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(722, 366);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
		this.setTitle("Menú principal");
		 
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	public JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setName("PanelPpal");
			jContentPane.add(getJToolBar(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenuArchivo1());
			jJMenuBar.add(getJMenuABM2());
			jJMenuBar.add(getJMenuRepas());
			jJMenuBar.add(getJMenuInventario());
			jJMenuBar.add(getJMenuReasignaciones());
			jJMenuBar.add(getJMenuConsultas());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenuRepas	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuRepas() {
		if (jMenuRepas == null) {
			jMenuRepas = new JMenu();
			jMenuRepas.setText("Reparaciones");
			jMenuRepas.add(getJMenuItemEnviar());
			jMenuRepas.add(getJMenuItemRetirar());
		}
		return jMenuRepas;
	}

	/**
	 * This method initializes jMenuItemEnviar	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemEnviar() {
		if (jMenuItemEnviar == null) {
			jMenuItemEnviar = new JMenuItem();
			jMenuItemEnviar.setText("Enviar a Reparar");
		}
		return jMenuItemEnviar;
	}

	/**
	 * This method initializes jMenuItemRetirar	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemRetirar() {
		if (jMenuItemRetirar == null) {
			jMenuItemRetirar = new JMenuItem();
			jMenuItemRetirar.setText("Retirar de reparación");
		}
		return jMenuItemRetirar;
	}

	/**
	 * This method initializes jMenuInventario	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuInventario() {
		if (jMenuInventario == null) {
			jMenuInventario = new JMenu();
			jMenuInventario.setText("Inventario");
			jMenuInventario.add(getJMenuItemPc());
			jMenuInventario.add(getJMenuItemNtb());
			jMenuInventario.add(getJMenuItemImpresoras());
			jMenuInventario.add(getJMenuItemHandheld());
		}
		return jMenuInventario;
	}

	/**
	 * This method initializes jMenuItemPc	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemPc() {
		if (jMenuItemPc == null) {
			jMenuItemPc = new JMenuItem();
			jMenuItemPc.setText("Ver Pcs");
		}
		return jMenuItemPc;
	}

	/**
	 * This method initializes jMenuItemNtb	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemNtb() {
		if (jMenuItemNtb == null) {
			jMenuItemNtb = new JMenuItem();
			jMenuItemNtb.setText("Ver Notebooks");
		}
		return jMenuItemNtb;
	}

	/**
	 * This method initializes jMenuItemImpresoras	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemImpresoras() {
		if (jMenuItemImpresoras == null) {
			jMenuItemImpresoras = new JMenuItem();
			jMenuItemImpresoras.setText("Ver impresoras");
		}
		return jMenuItemImpresoras;
	}

	/**
	 * This method initializes jMenuItemHandheld	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHandheld() {
		if (jMenuItemHandheld == null) {
			jMenuItemHandheld = new JMenuItem();
			jMenuItemHandheld.setText("Ver HandHelds");
		}
		return jMenuItemHandheld;
	}

	/**
	 * This method initializes jMenuABM2	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuABM2() {
		if (jMenuABM2 == null) {
			jMenuABM2 = new JMenu();
			jMenuABM2.setText("ABM");
			jMenuABM2.add(getJMenuAltas2());
			jMenuABM2.add(getJMenuModificaciones());
			jMenuABM2.add(getJMenuItemBajas2());
		}
		return jMenuABM2;
	}

	/**
	 * This method initializes jMenuAltas2	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuAltas2() {
		if (jMenuAltas2 == null) {
			jMenuAltas2 = new JMenu();
			jMenuAltas2.setText("Altas");
			jMenuAltas2.add(getJMenuItemPCyNTB());
			jMenuAltas2.add(getJMenuItemImpresoras2());
			jMenuAltas2.add(getJMenuItemHandHelds());
		}
		return jMenuAltas2;
	}

	/**
	 * This method initializes jMenuModificaciones	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuModificaciones() {
		if (jMenuModificaciones == null) {
			jMenuModificaciones = new JMenu();
			jMenuModificaciones.setText("Modificaciones");
			jMenuModificaciones.add(getJMenuItemPcModif());
			jMenuModificaciones.add(getJMenuItemImpresorasModif());
			jMenuModificaciones.add(getJMenuItemHandHeldsModif());
		}
		return jMenuModificaciones;
	}

	/**
	 * This method initializes jMenuItemPCyNTB	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemPCyNTB() {
		if (jMenuItemPCyNTB == null) {
			jMenuItemPCyNTB = new JMenuItem();
			jMenuItemPCyNTB.setText("PC y Notebooks");
			jMenuItemPCyNTB.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					AltaPcNtb pc=new AltaPcNtb();
					getJContentPane().removeAll();
					getContentPane().add(pc);
					jContentPane.updateUI(); // 
					
					
					
					
					//System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jMenuItemPCyNTB;
	}

	/**
	 * This method initializes jMenuItemImpresoras2	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemImpresoras2() {
		if (jMenuItemImpresoras2 == null) {
			jMenuItemImpresoras2 = new JMenuItem();
			jMenuItemImpresoras2.setText("Impresoras");
		}
		return jMenuItemImpresoras2;
	}

	/**
	 * This method initializes jMenuItemHandHelds	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHandHelds() {
		if (jMenuItemHandHelds == null) {
			jMenuItemHandHelds = new JMenuItem();
			jMenuItemHandHelds.setText("HandHelds");
		}
		return jMenuItemHandHelds;
	}

	/**
	 * This method initializes jMenuItemBajas2	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemBajas2() {
		if (jMenuItemBajas2 == null) {
			jMenuItemBajas2 = new JMenuItem();
			jMenuItemBajas2.setText("Bajas");
			jMenuItemBajas2.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					BajaDeEquipos BE=new BajaDeEquipos();
					getJContentPane().removeAll();
					getContentPane().add(BE);
					jContentPane.updateUI(); // 
					
					
					
					
					//System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jMenuItemBajas2;
	}

	/**
	 * This method initializes jMenuItemPcModif	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemPcModif() {
		if (jMenuItemPcModif == null) {
			jMenuItemPcModif = new JMenuItem();
			jMenuItemPcModif.setText("PC y Notebooks");
			jMenuItemPcModif.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					ModifPcNtb modifPc=new ModifPcNtb();
					getJContentPane().removeAll();
					getContentPane().add(modifPc);
					jContentPane.updateUI(); // 
					
					
					//System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jMenuItemPcModif;
	}

	/**
	 * This method initializes jMenuItemImpresorasModif	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemImpresorasModif() {
		if (jMenuItemImpresorasModif == null) {
			jMenuItemImpresorasModif = new JMenuItem();
			jMenuItemImpresorasModif.setText("Impresoras");
		}
		return jMenuItemImpresorasModif;
	}

	/**
	 * This method initializes jMenuItemHandHeldsModif	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemHandHeldsModif() {
		if (jMenuItemHandHeldsModif == null) {
			jMenuItemHandHeldsModif = new JMenuItem();
			jMenuItemHandHeldsModif.setText("HandHelds");
		}
		return jMenuItemHandHeldsModif;
	}

	/**
	 * This method initializes jToolBar	
	 * 	
	 * @return javax.swing.JToolBar	
	 */
	private JToolBar getJToolBar() {
		if (jToolBar == null) {
			jToolBar = new JToolBar();
			jToolBar.setBounds(new Rectangle(3, 288, 708, 27));
			jToolBar.add(getJProgressBar());
		}
		return jToolBar;
	}

	/**
	 * This method initializes jProgressBar	
	 * 	
	 * @return javax.swing.JProgressBar	
	 */
	private JProgressBar getJProgressBar() {
		if (jProgressBar == null) {
			jProgressBar = new JProgressBar();
			
		}
		return jProgressBar;
	}

	public void setJProgressBar(int valor) {
		jProgressBar.setValue(valor);
		jProgressBar.setStringPainted(true);
		
	}

	/**
	 * This method initializes jMenuArchivo1	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuArchivo1() {
		if (jMenuArchivo1 == null) {
			jMenuArchivo1 = new JMenu();
			jMenuArchivo1.setText("Archivo");
			jMenuArchivo1.add(getJMenuItemSalir());
		}
		return jMenuArchivo1;
	}

	/**
	 * This method initializes jMenuItemSalir	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItemSalir() {
		if (jMenuItemSalir == null) {
			jMenuItemSalir = new JMenuItem();
			jMenuItemSalir.setText("Salir");
			jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					dispose();
					//System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
				}
			});
		}
		return jMenuItemSalir;
	}

	/**
	 * This method initializes jMenuReasignaciones	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuReasignaciones() {
		if (jMenuReasignaciones == null) {
			jMenuReasignaciones = new JMenu();
			jMenuReasignaciones.setText("Asignaciones");
		}
		return jMenuReasignaciones;
	}

	/**
	 * This method initializes jMenuConsultas	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenuConsultas() {
		if (jMenuConsultas == null) {
			jMenuConsultas = new JMenu();
			jMenuConsultas.setText("Consultas");
		}
		return jMenuConsultas;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
