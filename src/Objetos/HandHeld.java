package Objetos;

import java.util.HashMap;

import Abm.Persistente;

public class HandHeld extends Persistente{
	
	int CHAPA_NRO;
	String serial;
	String chip;
	String ChipMarca;
	String modelo;
	String estado;
	String SECTOR_ASIGNADO;
	String COMENTARIO;
	String LUGAR_FISICO_REAL;
	String ESDUAL;
	String GARANTIA_EXTENDIDA_HASTA;
	private HashMap<Object, Object> todosLosAtributos;	
	

	public HandHeld(int chapa_nro, String serial, String chipMarca,
			String modelo, String comentario, String ESDUAL,
			String garantia_extendida_hasta) {
		super();
		this.CHAPA_NRO = chapa_nro;
		this.serial = serial;
		this.ChipMarca = chipMarca;
		this.modelo = modelo;
		this.COMENTARIO = comentario;
		this.ESDUAL = ESDUAL;
		this.GARANTIA_EXTENDIDA_HASTA = garantia_extendida_hasta;
		
		
		
		HashMap<Object, Object> atributos=new HashMap<Object,Object>();
		
		atributos.put("CHAPA_NRO", getCHAPA_NRO());
		atributos.put("serial",getSerial());
		atributos.put("ChipMarca", getChipMarca());
		atributos.put("modelo",getModelo());
		atributos.put("COMENTARIO", getCOMENTARIO());
		atributos.put("ESDUAL",getESDUAL());
		atributos.put("GARANTIA_EXTENDIDA_HASTA", getGARANTIA_EXTENDIDA_HASTA());
		
		
		
		this.todosLosAtributos=atributos;
	}
	
	

	public int getCHAPA_NRO() {
		return CHAPA_NRO;
	}



	public void setCHAPA_NRO(int chapa_nro) {
		this.CHAPA_NRO = chapa_nro;
		this.todosLosAtributos.remove("CHAPA_NRO");
		this.todosLosAtributos.put("CHAPA_NRO", chapa_nro);
		this.CHAPA_NRO = chapa_nro;
	}



	public String getSerial() {
		return serial;
	}



	public void setSerial(String serial) {
		this.serial = serial;
		this.todosLosAtributos.remove("serial");
		this.todosLosAtributos.put("serial", serial);
		this.serial = serial;
	}



	public String getChip() {
		return chip;
	}



	public void setChip(String chip) {
		this.todosLosAtributos.remove("chip");
		this.todosLosAtributos.put("chip", chip);
		this.chip = chip;
	}



	public String getChipMarca() {
		return ChipMarca;
	}



	public void setChipMarca(String chipMarca) {
		
		this.todosLosAtributos.remove("ChipMarca");
		this.todosLosAtributos.put("ChipMarca", chipMarca);
		this.ChipMarca = chipMarca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		
		this.todosLosAtributos.remove("modelo");
		this.todosLosAtributos.put("modelo", modelo);		
		this.modelo = modelo;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.todosLosAtributos.remove("estado");
		this.todosLosAtributos.put("estado", estado);
		this.estado = estado;
	}



	public String getSECTOR_ASIGNADO() {
		return SECTOR_ASIGNADO;
	}



	public void setSECTOR_ASIGNADO(String sector_asignado) {
		this.todosLosAtributos.remove("SECTOR_ASIGNADO");
		this.todosLosAtributos.put("SECTOR_ASIGNADO", sector_asignado);
		this.SECTOR_ASIGNADO = sector_asignado;
	}



	public String getCOMENTARIO() {
		return COMENTARIO;
	}



	public void setCOMENTARIO(String comentario) {
		this.todosLosAtributos.remove("COMENTARIO");
		this.todosLosAtributos.put("COMENTARIO", comentario);
		
		COMENTARIO = comentario;
	}



	public String getLUGAR_FISICO_REAL() {
		return LUGAR_FISICO_REAL;
	}



	public void setLUGAR_FISICO_REAL(String lugar_fisico_real) {
		this.todosLosAtributos.remove("LUGAR_FISICO_REAL");
		this.todosLosAtributos.put("LUGAR_FISICO_REAL", lugar_fisico_real);
		LUGAR_FISICO_REAL = lugar_fisico_real;
	}



	public String getESDUAL() {
		return ESDUAL;
	}



	public void setESDUAL(String ESDUAL) {
		this.todosLosAtributos.remove("ESDUAL");
		this.todosLosAtributos.put("ESDUAL", ESDUAL);
		
		this.ESDUAL = ESDUAL;
	}



	public String getGARANTIA_EXTENDIDA_HASTA() {
		return GARANTIA_EXTENDIDA_HASTA;
	}



	public void setGARANTIA_EXTENDIDA_HASTA(String garantia_extendida_hasta) {
		this.todosLosAtributos.remove("GARANTIA_EXTENDIDA_HASTA");
		this.todosLosAtributos.put("GARANTIA_EXTENDIDA_HASTA", garantia_extendida_hasta);
		
		GARANTIA_EXTENDIDA_HASTA = garantia_extendida_hasta;
	}



	public HashMap<Object, Object> getTodosLosAtributos() {
		return todosLosAtributos;
	}



	public void setTodosLosAtributos(HashMap<Object, Object> todosLosAtributos) {
		this.todosLosAtributos = todosLosAtributos;
	}



	
	public String identificadorUnico() {
		
		return this.serial;
	}

	
	public HashMap<Object, Object> todosLosAtributos() {
		
		return todosLosAtributos;
	}

}
