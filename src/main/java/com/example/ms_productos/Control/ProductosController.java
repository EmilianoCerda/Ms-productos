package com.example.ms_productos.Control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_productos.Modelo.Productos;
import com.example.ms_productos.repository.ProductosRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/productos")
public class ProductosController {
    @Autowired
    private ProductosRepository datos;

    public ProductosController(){
        datos = new ProductosRepository();
    }

    @GetMapping("/test")
    public String test(){
        return new String("Hello World");
    }
    @GetMapping("/mostrar")
    public List<Productos> mostrarTodo(){
        return datos.mostrar();
    }
    
    
    

}
