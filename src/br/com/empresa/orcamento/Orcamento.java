package br.com.empresa.orcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	protected double valor;
	private List<Item>	itens;
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();  // estado inicial de um orçamento
	}
	
	public double getValor() {
		return valor;
	}
	
	public void adiciona(Item item){
		this.itens.add(item); 
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	/* Recebendo o estado atual e repassando */
	public void aprova(){
		estadoAtual.aprova(this);
	}
	
	public void reprova(){
		estadoAtual.aprova(this);
	}
	
	public void finaliza(){
		estadoAtual.finaliza(this);
	}
	
	
	
	
	
}
