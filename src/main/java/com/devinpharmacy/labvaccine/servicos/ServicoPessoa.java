package com.devinpharmacy.labvaccine.servicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devinpharmacy.labvaccine.entidades.Pessoa;
import com.devinpharmacy.labvaccine.repositorios.RepositorioPessoa;

import java.util.List;

@Service
public class ServicoPessoa {

    @Autowired
    private RepositorioPessoa repositorioPessoa;

    public Pessoa findById(Long id) {
        return repositorioPessoa.findById(id).orElse(null);
    }

    public Pessoa findByCpf(String cpf) {
        return repositorioPessoa.findByCpf(cpf);
    }

    public List<Pessoa> findAll() {
        return repositorioPessoa.findAll();
    }

    public Pessoa save(Pessoa pessoa) {
        return repositorioPessoa.save(pessoa);
    }

    public Pessoa update(Long id, Pessoa pessoaDetails) {
        Pessoa pessoa = findById(id);
        if (pessoa != null) {
            pessoa.setNomeCompleto(pessoaDetails.getNomeCompleto());
            pessoa.setGenero(pessoaDetails.getGenero());
            pessoa.setDataNascimento(pessoaDetails.getDataNascimento());
            pessoa.setRg(pessoaDetails.getRg());
            pessoa.setEstadoCivil(pessoaDetails.getEstadoCivil());
            pessoa.setTelefone(pessoaDetails.getTelefone());
            pessoa.setEmail(pessoaDetails.getEmail());
            pessoa.setNaturalidade(pessoaDetails.getNaturalidade());
            return repositorioPessoa.save(pessoa);
        }
        return null;
    }

    public void delete(Long id) {
        repositorioPessoa.deleteById(id);
    }
}
