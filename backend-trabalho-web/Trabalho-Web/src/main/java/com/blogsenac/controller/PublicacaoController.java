package com.blogsenac.controller;

import com.blogsenac.dto.Publicacao;
import com.blogsenac.service.PublicacaoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")  // permite acesso do frontend
@RequestMapping("/publicacoes")
public class PublicacaoController {

    private final PublicacaoService service;

    public PublicacaoController(PublicacaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Publicacao> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Publicacao> buscar(@PathVariable Long id) {
        Publicacao p = service.buscarPorId(id);

        if (p == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(p);
    }

    @PostMapping
    public ResponseEntity<?> salvar(@Valid @RequestBody Publicacao p) {
        try {
            return ResponseEntity.ok(service.salvar(p));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao salvar.");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> alterar(@PathVariable Long id,
                                     @Valid @RequestBody Publicacao p) {

        Publicacao existente = service.buscarPorId(id);

        if (existente == null) {
            return ResponseEntity.notFound().build();
        }

        p.setId(id);

        try {
            return ResponseEntity.ok(service.salvar(p));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Erro ao salvar alteração.");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluir(@PathVariable Long id) {
        Publicacao existente = service.buscarPorId(id);

        if (existente == null) {
            return ResponseEntity.notFound().build();
        }

        service.excluir(id);
        return ResponseEntity.ok("Excluído com sucesso");
    }
}
