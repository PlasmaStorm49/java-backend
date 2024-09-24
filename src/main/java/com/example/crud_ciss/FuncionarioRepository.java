package com.example.crud_ciss;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "funcionario", path = "funcionario")


public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Long>, CrudRepository<Funcionario, Long> {  
    List<Funcionario> findByID(@Param ("id") Long id);
}
