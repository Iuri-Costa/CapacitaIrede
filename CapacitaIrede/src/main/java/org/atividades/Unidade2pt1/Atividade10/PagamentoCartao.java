package org.atividades.Unidade2pt1.Atividade10;

public class PagamentoCartao extends Pagamento{
    @Override
    public void processarPagamento(double valor){
        double taxa = valor * 0.05;
        double valorComTaxa = valor - taxa;
        System.out.println("pagamento via Cartão: R$" + valorComTaxa);
    }
}
