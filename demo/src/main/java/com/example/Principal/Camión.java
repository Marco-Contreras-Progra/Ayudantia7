package com.example.Principal;

public class Camión extends Vehiculo {
	private String capacidadDeCarga;

	public Camión(String marca, String modelo, int año, double precio, String tipoBicicleta) {
        super(marca, modelo, año, precio);
        this.capacidadDeCarga = capacidadDeCarga;
	}

	public String getCapacidad(){
		return capacidadDeCarga;
	}
	public void setCapacidad(String capacidadDeCarga){
		this.capacidadDeCarga = capacidadDeCarga;
	}
	@Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Capacidad de carga:" + capacidadDeCarga);
	}
	

}