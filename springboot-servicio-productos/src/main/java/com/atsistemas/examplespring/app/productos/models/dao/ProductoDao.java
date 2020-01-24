package com.atsistemas.examplespring.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.atsistemas.examplespring.commons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
