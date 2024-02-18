package com.devinpharmacy.labvaccine.servicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devinpharmacy.labvaccine.entidades.Usuario;
import com.devinpharmacy.labvaccine.excecoes.ExcecaoBadRequest;
import com.devinpharmacy.labvaccine.excecoes.ExcecaoCpfDuplicado;
import com.devinpharmacy.labvaccine.excecoes.ExcecaoRecursoNaoEncontrado;
import com.devinpharmacy.labvaccine.repositorios.RepositorioUsuario;

@Service
public class ServicoUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public Usuario findByCpf(String cpf) {
        return repositorioUsuario.findByCpf(cpf);
    }

    public Usuario save(Usuario usuario) {
        // Verifica se o CPF já está cadastrado
        if (repositorioUsuario.existsByCpf(usuario.getCpf())) {
            throw new ExcecaoCpfDuplicado("CPF já cadastrado");
        }
        
        // Verifica se todos os campos obrigatórios estão preenchidos
        if (usuario.getNomeCompleto() == null || usuario.getNomeCompleto().isEmpty() ||
            usuario.getGenero() == null || usuario.getGenero().isEmpty() ||
            usuario.getDataNascimento() == null ||
            usuario.getCpf() == null || usuario.getCpf().isEmpty() ||
            usuario.getRg() == null || usuario.getRg().isEmpty() ||
            usuario.getEstadoCivil() == null || usuario.getEstadoCivil().isEmpty() ||
            usuario.getTelefone() == null || usuario.getTelefone().isEmpty() ||
            usuario.getEmail() == null || usuario.getEmail().isEmpty() ||
            usuario.getNaturalidade() == null || usuario.getNaturalidade().isEmpty()) {
            throw new ExcecaoBadRequest("Todos os campos obrigatórios devem ser preenchidos");
        }

        return repositorioUsuario.save(usuario);
    }

    public Usuario atualizarUsuario(Long identificador, Usuario usuarioAtualizado) {
        // Verifica se o usuário existe pelo identificador
        Usuario usuarioExistente = repositorioUsuario.findById(identificador)
                .orElseThrow(() -> new ExcecaoRecursoNaoEncontrado("Usuário não encontrado"));
    
        // Verifica se CPF e RG foram alterados
        if (usuarioAtualizado.getCpf() != null && !usuarioExistente.getCpf().equals(usuarioAtualizado.getCpf()) ||
            usuarioAtualizado.getRg() != null && !usuarioExistente.getRg().equals(usuarioAtualizado.getRg())) {
            throw new ExcecaoBadRequest("CPF e RG não podem ser modificados");
        }
    
        // Verifica se todos os campos obrigatórios estão preenchidos
        if (usuarioAtualizado.getNomeCompleto() == null || usuarioAtualizado.getNomeCompleto().isEmpty() ||
            usuarioAtualizado.getGenero() == null || usuarioAtualizado.getGenero().isEmpty() ||
            usuarioAtualizado.getDataNascimento() == null ||
            usuarioAtualizado.getEstadoCivil() == null || usuarioAtualizado.getEstadoCivil().isEmpty() ||
            usuarioAtualizado.getTelefone() == null || usuarioAtualizado.getTelefone().isEmpty() ||
            usuarioAtualizado.getEmail() == null || usuarioAtualizado.getEmail().isEmpty() ||
            usuarioAtualizado.getNaturalidade() == null || usuarioAtualizado.getNaturalidade().isEmpty()) {
            throw new ExcecaoBadRequest("Todos os campos obrigatórios devem ser preenchidos");
        }
    
        // Atualiza os dados do usuário
        usuarioExistente.setNomeCompleto(usuarioAtualizado.getNomeCompleto());
        usuarioExistente.setGenero(usuarioAtualizado.getGenero());
        usuarioExistente.setDataNascimento(usuarioAtualizado.getDataNascimento());
        usuarioExistente.setEstadoCivil(usuarioAtualizado.getEstadoCivil());
        usuarioExistente.setTelefone(usuarioAtualizado.getTelefone());
        usuarioExistente.setEmail(usuarioAtualizado.getEmail());
        usuarioExistente.setNaturalidade(usuarioAtualizado.getNaturalidade());
    
        // Salva as alterações no banco de dados
        return repositorioUsuario.save(usuarioExistente);
    }

    public Usuario atualizarSenhaUsuario(Long id, String novaSenha) {
        // Verifica se o usuário existe pelo identificador
        Usuario usuarioExistente = repositorioUsuario.findById(id)
                .orElseThrow(() -> new ExcecaoRecursoNaoEncontrado("Usuário não encontrado"));

        // Validação da senha
        if (novaSenha == null || novaSenha.isEmpty()) {
            throw new ExcecaoBadRequest("A senha não pode ser vazia");
        }

        // Atualiza a senha do usuário
        usuarioExistente.setSenha(novaSenha);

        // Salva as alterações no banco de dados
        return repositorioUsuario.save(usuarioExistente);
    }

    public void delete(Long id) {
        repositorioUsuario.deleteById(id);
    }
}
