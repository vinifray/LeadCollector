package com.br.zup.LeadCollector.DTOs.lead;

import com.br.zup.LeadCollector.models.Lead;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


public class LeadCadastroDTO {

    @Email(message = "{validacao.email_invalido}")
    private String email;
    @NotBlank(message = "{validacao.primeiro_nome}")
    private String primeiroNome;
    private String ultimoNome;

    public LeadCadastroDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Lead converterDTOParaModel(){
        Lead lead = new Lead();
        lead.setEmail(this.email);
        lead.setNomeCompleto(this.primeiroNome + "" + this.ultimoNome);

        return lead;
    }
}
