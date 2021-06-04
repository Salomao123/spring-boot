package com.sippulse.pet.repository;

import com.sippulse.pet.entity.Funcionario;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Long> {
    Funcionario findByLogin(String login);
}
