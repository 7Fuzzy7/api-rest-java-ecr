package com.fiap.ecr.api.repository;
import com.fiap.ecr.api.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}