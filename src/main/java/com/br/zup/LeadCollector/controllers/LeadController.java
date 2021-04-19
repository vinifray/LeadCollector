package com.br.zup.LeadCollector.controllers;

import com.br.zup.LeadCollector.DTOs.lead.LeadCadastroDTO;
import com.br.zup.LeadCollector.models.Lead;
import com.br.zup.LeadCollector.servico.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/leads")
public class LeadController {

    @Autowired
    private LeadService leadService;

    @PostMapping("/")
    public Lead cadastrarLead(@RequestBody @Valid LeadCadastroDTO leadDTO){
        Lead lead = leadDTO.converterDTOParaModel();
        return leadService.cadastrarLead(lead);
    }

}
