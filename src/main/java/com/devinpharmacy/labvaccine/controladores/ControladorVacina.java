package com.devinpharmacy.labvaccine.controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.devinpharmacy.labvaccine.entidades.Vacina;
import com.devinpharmacy.labvaccine.servicos.ServicoVacina;

@RestController
@RequestMapping("/api/vacinas")
public class ControladorVacina {

    @Autowired
    private ServicoVacina servicoVacina;

    @PostMapping
    public ResponseEntity<Vacina> createVacina(@RequestBody Vacina vacina) {
        Vacina newVacina = servicoVacina.save(vacina);
        return ResponseEntity.status(HttpStatus.CREATED).body(newVacina);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Vacina> updateVacina(@PathVariable Long id, @RequestBody Vacina vacinaDetails) {
        Vacina updatedVacina = servicoVacina.update(id, vacinaDetails);
        if (updatedVacina != null) {
            return ResponseEntity.ok(updatedVacina);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVacina(@PathVariable Long id) {
        servicoVacina.delete(id);
        return ResponseEntity.noContent().build();
    }
}
