package com.example.ms_productos.Control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_productos.Modelo.Productos;
import com.example.ms_productos.repository.ProductosRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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
        return datos.obtenerTodos();
    }
    @GetMapping("path")
    public Productos getMethodName(@RequestParam int id) {
        return datos.buscarporId(id);
    }
    @GetMapping("/id")
    public ResponseEntity<Productos> buscarProducto(@PathVariable int id){
        Productos productoencontrado = datos.buscarporId(id);
        if (productoencontrado != null){
            return ResponseEntity.ok(productoencontrado);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/post")
    public ResponseEntity<?> crearProducto(@RequestBody Productos entity) {
        //TODO: process POST request
        
        return ;
    }
    

    
    
    
    
    
    
    

}
