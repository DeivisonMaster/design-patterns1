package br.com.empresa.orcamento;

public class TesteAcoes {
	public static void main(String[] args) {
		CriadorNotaFiscal criador = new CriadorNotaFiscal();
		
		criador.adicionaAcao(new EnviadorEmail());
		criador.adicionaAcao(new EnviadorSMS());
		criador.adicionaAcao(new NotaFiscalDAO());
		criador.adicionaAcao(new Impressora());
		
		
		criador.paraEmpresa("teste");
		criador.comCnpj("000.111.222/000-1");
		criador.comDataAtual();
		criador.comItem(new ItemDaNota("item 1", 100));
		
		NotaFiscal nf = criador.constroi();
		
		
		System.out.println(nf);
		
	}
}
