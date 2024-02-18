package com.devinpharmacy.labvaccine.excecoes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExcecaoBadRequest extends RuntimeException {

    public ExcecaoBadRequest(String message) {
        super(message);
    }
}
