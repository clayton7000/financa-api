/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.financa.demo.exception;

/**
 *
 * @author clayt
 */
public class EntradaSaidaException extends EntidadeNaoEncontradaException{
    
    private static final long serialVersionUID = 1L;

    public EntradaSaidaException(String mensagem) {
        super(mensagem);

    }

    public EntradaSaidaException(Integer id) {
        this(String.format("Não existe entrada ou saida cadastrado %d", id));
    }
    
}
