package com.sippulse.pet.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @NotNull(message = "Campo Nome é obrigatório.")
    private String nome;

    @NotNull(message = "Campo Login é obrigatório.")
    private String login;

    @NotNull(message = "Campo Senha é obrigatório.")
    private String senha;
}
