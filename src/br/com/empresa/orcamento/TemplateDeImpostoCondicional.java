package br.com.empresa.orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	/*	Template Method
	 * 
	 *  Definição do esqueleto do algoritmo comum a classes que fazem operações semelhantes
	 *  Este design pattern permite que subclasses concretas redefinam os passos estruturados na super-classe
	 * 
	 * */
	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento) + calculoOutroImposto(orcamento);
		}else{
			return minimaTaxacao(orcamento) + calculoOutroImposto(orcamento);
		}
	}

	abstract double minimaTaxacao(Orcamento orcamento);

	abstract double maximaTaxacao(Orcamento orcamento);

	abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
