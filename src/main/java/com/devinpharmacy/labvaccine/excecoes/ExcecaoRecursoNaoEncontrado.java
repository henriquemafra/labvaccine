package com.devinpharmacy.labvaccine.excecoes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExcecaoRecursoNaoEncontrado extends RuntimeException {

    public ExcecaoRecursoNaoEncontrado(String message) {
        super(message);
    }
}
