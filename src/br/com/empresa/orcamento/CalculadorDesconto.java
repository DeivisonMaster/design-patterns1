package br.com.empresa.orcamento;

public class CalculadorDesconto {
	
	/* REGRAS DE APLICAÇÃO DE DESCONTO 
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
		 * Permitindo que vários objetos possam servir a uma mesma requisição e repassa-la ao proximo objeto caso não atenda
		 * 
		 * */
		descontoPorMaisDeCincoItens.setProximo(descontoPorMaisDeQuinhentosReais);
		descontoPorMaisDeQuinhentosReais.setProximo(semDesconto);
		
		return descontoPorMaisDeCincoItens.desconto(orcamento);
	}
}
