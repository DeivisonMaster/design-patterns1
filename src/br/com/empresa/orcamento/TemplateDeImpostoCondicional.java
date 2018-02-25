package br.com.empresa.orcamento;

public abstract class TemplateDeImpostoCondicional implements Imposto {

	/*	Template Method
	 * 
	 *  Definição do esqueleto do algoritmo comum a classes que fazem operações semelhantes
	 *  Este design pattern permite que subclasses concretas redefinam os passos estruturados na super-classe
	 * 
	 * */
	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento);
		}else{
			return minimaTaxacao(orcamento);
		}
	}

	abstract double minimaTaxacao(Orcamento orcamento);

	abstract double maximaTaxacao(Orcamento orcamento);

	abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
