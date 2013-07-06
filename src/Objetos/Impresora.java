package Objetos;

import java.util.HashMap;

import Abm.Persistente;

public class Impresora extends Persistente {
	String id;
	String marca;
	String modelo;
	private HashMap<Object, Object> todosLosAtributos;
	
	

	public Impresora(String id,String marca, String modelo){
		this.id=id;
		this.marca=marca;
		this.modelo=modelo;
		
		HashMap<Object, Object> atributos=new HashMap<Object,Object>();
		
		atributos.put("id", getId());
		atributos.put("marca",getMarca());
		atributos.put("modelo",getModelo());
		
		
		this.todosLosAtributos=atributos;
		
	}


	public String identificadorUnico() {
		
		return this.id;
	}


	public HashMap<Object, Object> todosLosAtributos() {
	
		return this.todosLosAtributos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		this.todosLosAtributos.remove("id");
		this.todosLosAtributos.put("id", id);
		
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
		this.todosLosAtributos.remove("marca");
		this.todosLosAtributos.put("marca", marca);
		
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		
		this.todosLosAtributos.remove("modelo");
		this.todosLosAtributos.put("modelo", modelo);
		this.modelo = modelo;
		
	}
	public HashMap<Object, Object> getTodosLosAtributos() {
		return todosLosAtributos;
	}

	public void setTodosLosAtributos(HashMap<Object, Object> todosLosAtributos) {
		this.todosLosAtributos = todosLosAtributos;
	}

}
