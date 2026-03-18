package com.example.ms_productos.Modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Productos {

    private int id;
    private String nombre;
    private String descripcion;
    private int precio;
    private int stock;
    private String categoria; 

}
