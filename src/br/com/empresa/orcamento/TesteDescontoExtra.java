package br.com.empresa.orcamento;

public class TesteDescontoExtra {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		
		reforma.aplicaDescontoExtra();
		
		System.out.println(reforma.getValor());
		
		reforma.finaliza();
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
		
	}
}
