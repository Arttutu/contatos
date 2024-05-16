package br.com.fiap.contatos.dto;

import br.com.fiap.contatos.model.Contato;

import java.time.LocalDate;

public record ContatoCadastroDto     (
        Long id,
        String nome,
        String email,
        LocalDate dataNascimento
){

}
