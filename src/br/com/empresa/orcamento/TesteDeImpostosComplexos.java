package br.com.empresa.orcamento;

public class TesteDeImpostosComplexos {
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto impostoComposto = new ISS(new ICMS()); // Imposto Complexo
		Orcamento orcamento = new Orcamento(500.0);
		
		double valor = impostoComposto.calcula(orcamento);
		System.out.println(valor);
	}
}
