package com.farinia.desafioOpenAPi.service;

import com.farinia.desafioOpenAPi.model.Restaurante;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface RestauranteServiceInterfaz {
    Restaurante createRestaurante(Restaurante restaurante);
    Restaurante getRestauranteById(Long id);
    Restaurante updateRestauranteById(Restaurante restaurante,Long id);
    void deleteRestaurante(Long id);
    List<Restaurante> findAll();
}
