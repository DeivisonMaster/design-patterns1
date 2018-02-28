package br.com.empresa.orcamento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CriadorNotaFiscal {
	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> itens;
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar dataAtual;
	
	public CriadorNotaFiscal() {
		this.itens = new ArrayList<ItemDaNota>();
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
		return new NotaFiscal(razaoSocial, cnpj, dataAtual, valorBruto, impostos, itens, observacoes);
	}
	
	@Override
	public String toString() {
		return "Razao Social " + this.razaoSocial;
	}
	
}
