package com.devinpharmacy.labvaccine.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devinpharmacy.labvaccine.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
