package br.com.empresa.orcamento;

public class CalculadorImpostos {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto){
		double valorImposto = imposto.calcula(orcamento);
		
		System.out.println(valorImposto);
	}
}
