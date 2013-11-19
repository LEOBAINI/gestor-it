package Objetos;

import java.util.HashMap;

import Abm.Persistente;

public class Pc extends Persistente {
	
	
	String nombre;
	String sistemaOperativo;
	String usuarioAsignado;
	String usuarioLogin;
	String office;
	String esNotebook="NO";
	String comentario="SIN COMENTARIO";
	String locacion;
	String empresa;
	
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
	
	
	public Pc(String nombre){
		
		super();
		
		this.nombre = nombre;
		
		HashMap<Object, Object> atributos=new HashMap<Object,Object>();
		
		
		atributos.put("nombre",getNombre());
		
		
		this.todosLosAtributos=atributos;
		
	}
	public String getComentario(){
		return comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
		this.todosLosAtributos.remove("comentario");
		this.todosLosAtributos.put("comentario", comentario);
		this.comentario = comentario;
	}
	
	public String getEsNotebook(){
		return esNotebook;
	}
	
	public void setEsNotebook(String es) {
		this.esNotebook = es;
		this.todosLosAtributos.remove("esNotebook");
		this.todosLosAtributos.put("esNotebook", es);
		this.esNotebook = es;
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
		
		return "nombre";
	}

	@Override
	public HashMap<Object, Object> todosLosAtributos() {
		
		return this.todosLosAtributos;
	}



	@Override
	public Object getPK() {
		// TODO Auto-generated method stub
		return getNombre();
	}



	public String getLocacion() {
		return locacion;
	}



	public void setLocacion(String locacion) {
		this.locacion = locacion;
		this.todosLosAtributos.remove("locacion");
		this.todosLosAtributos.put("locacion",locacion);
		this.locacion = locacion;
	}



	public String getEmpresa() {
		return empresa;
	}



	public void setEmpresa(String empresa) {
		this.empresa = empresa;
		this.todosLosAtributos.remove("empresa");
		this.todosLosAtributos.put("empresa",empresa);
		
	}

}
