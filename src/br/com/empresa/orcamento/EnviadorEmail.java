package br.com.empresa.orcamento;

public class EnviadorEmail implements AcaoAposGerarNota{
	
	public void executa(NotaFiscal nf) {
		System.out.println("enviado por Email");
	}
}
