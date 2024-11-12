package com.example.Principal;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int año;
	private double precio;
	private Automotora locomotora;

	public Vehiculo(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

	public String getMarca(String marca){
		return marca;
	}
	public String getModelo(String modelo){
		return modelo;
	}
	public int getAño(int año){
		return año;
	}
	public Double getprecio(Double precio){
		return precio;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public void mostrarDetalles() {
		System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("año: " + año);
        System.out.println("precio " + precio);
    }
		
}