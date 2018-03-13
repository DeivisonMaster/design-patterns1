package br.com.empresa.orcamento;

public class EnviadorSMS implements AcaoAposGerarNota{
	
	public void executa(NotaFiscal nf) {
		System.out.println("enviado por SMS");
	}
}
