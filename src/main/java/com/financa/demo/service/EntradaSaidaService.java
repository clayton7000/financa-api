/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.financa.demo.service;

import com.financa.demo.model.EntradaSaida;
import com.financa.demo.repository.EntradaSaidaRepository;
import com.financa.demo.exception.EntradaSaidaException;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author clayt
 */
@Service
public class EntradaSaidaService {
    @Autowired
    private EntradaSaidaRepository repository;

    public List<EntradaSaida> getAll() {
        return repository.findAll();
    }

    public EntradaSaida getById(Integer id) {
        Optional<EntradaSaida> obj = repository.findById(id);
        return obj.orElseThrow(() -> new EntradaSaidaException(id));

    }

    public EntradaSaida getByAll(Integer id) {
        Optional<EntradaSaida> obj = repository.findById(id);
        return obj.orElseThrow(() -> new EntradaSaidaException(id));

    }

    @Transactional
    public EntradaSaida insert(EntradaSaida entradaSaida) {
        return repository.save(entradaSaida);
    }
    @Transactional
    public EntradaSaida update(Integer id, EntradaSaida entradaSaida) {
        EntradaSaida entradaSaidaAtual = getById(id);
        entradaSaidaAtual.setNome(entradaSaida.getNome());
        entradaSaidaAtual.setValor(entradaSaida.getValor());
        entradaSaidaAtual.setDescricao(entradaSaida.getDescricao());
        return repository.save(entradaSaida);
    }
    
    @Transactional
    public void delete(Integer id) {
        getById(id);
        repository.deleteById(id);
    }
}
