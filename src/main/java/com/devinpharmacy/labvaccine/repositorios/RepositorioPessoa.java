package com.devinpharmacy.labvaccine.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devinpharmacy.labvaccine.entidades.Pessoa;

@Repository
public interface RepositorioPessoa extends JpaRepository<Pessoa, Long> {
    // Método para buscar uma pessoa por CPF
    Pessoa findByCpf(String cpf);
}

