package br.com.empresa.orcamento;

public class Impressora implements AcaoAposGerarNota{
	
	public void imprime(NotaFiscal nf) {
	}

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("nota impressa");
	}

}
