package com.sippulse.pet.service.impl;

import com.sippulse.pet.entity.Funcionario;
import com.sippulse.pet.repository.FuncionarioRepository;
import com.sippulse.pet.service.interfaces.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Override
    public Funcionario create(Funcionario funcionario) {
        funcionario.setSenha(bCryptPasswordEncoder.encode(funcionario.getSenha()));
        return funcionarioRepository.save(funcionario);
    }
}
