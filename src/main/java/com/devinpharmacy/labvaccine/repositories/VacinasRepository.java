package com.devinpharmacy.labvaccine.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devinpharmacy.labvaccine.models.Vacinas;

public interface VacinasRepository extends JpaRepository<Vacinas, Long> {
}
