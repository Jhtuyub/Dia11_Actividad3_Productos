package com.banregio.next.ejemplos.app.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banregio.next.ejemplos.app.domain.entity.Producto;

@Repository
public interface ProductoRepostory extends JpaRepository<Producto, Integer> {

}
