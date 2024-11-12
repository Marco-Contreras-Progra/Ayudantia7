package com.example.Principal;

import java.util.ArrayList;
import java.util.List;

import com.example.Datos.GestorDatos;

public class Automotora {
    private List<Vehiculo> vehiculos;
	private GestorDatos gestorDatos;

	    public Automotora() {
        this.vehiculos = new ArrayList<>();
    }

	public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo agregado: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
    }

	public void listarVehiculos() {
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
        List<Vehiculo> vehiculosCargados = gestorDatos.leerVehiculosDelJSON(archivo);
        if (vehiculosCargados != null) {
            vehiculos.addAll(vehiculosCargados);
            System.out.println("Vehículos cargados desde el archivo: " + archivo);
        } else {
            System.out.println("No se pudieron cargar los vehículos desde el archivo.");
        }
    }

	public void guardarVehiculosEnJSON(String archivo) {
        gestorDatos.guardarVehiculosEnJSON(vehiculos, archivo);
        System.out.println("Vehículos guardados en el archivo: " + archivo);
    }

}