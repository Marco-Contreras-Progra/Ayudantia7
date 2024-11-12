package com.example.Principal;

public class Bicicleta extends Vehiculo {
	private String tipoDeBicicleta;

	public Bicicleta(String marca, String modelo, int año, double precio, String tipoBicicleta) {
        super(marca, modelo, año, precio);
        this.tipoDeBicicleta = tipoDeBicicleta;
	}

	public String getTipoDeBicicleta(){
		return tipoDeBicicleta;
	}
	public void setTipoBicicleta(String tipoDeBicicleta){
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	@Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo de Bicicleta: " + tipoDeBicicleta);
	}
	

}