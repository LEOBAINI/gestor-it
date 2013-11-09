package Objetos;


import java.util.HashMap;


import Abm.Persistente;

public class Chip extends Persistente {
	String marca="";
	String serial="";
	String nroTelefono="";
	String comentario="";
	String estado="";
	public HashMap<Object, Object> todosLosAtributos;		
	
	
	public Chip(String marca, String serial) {
		super();
		
		this.marca = marca;
		this.serial = serial;
		
		HashMap<Object, Object> atributos=new HashMap<Object,Object>();
		
		atributos.put("marca", getMarca());
		atributos.put("serial",getSerial());
		/*atributos.put("nroTelefono", getNroTelefono());
		atributos.put("comentario", getComentario());
		atributos.put("estado", getEstado());*/
		this.todosLosAtributos=atributos;
	}
	
	
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		
			this.todosLosAtributos.remove("marca");
			this.todosLosAtributos.put("marca",marca);
			this.marca = marca;
	}
	
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.todosLosAtributos.remove("serial");
		this.todosLosAtributos.put("serial",serial);
		this.serial = serial;
	}
	public String getNroTelefono() {
		return nroTelefono;
	}
	public void setNroTelefono(String nroTelefono) {
		this.todosLosAtributos.remove("nroTelefono");
		this.todosLosAtributos.put("nroTelefono",nroTelefono);
		this.nroTelefono = nroTelefono;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.todosLosAtributos.remove("comentario");
		this.todosLosAtributos.put("comentario",comentario);		
		this.comentario = comentario;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.todosLosAtributos.remove("estado");
		this.todosLosAtributos.put("estado",estado);
		this.estado = estado;
	}
	
	
	@Override
	public String identificadorUnico() {
		// TODO Auto-generated method stub
		return serial;
	}
	@Override
	public HashMap<Object, Object> todosLosAtributos() {
		// TODO Auto-generated method stub
		return todosLosAtributos;
	}



	@Override
	public Object getPK() {
		// TODO Auto-generated method stub
		return getSerial();
	}
	

}
