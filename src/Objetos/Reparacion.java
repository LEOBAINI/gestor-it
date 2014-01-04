package Objetos;

import java.util.HashMap;

import Abm.Persistente;

public class Reparacion extends Persistente {
	//int IDREPA;//	(11)	NO	PRI		auto_increment
	String lugar;//	varchar(45)	YES			
	String fecha;//	date	YES			
	String serial_del_equipo;//	varchar(45)	YES	MUL		
	String tipo;//	varchar(45)	YES			
	String modelo;//	varchar(45)	YES			
	String descripcion;//	varchar(200)	YES			
	String estado	;//varchar(200)	YES			
	String mail_de_contacto;//	varchar(45)	YES			
	String telefono;//	varchar(45)	YES		
	
	private HashMap<Object, Object> todosLosAtributos;
	
	


	public Reparacion() {
		
		HashMap<Object, Object> atributos=new HashMap<Object,Object>();
		this.todosLosAtributos=atributos;
	}
	
	public HashMap<Object, Object> getTodosLosAtributos() {
		return todosLosAtributos;
	}

	public void setTodosLosAtributos(HashMap<Object, Object> todosLosAtributos) {
		this.todosLosAtributos = todosLosAtributos;
	}


	@Override
	public Object getPK() {
		// TODO Auto-generated method stub
		return getSerial_del_equipo();
	}

	@Override
	public String identificadorUnico() {
		// TODO Auto-generated method stub
		return getSerial_del_equipo();
	}

	
    public HashMap<Object, Object> todosLosAtributos() {
		
		return todosLosAtributos;
	}
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
		this.todosLosAtributos.remove("lugar");
		this.todosLosAtributos.put("lugar",lugar);
		this.lugar = lugar;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
		this.todosLosAtributos.remove("fecha");
		this.todosLosAtributos.put("fecha",fecha);
		this.fecha = fecha;
	}

	public String getSerial_del_equipo() {
		return serial_del_equipo;
	}

	public void setSerial_del_equipo(String serial_del_equipo) {
		this.serial_del_equipo = serial_del_equipo;
		this.todosLosAtributos.remove("serial_del_equipo");
		this.todosLosAtributos.put("serial_del_equipo",serial_del_equipo);
		this.serial_del_equipo = serial_del_equipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
		this.todosLosAtributos.remove("tipo");
		this.todosLosAtributos.put("tipo",tipo); 
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
		this.todosLosAtributos.remove("modelo");
		this.todosLosAtributos.put("modelo",modelo);
		this.modelo = modelo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		this.todosLosAtributos.remove("descripcion");
		this.todosLosAtributos.put("descripcion",descripcion);
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
		this.todosLosAtributos.remove("estado");
		this.todosLosAtributos.put("estado",estado);
		this.estado = estado;
	}

	public String getMail_de_contacto() {
		return mail_de_contacto;
	}

	public void setMail_de_contacto(String mail_de_contacto) {
		this.mail_de_contacto = mail_de_contacto;
		this.todosLosAtributos.remove("mail_de_contacto");
		this.todosLosAtributos.put("mail_de_contacto",mail_de_contacto);
		this.mail_de_contacto = mail_de_contacto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
		this.todosLosAtributos.remove("telefono");
		this.todosLosAtributos.put("telefono",telefono);
		this.telefono = telefono;
	}

}
