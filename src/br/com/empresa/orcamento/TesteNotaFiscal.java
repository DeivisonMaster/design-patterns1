package br.com.empresa.orcamento;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class TesteNotaFiscal {
	public static void main(String[] args) {
//		List<ItemDaNota> itens = Arrays.asList(new ItemDaNota("item 1", 200.0), new ItemDaNota("item 2", 400.0));
//		
//		double valorTotal = 0;
//		for(ItemDaNota item : itens){
//			valorTotal += item.getValor();
//		}
//		
//		double impostos = valorTotal * 0.05;
//		
//		NotaFiscal nf = new NotaFiscal("razao social", "cnpj", Calendar.getInstance(), valorTotal, impostos, itens, "obs");
//	
		
		CriadorNotaFiscal criador = new CriadorNotaFiscal();
		criador.paraEmpresa("brasil cards");
		criador.comCnpj("000.111.222/0000-1");
		criador.comItem(new ItemDaNota("item 1", 200.0));
		criador.comItem(new ItemDaNota("item 2", 300.0));
		criador.comItem(new ItemDaNota("item 3", 400.0));
		criador.comDataAtual();
		criador.comObservacoes("teste");
		
		NotaFiscal nf = criador.constroi();
		System.out.println(nf);
				
	}
}
