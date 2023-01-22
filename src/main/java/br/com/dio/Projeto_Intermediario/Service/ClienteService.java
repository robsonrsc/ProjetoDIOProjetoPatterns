package br.com.dio.Projeto_Intermediario.Service;

import br.com.dio.Projeto_Intermediario.model.Cliente;

public interface ClienteService {

    Iterable <Cliente> buscarTodos();

    Cliente buscarId (Long Id);

    void  Inserir (Cliente cliente);
    void atualizar (Long Id, Cliente cliente);
    void deletar (Long Id);

}
