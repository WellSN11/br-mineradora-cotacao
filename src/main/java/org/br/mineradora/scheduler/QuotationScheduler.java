package org.br.mineradora.scheduler;

import io.quarkus.scheduler.Scheduled;
import org.br.mineradora.service.QuotationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;



@ApplicationScoped
public class QuotationScheduler {

    private final Logger LOG = LoggerFactory.getLogger(QuotationScheduler.class);

    private static final String TIME_ZONE = "America/Sao_Paulo";

    @Inject
    QuotationService quotationService;

    @Transactional
    @Scheduled(every = "35s", identity="task-job")
    void schedule(){
        LOG.info("-- Executando scheduler --");
        quotationService.getCurrencyPrice();
    }

    @Transactional
    @Scheduled(cron = "0 21 16 * * ?")
    void cleanAllInformationDay(){
        LOG.info("-- Limpando banco de dados");
        quotationService.cleanAll();
    }

}
