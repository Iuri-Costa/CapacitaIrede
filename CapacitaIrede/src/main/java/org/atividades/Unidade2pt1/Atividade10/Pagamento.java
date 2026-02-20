package org.atividades.Unidade2pt1.Atividade10;

public class Pagamento {
    // Crie uma classe Pagamento com um método processarPagamento(double
    //valor) que imprime "Processando pagamento genérico de R$ valor".
    //Crie duas subclasses:
    //• PagamentoCartao, que sobrescreve o método para imprimir "Pagamento com
    //cartão de crédito: R$ valor".
    //• PagamentoPix, que sobrescreve o método para imprimir "Pagamento via Pix: R$
    //valor".
    //No método main(), crie uma lista de Pagamento com instâncias das duas
    //subclasses e chame processarPagamento() em cada item.

    public void processarPagamento(double valor){
        System.out.println("processando pagamento de R$ "+valor);
    }
}
