package com.farinia.desafioOpenAPi.service;

import com.farinia.desafioOpenAPi.model.Restaurante;
import com.farinia.desafioOpenAPi.repository.CiudadRepository;
import com.farinia.desafioOpenAPi.repository.RestauranteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class RestauranteService implements RestauranteServiceInterfaz{

    @Autowired
    private RestauranteRepository repository;
    @Autowired
    private CiudadRepository repository2;

    @Override
    public Restaurante createRestaurante(Restaurante restaurante) {
        repository2.save(restaurante.getCiudad());
        return repository.save(restaurante);
    }

    @Override
    public Restaurante getRestauranteById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Restaurante updateRestauranteById(Restaurante restaurante,Long id) {
        restaurante.setId(id);
        return repository.save(restaurante);
    }

    @Override
    public void deleteRestaurante(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Restaurante> findAll() {
        return (List<Restaurante>) repository.findAll();
    }
}
