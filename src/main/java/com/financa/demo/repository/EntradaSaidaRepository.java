/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.financa.demo.repository;

import com.financa.demo.model.EntradaSaida;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author clayt
 */
public interface EntradaSaidaRepository extends JpaRepository<EntradaSaida, Integer>{
    
}
