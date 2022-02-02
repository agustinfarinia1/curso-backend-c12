package com.farinia.desafioOpenAPi.controller;

import com.farinia.desafioOpenAPi.model.Restaurante;
import com.farinia.desafioOpenAPi.repository.RestauranteRepository;
import com.farinia.desafioOpenAPi.service.RestauranteServiceInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class OpenApiController {

    @Autowired
    private RestauranteServiceInterfaz repository;
    @GetMapping("/ej")
    public String getPrueba(){
        return "Prueba OpenApi";
    }
    @GetMapping("/")
    public List<Restaurante> getProductosAll(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Restaurante getProductosAll(@PathVariable Long id){
        return repository.getRestauranteById(id);
    }
    @PostMapping("/")
    public Restaurante createRestaurante(@RequestBody Restaurante restaurante){
        return repository.createRestaurante(restaurante);
    }
    @PutMapping("/{id}")
    public Restaurante updateRestaurante(@RequestBody Restaurante restaurante,@PathVariable Long id){
        return repository.updateRestauranteById(restaurante,id);
    }
    @DeleteMapping("/{id}")
    public void deleteRestaurante(@PathVariable Long id){
        repository.deleteRestaurante(id);
    }
}
