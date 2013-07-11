package Main;

import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Calendar;
import java.util.Timer;

import javax.swing.JFrame;

import Abm.AdministradorABM;
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
		//pruebaSVN

		
		
			
		
		}
		
		
		
		
		
	}


