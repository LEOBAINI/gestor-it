package Base;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import java.util.Date;

import java.util.Locale;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Abm.Persistente;

public class metodosSql extends ConexionMySql {
	
	
	
	public metodosSql() {
	}
	
	public  int insertarObjetoAlaBase(Persistente objeto,String base,String tabla){
		int status=-1;
		String atributos=formatearParaMySql(objeto.todosLosAtributos()).keySet().toString().replace('[', '(').replace("]", ")")+"values";
		
		String valores=formatearParaMySql(objeto.todosLosAtributos()).values().toString().replace('[', '(').replace("]", ");");
		
		String sentencia="insert into `"+base+"`.`"+tabla+"`"+atributos+valores;		
		
		status=insertarOmodif(sentencia);
		
		return status;
	}
	
	public int borrarObjetoDeLaBase(Persistente objeto,String base,String tabla){
		int status=0;
		String sentencia="delete from `"+base+"`.`"+tabla+"` where `"+objeto.identificadorUnico()+"`='"+objeto.todosLosAtributos().get(objeto.identificadorUnico())+"';";
		
		status=insertarOmodif(sentencia);
		
		return status;
		
	}
	
    public int modificarObjetoDeLaBase(Persistente objeto,String base,String tabla){
    	int status=-1;
		status=borrarObjetoDeLaBase(objeto, base, tabla);
		
		status=status+insertarObjetoAlaBase(objeto, base, tabla);
		
		if(status==2){
			status=1;
		}
		
		
		return status;
		
	}
	
	
	
	
	private HashMap<Object,Object> formatearParaMySql(HashMap <Object,Object> mapa){
		HashMap<Object,Object> aux=new HashMap<Object,Object>();
		Object clave = null;
		Object valor = null;
		Iterator<Entry<Object, Object>> it=mapa.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Object, Object> e = it.next();
			clave=e.getKey();
			valor=e.getValue();
			clave="`"+clave+"`";
			if(valor.getClass().getSimpleName().equals("String"))
				
				valor="'"+valor+"'";
			aux.put(clave, valor);
			}		
		
		return aux;
		
	}
	
	public String dameHorasTrabajadas(String fecha,String usuario){
		String horas="0";
		String dni="0";
		dni=consultarUnaColumna("select dni from proyectoweb.userlogin where usuario='"+usuario+"'").get(0);
		horas=consultarUnaColumna("SELECT SUM(HORASTRABAJADAS) FROM proyectoweb.registrogral "+
        " WHERE DNIPERSONAL="+dni+" AND FECHA='"+fecha+"';").get(0);
		
		return horas;
	}
	
	public String dameFechaDeHoy(){
		 SimpleDateFormat formateador = new SimpleDateFormat("yyyy'-'MM'-'dd", new Locale("es_ES"));
		 Date fechaDate = new Date();
          String fecha=formateador.format(fechaDate);
	
	return fecha;
	}
	public String dameAnio(){
		 SimpleDateFormat formateador = new SimpleDateFormat("yyyy", new Locale("es_ES"));
		 Date fechaDate = new Date();
         String fecha=formateador.format(fechaDate);
	
	return fecha;
	}

	public int insertarOmodif(String sentenciaSql) {
		int status=0;
		ConexionMySql con = new ConexionMySql();
		System.out.println(sentenciaSql);

		try {
			con.conectar();
			con.statemente.executeUpdate(sentenciaSql);

			con.desconectar();
			status=1;

		} catch (SQLException e) {
			System.out.println("Error en insertarOmodificar");
			if(e.getMessage().contains("Duplicate entry")){
				System.out.println("Entrada duplicada cambie la clave primaria e intente de nuevo");
				JOptionPane.showMessageDialog(null, "Entrada duplicada cambie la clave primaria e intente de nuevo");
			
			}
			//e.printStackTrace();
			
			
			con.desconectar();
			status=-1;
		}
		return status;

	}

	public ArrayList<ArrayList<String>> consultar(String SentenciaSql) {
		ResultSet res =null;
		ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();//creo una matriz
		String aux=null;
		
		ConexionMySql con = new ConexionMySql();
		
		
		try {
			con.conectar();
			con.resulsete=con.statemente.executeQuery(SentenciaSql);
			res = con.resulsete;
			ResultSetMetaData rmd = res.getMetaData(); //guardo los datos referentes al resultset
			
			 
	            while ( res.next()){
	                    ArrayList<String> columnas = new ArrayList<String>();
	                     for (int i=1; i<=rmd.getColumnCount(); i++) {
	                         aux=res.getString(i);            
	                        	 
	                    	 columnas.add(aux);
	                     }
	                     matriz.add(columnas);
	            }
	        con.desconectar();

			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error en metodosSql.consultar"+e.getMessage());
			System.out.println("Error en metodosSql.consultar"+e.getMessage());
			System.out.println(e.getLocalizedMessage());
			
		}

		return matriz;
		

	}
	
	
	
	
	public Object[] consultarNombresColumnas(String SentenciaSql) {
		ResultSet res =null;
		Object []nombreColumnas=null;
		
		
		ConexionMySql con = new ConexionMySql();
		
		
		try {
			con.conectar();
			con.resulsete=con.statemente.executeQuery(SentenciaSql);
			res = con.resulsete;
			ResultSetMetaData rmd = res.getMetaData(); //guardo los datos referentes al resultset
			nombreColumnas= new Object[rmd.getColumnCount()];
	            
	           for(int i=0;i<nombreColumnas.length;i++){
	        	   nombreColumnas[i]=rmd.getColumnName(i+1).toUpperCase();
	           }
	        con.desconectar();
		

			

		} catch (Exception e) {
			System.out.println("Error en metodosSql.consultar"+e.getMessage());
			System.out.println(e.getLocalizedMessage());
			
		}

		return nombreColumnas;
		

	}
	
		
	
	public ArrayList<String>consultarUnaColumna(String SentenciaSql) {
		ResultSet res =null;
		ArrayList<String> arreglo = new ArrayList<String>();//creo una matriz
		
		
		ConexionMySql con = new ConexionMySql();
		
		
		try {
			con.conectar();
			con.resulsete=con.statemente.executeQuery(SentenciaSql);
			res = con.resulsete;
			
			
			
			 
	            while ( res.next()){
	            	
	                arreglo.add(res.getString(1));
	            }
	        con.desconectar();

			

		} catch (Exception e) {
			System.out.println("Error en metodosSql.consultarUnaColumna"+e.getMessage());
			
		}

		return arreglo;
		

	}
	
	public String dameNroTeDoyMes(int numeroDeMes){
		String mes="NO EXISTE ESE MES";
		if(numeroDeMes >=1 && numeroDeMes <=12){
		switch(numeroDeMes){
		case 1:mes="ENERO";break;
		case 2:mes="FEBRERO";break;
		case 3:mes="MARZO";break;
		case 4:mes="ABRIL";break;
		case 5:mes="MAYO";break;
		case 6:mes="JUNIO";break;
		case 7:mes="JULIO";break;
		case 8:mes="AGOSTO";break;
		case 9:mes="SEPTIEMBRE";break;
		case 10:mes="OCTUBRE";break;
		case 11:mes="NOVIEMBRE";break;
		case 12:mes="DICIEMBRE";break;
		}
		}
		
		return mes;
	}
	
	public void llenarJtable(JTable tabla,String consulta){
		tabla.removeAll();
		ArrayList<ArrayList<String>> fullConsulta=new ArrayList<ArrayList<String>>();
		metodosSql metodos=new metodosSql();
			
			
		
		fullConsulta=metodos.consultar(consulta);
		//ResultSet res=metodos.consultarResultSet(consulta);
		if(fullConsulta.size()>0){
		int columnas=fullConsulta.get(0).size();
		int filas=fullConsulta.size();
		DefaultTableModel modelo = new DefaultTableModel();
		
		modelo.setColumnCount(columnas);
		modelo.setRowCount(filas);
		
		
		
		
		for(int i=0;i<filas;i++){
		
		for(int j=0;j<columnas;j++){
		
		
		
		 modelo.setValueAt(fullConsulta.get(i).get(j), i, j);
		}
		}
		modelo.setColumnIdentifiers(metodos.consultarNombresColumnas(consulta));
		
		
		
		tabla.setModel(modelo);
		
		}
	}
	
	
	

}
