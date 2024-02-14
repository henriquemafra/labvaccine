package com.devinpharmacy.labvaccine.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devinpharmacy.labvaccine.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
