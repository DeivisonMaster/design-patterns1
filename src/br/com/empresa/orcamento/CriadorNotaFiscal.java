package br.com.empresa.orcamento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* DESIGN PATTERN BUILDER
 * 
 * - separar a construção de um objeto complexo de sua representação de modo que 
 *  o mesmo processo de construção possa criar diferentes representaçoes
 * */
public class CriadorNotaFiscal {
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> itens;
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar dataAtual;
	private List<AcaoAposGerarNota> todasAcoesSeremExecutadas;
	
	
	
	public CriadorNotaFiscal() {
		this.itens = new ArrayList<ItemDaNota>();
		this.todasAcoesSeremExecutadas = new ArrayList<AcaoAposGerarNota>();
	}
	
	public void adicionaAcao(AcaoAposGerarNota acao){
		this.todasAcoesSeremExecutadas.add(acao);
	}

	public void paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void comCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void comItem(ItemDaNota item){
		itens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
	}
	
	public void comObservacoes(String obs){
		this.observacoes = obs;
	}
	
	public void comDataAtual(){
		this.dataAtual = Calendar.getInstance();
	}
	
	
	// Criando a NF
	public NotaFiscal constroi(){
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataAtual, valorBruto, impostos, itens, observacoes);
		
		for(AcaoAposGerarNota acao : todasAcoesSeremExecutadas){
			acao.executa(nf);
		}
		return nf;
	}
	

	@Override
	public String toString() {
		return "Razao Social " + this.razaoSocial;
	}
	
}
