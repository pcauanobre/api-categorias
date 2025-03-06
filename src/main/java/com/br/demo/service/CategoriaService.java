package com.br.demo.service;

import com.br.demo.dto.CategoriaDTO;
import com.br.demo.model.Categoria;
import com.br.demo.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public CategoriaDTO criarCategoria(CategoriaDTO dto) {
        if (dto.getNome() == null || dto.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da categoria não pode ser vazio");
        }

        Categoria categoria = new Categoria();
        categoria.setNome(dto.getNome());
        categoria.setDescricao(dto.getDescricao());

        repository.AdicionarCategoria(categoria);

        return toDTO(categoria);
    }

    public CategoriaDTO buscarCategoriaPorID(Long id) {
        Categoria categoria = repository.BuscarCategoriaID(id);
        if (categoria == null) {
            throw new RuntimeException("Categoria com ID " + id + " não encontrada.");
        }
        return toDTO(categoria);
    }

    public List<CategoriaDTO> listarCategorias() {
        return repository.ListarCategoria().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public CategoriaDTO atualizarCategoria(Long id, CategoriaDTO dto) {
        Categoria categoria = repository.BuscarCategoriaID(id);
        if (categoria == null) {
            throw new RuntimeException("Categoria com ID " + id + " não encontrada.");
        }

        categoria.setNome(dto.getNome());
        categoria.setDescricao(dto.getDescricao());

        repository.AtualizarCategoria(id, categoria);

        return toDTO(categoria);
    }

    public void deletarCategoria(Long id) {
        Categoria categoria = repository.BuscarCategoriaID(id);
        if (categoria == null) {
            throw new RuntimeException("Categoria com ID " + id + " não encontrada para exclusão.");
        }
        repository.RemoverCategoria(id);
    }

    private CategoriaDTO toDTO(Categoria categoria) {
        return new CategoriaDTO(categoria.getId(), categoria.getNome(), categoria.getDescricao());
    }
}
