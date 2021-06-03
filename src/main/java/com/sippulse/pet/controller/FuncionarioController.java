package com.sippulse.pet.controller;

import com.sippulse.pet.entity.Funcionario;
import com.sippulse.pet.service.impl.FuncionarioServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioServiceImpl funcionarioService;

    @PostMapping
    public Funcionario create(@RequestBody Funcionario funcionario) {
        return funcionarioService.create(funcionario);
    }
}
