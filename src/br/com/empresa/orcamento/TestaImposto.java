package br.com.empresa.orcamento;

public class TestaImposto {
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorImpostos calc = new CalculadorImpostos();
		calc.realizaCalculo(orcamento, iss);
		calc.realizaCalculo(orcamento, icms);
	}
}
