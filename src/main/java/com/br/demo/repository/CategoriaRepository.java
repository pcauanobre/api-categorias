package com.br.demo.repository;

import com.br.demo.model.Categoria;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoriaRepository {

    private List<Categoria> categorias = new ArrayList<>();
    private Long idCounter = 1L;

    public void AdicionarCategoria(Categoria categoria) {
        categoria.setId(idCounter++);
        categorias.add(categoria);
    }

    public Categoria BuscarCategoriaID(Long id) {
        for (int i = 0; i < categorias.size(); i++) {
            if (categorias.get(i).getId().equals(id)) {
                return categorias.get(i);
            }
        }
        return null;
    }

    public List<Categoria> ListarCategoria() {
        return new ArrayList<>(categorias);
    }

    public void AtualizarCategoria(Long id, Categoria novaCategoria) {
        for (int i = 0; i < categorias.size(); i++) {
            if (categorias.get(i).getId().equals(id)) {
                novaCategoria.setId(id);
                categorias.set(i, novaCategoria);
                return;
            }
        }
        System.out.println("Categoria com ID " + id + " não encontrada.");
    }

    public void RemoverCategoria(Long id) {
        boolean removido = categorias.removeIf(cat -> cat.getId().equals(id));
        if (removido) {
            System.out.println("Categoria com ID " + id + " removida.");
        } else {
            System.out.println("Categoria com ID " + id + " não encontrada.");
        }
    }
}
