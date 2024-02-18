package com.devinpharmacy.labvaccine.excecoes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ExcecaoCpfDuplicado extends RuntimeException {

    public ExcecaoCpfDuplicado(String message) {
        super(message);
    }
}
