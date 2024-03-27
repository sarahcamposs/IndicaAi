package com.cagece.indicaai.indicaai.model.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cagece.indicaai.indicaai.model.entity.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

}
