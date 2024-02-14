package com.devinpharmacy.labvaccine.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.devinpharmacy.labvaccine.models.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
}
