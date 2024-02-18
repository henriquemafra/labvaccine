package com.devinpharmacy.labvaccine.controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.devinpharmacy.labvaccine.entidades.Pessoa;
import com.devinpharmacy.labvaccine.servicos.ServicoPessoa;

@RestController
@RequestMapping("/api/pessoas")
public class ControladorPessoa {

    @Autowired
    private ServicoPessoa servicoPessoa;

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> getPessoaById(@PathVariable Long id) {
        Pessoa pessoa = servicoPessoa.findById(id);
        if (pessoa != null) {
            return ResponseEntity.ok(pessoa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Pessoa> createPessoa(@RequestBody Pessoa pessoa) {
        Pessoa newPessoa = servicoPessoa.save(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(newPessoa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> updatePessoa(@PathVariable Long id, @RequestBody Pessoa pessoaDetails) {
        Pessoa updatedPessoa = servicoPessoa.update(id, pessoaDetails);
        if (updatedPessoa != null) {
            return ResponseEntity.ok(updatedPessoa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePessoa(@PathVariable Long id) {
        servicoPessoa.delete(id);
        return ResponseEntity.noContent().build();
    }

}
