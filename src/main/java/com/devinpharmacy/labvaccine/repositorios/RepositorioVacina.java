package com.devinpharmacy.labvaccine.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devinpharmacy.labvaccine.entidades.Vacina;

@Repository
public interface RepositorioVacina extends JpaRepository<Vacina, Long> {
}
