package com.blogsenac.service;

import com.blogsenac.dto.Publicacao;
import com.blogsenac.repository.PublicacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacaoService {

    private final PublicacaoRepository repository;

    public PublicacaoService(PublicacaoRepository repository) {
        this.repository = repository;
    }

    public List<Publicacao> listarTodos() {
        return repository.findAll();
    }

    public Publicacao buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Publicacao salvar(Publicacao p) {
        return repository.save(p);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
