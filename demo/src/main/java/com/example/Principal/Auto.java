package com.example.Principal;

public class Auto extends Vehiculo {
	private int numeroDePuertas;

	public Auto(String marca, String modelo, int año, double precio, String tipoBicicleta) {
        super(marca, modelo, año, precio);
        this.numeroDePuertas = numeroDePuertas;
	}

	public int getNumeroPuertas(){
		return numeroDePuertas;
	}
	public void setNumeroPuertas(int numeroDePuertas){
		this.numeroDePuertas = numeroDePuertas;
	}
	@Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + numeroDePuertas);
	}
	
}
