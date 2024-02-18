package com.devinpharmacy.labvaccine.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devinpharmacy.labvaccine.entidades.Usuario;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
    // Método para buscar um usuário por CPF
    Usuario findByCpf(String cpf);
    boolean existsByCpf(String cpf);
}

