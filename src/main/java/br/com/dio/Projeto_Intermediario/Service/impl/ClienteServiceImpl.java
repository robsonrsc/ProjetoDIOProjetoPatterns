package br.com.dio.Projeto_Intermediario.Service.impl;

import br.com.dio.Projeto_Intermediario.Service.ClienteService;
import br.com.dio.Projeto_Intermediario.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {


    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarId(Long Id) {
        return null;
    }

    @Override
    public void Inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long Id, Cliente cliente) {

    }

    @Override
    public void deletar(Long Id) {

    }
}
