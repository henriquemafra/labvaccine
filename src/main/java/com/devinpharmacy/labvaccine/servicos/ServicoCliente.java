package com.devinpharmacy.labvaccine.servicos;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devinpharmacy.labvaccine.entidades.Cliente;
import com.devinpharmacy.labvaccine.repositorios.RepositorioCliente;

@Service
public class ServicoCliente {

    @Autowired
    private RepositorioCliente repositorioCliente;

    public Cliente findByCpf(String cpf) {
        return repositorioCliente.findByCpf(cpf);
    }

    public Cliente save(Cliente cliente) {
        return repositorioCliente.save(cliente);
    }

    public Cliente update(Long id, Cliente clienteDetails) {
        Cliente cliente = repositorioCliente.findById(id).orElse(null);
        if (cliente != null) {
            cliente.setContatoEmergencia(clienteDetails.getContatoEmergencia());
            cliente.setAlergias(clienteDetails.getAlergias());
            cliente.setConvenio(clienteDetails.getConvenio());
            cliente.setNumeroCarteiraConvenio(clienteDetails.getNumeroCarteiraConvenio());
            cliente.setValidadeCarteiraConvenio(clienteDetails.getValidadeCarteiraConvenio());
            cliente.setEndereco(clienteDetails.getEndereco());
            return repositorioCliente.save(cliente);
        }
        return null;
    }

     public List<Cliente> listarClientes() {
        return repositorioCliente.findAll();
    }

    public Optional<Cliente> buscarClientePorId(Long id) {
        return repositorioCliente.findById(id);
    }

    public void delete(Long id) {
        repositorioCliente.deleteById(id);
    }
}
