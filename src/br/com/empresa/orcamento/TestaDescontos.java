package br.com.empresa.orcamento;

public class TestaDescontos {
	public static void main(String[] args) {
		CalculadorDesconto calc = new CalculadorDesconto();
		Orcamento orcamento = new Orcamento(600.0);
		
		// Testando a primeira regra
		orcamento.adiciona(new Item("lapis", 250.0));
		orcamento.adiciona(new Item("caneta", 250.0));
		
		double descontoFinal = calc.calcula(orcamento);
		System.out.println(descontoFinal);
	}
}	
