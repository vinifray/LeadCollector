package com.br.zup.LeadCollector.repositories;

import com.br.zup.LeadCollector.models.Lead;
import org.springframework.data.repository.CrudRepository;

public interface LeadRepository extends CrudRepository<Lead, String> {
}
