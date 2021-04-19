package com.br.zup.LeadCollector.DTOs.usuario;

import javax.validation.constraints.Email;

public class UsuarioDTO {

    @Email(message = "{validacao.email_invalido}")
    private String email;
}
