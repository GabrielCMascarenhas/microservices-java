package br.edu.atitus.currency_service.clients;

import java.util.List;

public class TypeCurrencyBCResponse {

	private List<Values> value;

	public List<Values> getValue() {
		return value;
	}

	public void setValue(List<Values> value) {
		this.value = value;
	}

	public static class Values {
		private String typeCurrency;

		public String getTypeCurrency() {
			return typeCurrency;
		}

		public void setTypeCurrency(String typeCurrency) {
			this.typeCurrency = typeCurrency;
		}
	}

}
