package Objetos;

import java.util.HashMap;

import Abm.Persistente;

public class Bam extends Persistente{

	String imei;
	String marca;
	String modelo;
	String proveedor_predeterminado;
	private HashMap<Object, Object> todosLosAtributos;	
	
	
	
	public Bam(String imei, String marca, String modelo, String proveedor_predeterminado) {
		super();
		this.imei = imei;
		this.marca = marca;
		this.modelo = modelo;
		this.proveedor_predeterminado = proveedor_predeterminado;
		
		HashMap<Object, Object> atributos=new HashMap<Object,Object>();
		atributos.put("imei", imei);
		atributos.put("marca", marca);
		atributos.put("modelo",modelo);
		atributos.put("proveedor_predeterminado", proveedor_predeterminado);
		
		this.todosLosAtributos=atributos;
	}
	@Override
	
	
	
	public String identificadorUnico() {
		// TODO Auto-generated method stub
		return imei;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
		this.todosLosAtributos.remove("imei");
		this.todosLosAtributos.put("imei",imei);
		this.imei = imei;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
		this.todosLosAtributos.remove("marca");
		this.todosLosAtributos.put("marca",marca);
		this.marca = marca;
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
	public String getProveedor() {
		return proveedor_predeterminado;
	}
	public void setProveedor(String proveedor_predeterminado) {
		this.proveedor_predeterminado = proveedor_predeterminado;
		this.todosLosAtributos.remove("proveedor_predeterminado");
		this.todosLosAtributos.put("proveedor_predeterminado",proveedor_predeterminado);
		this.proveedor_predeterminado = proveedor_predeterminado;
		
	}
	@Override
	public HashMap<Object, Object> todosLosAtributos() {
		// TODO Auto-generated method stub
		return todosLosAtributos;
	}
	
	
}
