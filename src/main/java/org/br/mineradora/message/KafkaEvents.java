package org.br.mineradora.message;

import org.br.mineradora.dto.QuotationDTO;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class KafkaEvents {
    private final Logger LOG = LoggerFactory.getLogger(KafkaEvents.class);

    @Channel("quotation-channel")//Canal que envia para um tópico Kafka
    Emitter<QuotationDTO> quotationDTOEmitter;

    public void sendNewKafkaEvent(QuotationDTO quotationDTO){

        LOG.info("-- Enviando Cotação para o Tópico Kafka --");
        quotationDTOEmitter.send(quotationDTO).toCompletableFuture().join();
        //o método toCompletableFuture faz com que nossa aplicação não fique esperando infinitamente alguma outra resposta
    }


}



