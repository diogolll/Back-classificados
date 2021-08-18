package br.edu.femass.classificados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.femass.classificados.dao.CategoriaDao;
import br.edu.femass.classificados.model.Categoria;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaDao categoriaDao;

    @GetMapping("/")
    public List<Categoria> getCategorias() {
        return categoriaDao.findAll();
    }


}
