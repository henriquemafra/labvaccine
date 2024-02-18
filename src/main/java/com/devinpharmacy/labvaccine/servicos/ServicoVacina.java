package com.devinpharmacy.labvaccine.servicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devinpharmacy.labvaccine.entidades.Vacina;
import com.devinpharmacy.labvaccine.repositorios.RepositorioVacina;

@Service
public class ServicoVacina {

    @Autowired
    private RepositorioVacina repositorioVacina;

    public Vacina save(Vacina vacina) {
        return repositorioVacina.save(vacina);
    }

    public Vacina update(Long id, Vacina vacinaDetails) {
        Vacina vacina = repositorioVacina.findById(id).orElse(null);
        if (vacina != null) {
            vacina.setNome(vacinaDetails.getNome());
            vacina.setDataHoraAdministracao(vacinaDetails.getDataHoraAdministracao());
            vacina.setTipo(vacinaDetails.getTipo());
            vacina.setQuantidade(vacinaDetails.getQuantidade());
            vacina.setObservacoes(vacinaDetails.getObservacoes());
            vacina.setCliente(vacinaDetails.getCliente());
            vacina.setFarmaceutico(vacinaDetails.getFarmaceutico());
            return repositorioVacina.save(vacina);
        }
        return null;
    }

    public void delete(Long id) {
        repositorioVacina.deleteById(id);
    }
}

