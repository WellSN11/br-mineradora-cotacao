package org.br.mineradora.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.br.mineradora.entity.QuotationEntity;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped//Estamos dizendo que tudo aquilo que é relacionado ao Quarkus pode ser injetado
//dependências pois estamos contextualizando essa classe
public class QuotationRepository implements PanacheRepository<QuotationEntity> {
}
