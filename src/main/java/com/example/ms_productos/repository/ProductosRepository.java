package com.example.ms_productos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ms_productos.Modelo.Productos;
@Repository
public class ProductosRepository {
    private List<Productos> listaproductos;
    public ProductosRepository(){
        listaproductos = new ArrayList<>();
        private int idGenerador = 1;
    }
    public void guardar(Productos p){
        listaproductos.add(p);
    }
    public List<Productos> mostrar(){
        return listaproductos;
    }
    public Productos buscarProducto(int id){
        for(Productos prod:listaproductos){
            if (prod.getId()== id){
                return prod;
            }
        }
        return null;
    }
    public Productos guardar(Productos prod) {
        producto.setId(idGenerador);
        idGenerador++;
        listaproductos.add(prod);
        return prod;
    }

}
