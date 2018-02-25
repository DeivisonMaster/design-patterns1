package br.com.empresa.orcamento;

public interface Desconto {

	double desconto(Orcamento orcamento);
	
	void setProximo(Desconto proximo);
}
