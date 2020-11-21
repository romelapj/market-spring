package com.romelapj.platzimarket.persistence.crud;

import com.romelapj.platzimarket.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoriaOOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAAndEstado(int cantidadStock, boolean estado);


}
