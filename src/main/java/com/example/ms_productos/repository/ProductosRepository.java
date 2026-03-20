package com.example.ms_productos.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ms_productos.Modelo.Productos;
@Repository
public class ProductosRepository {
    private int idGenerador= 1;
    private List<Productos> listaproductos =new ArrayList<>();
    
    public List<Productos> obtenerTodos(){
        return listaproductos;
    }
    public Productos buscarporId(int id){
        for(Productos prod : listaproductos){
            if(prod.getId()==id){
                return prod;
            }
        }
        return null;
    }
    public Productos guardar(Productos p){
        p.setId(idGenerador);
        idGenerador++;
        listaproductos.add(p);
        return p;
    }
    public boolean eliminar(int id){
        for(int i=0;i<listaproductos.size();i++){
            if(listaproductos.get(i).getId()==id){
                listaproductos.remove(i);
                return true;
            }
        }
        return false;
    }
}
