package br.edu.femass.classificados.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.femass.classificados.model.Categoria;

@Repository
public interface CategoriaDao extends JpaRepository<Categoria,Long>{
    
}
