package com.devinpharmacy.labvaccine.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devinpharmacy.labvaccine.entidades.Cliente;

@Repository
public interface RepositorioCliente extends JpaRepository<Cliente, Long> {
    // Método para buscar um cliente por CPF
    Cliente findByCpf(String cpf);
}

