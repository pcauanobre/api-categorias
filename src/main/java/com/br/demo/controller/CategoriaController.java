package com.br.demo.controller;

import com.br.demo.dto.CategoriaDTO;
import com.br.demo.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias") // 🚀 Define o caminho base da API
public class CategoriaController {

    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @PostMapping
    public CategoriaDTO criarCategoria(@RequestBody CategoriaDTO dto) {
        return service.criarCategoria(dto);
    }

    @GetMapping
    public List<CategoriaDTO> listarCategorias() {
        return service.listarCategorias();
    }

    @GetMapping("/{id}")
    public CategoriaDTO buscarCategoria(@PathVariable Long id) {
        return service.buscarCategoriaPorID(id);
    }

    @PutMapping("/{id}")
    public CategoriaDTO atualizarCategoria(@PathVariable Long id, @RequestBody CategoriaDTO dto) {
        return service.atualizarCategoria(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletarCategoria(@PathVariable Long id) {
        service.deletarCategoria(id);
    }
}
