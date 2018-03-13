package br.com.empresa.orcamento;

public class NotaFiscalDAO implements AcaoAposGerarNota{
	
	public void executa(NotaFiscal nf) {
		System.out.println("salvo no banco");
	}
}
