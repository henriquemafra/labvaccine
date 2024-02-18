package com.devinpharmacy.labvaccine.controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.devinpharmacy.labvaccine.entidades.Usuario;
import com.devinpharmacy.labvaccine.excecoes.ExcecaoBadRequest;
import com.devinpharmacy.labvaccine.excecoes.ExcecaoRecursoNaoEncontrado;
import com.devinpharmacy.labvaccine.servicos.ServicoUsuario;

@RestController
@RequestMapping("/api/usuarios")
public class ControladorUsuario {

    @Autowired
    private ServicoUsuario servicoUsuario;

    @PostMapping
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        Usuario newUsuario = servicoUsuario.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUsuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuarioDetails) {
        Usuario updatedUsuario = servicoUsuario.atualizarUsuario(id, usuarioDetails);
        if (updatedUsuario != null) {
            return ResponseEntity.ok(updatedUsuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}/senha")
    public ResponseEntity<Usuario> atualizarSenhaUsuario(@PathVariable Long id, @RequestBody String novaSenha) {
        try {
            Usuario usuarioAtualizado = servicoUsuario.atualizarSenhaUsuario(id, novaSenha);
            return ResponseEntity.ok(usuarioAtualizado);
        } catch (ExcecaoRecursoNaoEncontrado e) {
            return ResponseEntity.notFound().build();
        } catch (ExcecaoBadRequest e) {
            return ResponseEntity.badRequest().body(new Usuario());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        servicoUsuario.delete(id);
        return ResponseEntity.noContent().build();
    }
}
