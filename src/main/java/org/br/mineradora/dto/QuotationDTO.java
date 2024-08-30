package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.util.Date;

@Jacksonized//Java para JSON e JSON para Java, ele faz o mapeamento
@Data
@Builder//Consigo criar um objeto com apenas os atributos que eu quero sem ter que criar um construtor
@AllArgsConstructor
public class QuotationDTO {

    private Date date;

    private BigDecimal currencyPrice;

}
