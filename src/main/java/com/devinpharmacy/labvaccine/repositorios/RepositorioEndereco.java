package com.devinpharmacy.labvaccine.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devinpharmacy.labvaccine.entidades.Endereco;

@Repository
public interface RepositorioEndereco extends JpaRepository<Endereco, Long> {
}

