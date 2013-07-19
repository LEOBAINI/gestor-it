package Main;

import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Calendar;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Abm.AdministradorABM;
import Base.ConexionMySql;
import Objetos.Notebook;
import Pantallas.AltaPcNtb;
import Pantallas.Inicio;
import Pantallas.MenuPpal;

@SuppressWarnings("unused")
public class Main {

	/**
	 * @param args
	 */
	public int actBarra(MenuPpal menu, int valor){
		
		return 0;
	}
	static Calendar calendario = Calendar.getInstance();
	int segundos;
	public static int setearsegundos(){
	int segundos = calendario.get(Calendar.SECOND);
	
	System.out.println(segundos);
	return segundos;
	}
	
	public static void volverAempezar(){
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MenuPpal menu=new MenuPpal();
		
		/*Inicio ini=new Inicio();
		menu.getJContentPane().removeAll();
		menu.getContentPane().add(ini);*/
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		menu.setVisible(true);
		String host=JOptionPane.showInputDialog("Ingrese la ip del host o nombre del mismo");
		if(host!=null){
			ConexionMySql.host=host;
		}
		ConexionMySql con=new ConexionMySql();
		if(con.conectar()==1){
			menu.setTitle("Software de Gestión construido por y para profesionales IT                                       PRUEBA DE CONEXIÓN OK, CONECTADO A "+con.getHost()+" BASE DE DATOS "+con.getBase());
			JOptionPane.showMessageDialog(null,"Prueba de conexión satisfactoria!" );
		}else{
			menu.setTitle("Software de Gestión construido por y para profesionales IT                                       PRUEBA DE CONEXIÓN FALLIDA, REINTENTE");
			JOptionPane.showMessageDialog(null,"Asegurese que responda el ping a "+con.getHost()+" y que la base se llame, furlong.\n" +
					"El usuario debe ser root y la contraseña root" );
		}

		
		}
		
		
		
		
		
	}


