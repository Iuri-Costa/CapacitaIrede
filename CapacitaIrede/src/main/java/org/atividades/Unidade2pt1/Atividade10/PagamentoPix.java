package org.atividades.Unidade2pt1.Atividade10;

public class PagamentoPix extends Pagamento{
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento via pix: R$"+valor);
    }

}
