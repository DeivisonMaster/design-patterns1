package br.com.empresa.orcamento;


/* STATE
 * 
 * Permitir a um objeto alterar o seu comportamento quando seu estado interno mudar.
 * 
 * */
public interface EstadoDeUmOrcamento {
	
	void aplicaDescontoExtra(Orcamento orcamento);
	
	void aprova(Orcamento orcamento);
	
	void reprova(Orcamento orcamento);
	
	void finaliza(Orcamento orcamento);
}
