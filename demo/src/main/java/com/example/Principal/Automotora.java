package com.example.Principal;

import java.util.ArrayList;
import java.util.List;

import Datos.GestorDatos;

public class Automotora {
    private List<Vehiculo> vehiculos;
	private GestorDatos _gestorDatos;

	    public Automotora() {
        this.vehiculos = new ArrayList<>();
    }

	public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo agregado: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
    }

	public Vehiculo listarVehiculos() {
		if (vehiculos.isEmpty()) {
			System.out.println("No hay vehiculos registrados");
		} else {
			for (Vehiculo vehiculo : vehiculos){
                System.out.println("Marca: " + vehiculo.getMarca() + " Modelo:" + vehiculo.getModelo());
			}
		}
	
	}

	public void motrarDetallesVehiculos() {
		if (vehiculos.isEmpty()) {
			System.out.println("No hay vehiculos registrados");
		} else {
			for (Vehiculo vehiculo : vehiculos){
			vehiculo.mostrarDetalles();
			}
		}
	
	}

	public void cargarVehiculosDesdeJSON(String archivo) {
		GestorDeDatos gestor = new GestorDeDatos();
        List<Vehiculo> vehiculosCargados = gestor.leerVehiculosDesdeJSON(archivo);
        vehiculos.addAll(vehiculosCargados);
	}

	public void guardarVehiculosEnJSON(String archivo) {
		GestorDeDatos gestor = new GestorDeDatos();
        gestor.guardarVehiculosEnJSON(vehiculos, archivo);
	}
}