package com.romelapj.platzimarket.persistence;

import com.romelapj.platzimarket.persistence.crud.ProductoCrudRepository;
import com.romelapj.platzimarket.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria) {
        return (List<Producto>) productoCrudRepository.findByIdCategoriaOOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAAndEstado(cantidad, true);
    }
}
