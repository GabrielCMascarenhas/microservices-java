package br.edu.atitus.currency_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "TypeCurrencyBC", url = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata")
public interface TypeCurrencyBCClient {

	@GetMapping("/Moedas?$format=json")
	TypeCurrencyBCResponse getAvailableCurrencies();
}
