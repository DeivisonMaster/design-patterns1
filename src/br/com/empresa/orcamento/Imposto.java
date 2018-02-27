package br.com.empresa.orcamento;

public abstract class Imposto {
	protected Imposto outroImposto;
	
	public Imposto(){}
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	abstract double calcula(Orcamento orcamento);
	
	public double calculoOutroImposto(Orcamento orcamento) {
		if(outroImposto == null) return 0;
		return outroImposto.calcula(orcamento);
	}
}
