package com.devinpharmacy.labvaccine.controladores;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.devinpharmacy.labvaccine.entidades.Endereco;
import com.devinpharmacy.labvaccine.servicos.ServicoEndereco;

@RestController
@RequestMapping("/api/enderecos")
public class ControladorEndereco {

    @Autowired
    private ServicoEndereco servicoEndereco;

    @PostMapping
    public ResponseEntity<Endereco> createEndereco(@RequestBody Endereco endereco) {
        Endereco newEndereco = servicoEndereco.save(endereco);
        return ResponseEntity.status(HttpStatus.CREATED).body(newEndereco);
    }
    @GetMapping
    public ResponseEntity<List<Endereco>> listarEnderecos() {
        List<Endereco> enderecos = servicoEndereco.listarEnderecos();
        return new ResponseEntity<>(enderecos, HttpStatus.OK);
    }
}

