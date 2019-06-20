package br.com.caelum.ingresso.model;

import java.time.YearMonth;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Cartao {
	
	@NotBlank
	private String numero;
	@NotNull
	private Integer cvv;
	@NotNull
	private YearMonth vencimento;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	public YearMonth getVencimento() {
		return vencimento;
	}
	public void setVencimento(YearMonth vencimento) {
		this.vencimento = vencimento;
	}
	
	public boolean isValido() {
		return vencimento.isAfter(YearMonth.now());
	}
	
}
