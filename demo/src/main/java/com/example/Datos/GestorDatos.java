package com.example.Datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.Principal.Automotora;
import com.example.Principal.Vehiculo;

public class GestorDatos {
	private Automotora automotora;

	public List<Vehiculo> leerVehiculosDelJSON(String archivo) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                Vehiculo vehiculo = parsearVehiculoDesdeJSON(linea);
                if (vehiculo != null) {
                    vehiculos.add(vehiculo);
                }
            }
            System.out.println("Vehículos cargados desde el archivo: " + archivo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
        }
        return vehiculos;
    }

	public void guardarVehiculosEnJSON(List<Vehiculo> vehiculos, String archivo) {
		        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Vehiculo vehiculo : vehiculos) {
                String json = convertirVehiculoAJSON(vehiculo);
                writer.write(json);
                writer.newLine();
            }
            System.out.println("Vehículos guardados en el archivo JSON: " + archivo);
        } catch (IOException e) {
            System.out.println("Error al guardar en el archivo JSON: " + e.getMessage());
        }
    }
	private String convertirVehiculoAJSON(Vehiculo vehiculo) {
        return "{" +
                "\"marca\":\"" + vehiculo.getMarca() + "\"," +
                "\"modelo\":\"" + vehiculo.getModelo() + "\"," +
                "\"año\":" + vehiculo.getAño() + "," +
                "\"precio\":" + vehiculo.getPrecio() +
                "}";
    }
	private Vehiculo parsearVehiculoDesdeJSON(String json) {
        try {
            String marca = json.split("\"marca\":\"")[1].split("\",")[0];
            String modelo = json.split("\"modelo\":\"")[1].split("\",")[0];
            int año = Integer.parseInt(json.split("\"año\":")[1].split(",")[0]);
            double precio = Double.parseDouble(json.split("\"precio\":")[1].split("}")[0]);

            return new Vehiculo(marca, modelo, año, precio);
        } catch (Exception e) {
            System.out.println("Error al parsear el JSON del vehículo: " + e.getMessage());
            return null;
        }
    }


}