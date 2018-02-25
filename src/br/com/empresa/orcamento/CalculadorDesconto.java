package br.com.empresa.orcamento;

public class CalculadorDesconto {
	
	/* REGRAS DE APLICA��O DE DESCONTO 
	 * 
	 * - por mais de 5 itens na lista
	 * - por total do orcamento maior que 500
	 * */
	public double calcula(Orcamento orcamento){
		Desconto descontoPorMaisDeCincoItens = new DescontoPorMaisDeCincoItens();
		Desconto descontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
		Desconto semDesconto = new SemDesconto();
		
		/*
		 * Chain of responsibility:
		 * Permitindo que v�rios objetos possam servir a uma mesma requisi��o e repassa-la ao proximo objeto caso n�o atenda
		 * 
		 * */
		descontoPorMaisDeCincoItens.setProximo(descontoPorMaisDeQuinhentosReais);
		descontoPorMaisDeQuinhentosReais.setProximo(semDesconto);
		
		return descontoPorMaisDeCincoItens.desconto(orcamento);
	}
}
