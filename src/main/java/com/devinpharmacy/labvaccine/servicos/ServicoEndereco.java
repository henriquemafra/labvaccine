package com.devinpharmacy.labvaccine.servicos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devinpharmacy.labvaccine.entidades.Endereco;
import com.devinpharmacy.labvaccine.repositorios.RepositorioEndereco;

@Service
public class ServicoEndereco {

    @Autowired
    private RepositorioEndereco repositorioEndereco;

    public Endereco save(Endereco endereco) {
        return repositorioEndereco.save(endereco);
    }

    public List<Endereco> listarEnderecos() {
        return repositorioEndereco.findAll();
    }
}

