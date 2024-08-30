package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Jacksonized//Java para JSON e JSON para Java, ele faz o mapeamento
@Data
//@Builder//Consigo criar um objeto com apenas os atributos que eu quero sem ter que criar um construtor
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyPriceDTO {

    public USDBRL USDBRL;
}
