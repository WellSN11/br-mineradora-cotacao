package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

@Jacksonized//Java para JSON e JSON para Java, ele faz o mapeamento
@Data
@Builder//Consigo criar um objeto com apenas os atributos que eu quero sem ter que criar um construtor
@AllArgsConstructor
@NoArgsConstructor
public class USDBRL {

    public String code;
    public String codein;
    public String name;
    public String high;
    public String low;
    public String varBid;
    public String pctChange;
    public String bid;
    public String ask;
    public String timestamp;
    public String create_date;

}
