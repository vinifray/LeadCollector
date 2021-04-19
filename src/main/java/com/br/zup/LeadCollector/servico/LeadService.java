package com.br.zup.LeadCollector.servico;

import com.br.zup.LeadCollector.configuracoes.ComponenteMenssagemValidacao;
import com.br.zup.LeadCollector.models.Lead;
import com.br.zup.LeadCollector.repositories.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class LeadService {

    @Autowired
    private LeadRepository leadRepository;

    public Lead cadastrarLead(Lead lead){
        lead.setDataCadastro(LocalDate.now());

        if(emailRepetido(lead.getEmail())){
            throw new RuntimeException("Email já cadastrado");
        }

        return leadRepository.save(lead);
    }

    public boolean emailRepetido(String email){
        return leadRepository.existsById(email);
    }
}
