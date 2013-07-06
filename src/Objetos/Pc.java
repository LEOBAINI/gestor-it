package Objetos;

import java.util.HashMap;

import Abm.Persistente;

public class Pc extends Persistente {
	
	String id;
	String nombre;
	String sistemaOperativo;
	String usuarioAsignado;
	String usuarioLogin;
	String office;
	
	public String getOffice() {
		return office;
	}



	public void setOffice(String office) {
	
		this.todosLosAtributos.remove("office");
		this.todosLosAtributos.put("office", office);
		this.office = office;
	
	}

	boolean esVisible;
	private HashMap<Object, Object> todosLosAtributos;
	
	
	public Pc(String nombre,String id){
		
		super();
		this.id = id;
		this.nombre = nombre;
		
		HashMap<Object, Object> atributos=new HashMap<Object,Object>();
		
		atributos.put("id", getId());
		atributos.put("nombre",getNombre());
		
		
		this.todosLosAtributos=atributos;
		
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



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
		this.todosLosAtributos.remove("nombre");
		this.todosLosAtributos.put("nombre", nombre);
		this.nombre = nombre;
	}



	public String getSistemaOperativo() {
		return sistemaOperativo;
	}



	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo=sistemaOperativo;
		this.todosLosAtributos.remove("sistemaOperativo");
		this.todosLosAtributos.put("sistemaOperativo",sistemaOperativo);
		this.sistemaOperativo = sistemaOperativo;
	}



	public String getUsuarioAsignado() {
		return usuarioAsignado;
	}



	public void setUsuarioAsignado(String usuarioAsignado) {
		this.usuarioAsignado=usuarioAsignado;
		this.todosLosAtributos.remove("usuarioAsignado");
		this.todosLosAtributos.put("usuarioAsignado",usuarioAsignado);
		this.usuarioAsignado = usuarioAsignado;
	}



	public String getUsuarioLogin() {
		return usuarioLogin;
	}



	public void setUsuarioLogin(String usuarioLogin) {
		this.usuarioLogin=usuarioLogin;
		this.todosLosAtributos.remove("usuarioLogin");
		this.todosLosAtributos.put("usuarioLogin",usuarioLogin);		
		this.usuarioLogin = usuarioLogin;
	}



	public boolean isEsVisible() {
		return esVisible;
	}



	public void setEsVisible(boolean esVisible) {
		this.esVisible=esVisible;
		this.todosLosAtributos.remove("esVisible");
		this.todosLosAtributos.put("esVisible",esVisible);
		this.esVisible = esVisible;
	}



	@Override
	public String identificadorUnico() {
		
		return "id";
	}

	@Override
	public HashMap<Object, Object> todosLosAtributos() {
		
		return this.todosLosAtributos;
	}

}
