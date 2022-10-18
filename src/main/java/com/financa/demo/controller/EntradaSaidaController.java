/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.financa.demo.controller;

import com.financa.demo.model.EntradaSaida;
import com.financa.demo.repository.EntradaSaidaRepository;
import com.financa.demo.service.EntradaSaidaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author clayt
 */
@RestController
public class EntradaSaidaController {

    @Autowired
    private EntradaSaidaService service;

    @GetMapping
    public List<EntradaSaida> getAll() {
        return service.getAll();
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<EntradaSaida> getById(@PathVariable int id) {
        EntradaSaida entradaSaida = service.getById(id);
        return ResponseEntity.ok().body(entradaSaida);

    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EntradaSaida insert(@RequestBody EntradaSaida entradaSaida) {
        return service.insert(entradaSaida);
    }
    
    @PutMapping(value = "/{id}")
    public EntradaSaida update(@PathVariable int id, @RequestBody EntradaSaida entradaSaida) {
        return service.update(id, entradaSaida);
    }
    
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }    
}
