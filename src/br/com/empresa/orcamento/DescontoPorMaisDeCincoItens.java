package br.com.empresa.orcamento;

public class DescontoPorMaisDeCincoItens implements Desconto{
	private Desconto proximo;

	@Override
	public double desconto(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5){
			return orcamento.getValor() * 0.1;
		}else{
			return this.proximo.desconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
