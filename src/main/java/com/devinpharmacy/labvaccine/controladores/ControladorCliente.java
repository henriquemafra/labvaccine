package com.devinpharmacy.labvaccine.controladores;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.devinpharmacy.labvaccine.entidades.Cliente;
import com.devinpharmacy.labvaccine.servicos.ServicoCliente;

@RestController
@RequestMapping("/api/clientes")
public class ControladorCliente {

    @Autowired
    private ServicoCliente servicoCliente;

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente newCliente = servicoCliente.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente clienteDetails) {
        Cliente updatedCliente = servicoCliente.update(id, clienteDetails);
        if (updatedCliente != null) {
            return ResponseEntity.ok(updatedCliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        servicoCliente.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes() {
        List<Cliente> clientes = servicoCliente.listarClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getClientePorIdentificador(@PathVariable Long id) {
        Optional<Cliente> clienteOptional = servicoCliente.buscarClientePorId(id);
        
        if (clienteOptional.isPresent()) {
            Cliente cliente = clienteOptional.get();
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não encontrado para o identificador fornecido.");
        }
    }
}

