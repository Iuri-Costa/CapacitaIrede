package org.atividades.Unidade2pt1.Atividade10.Test;

import org.atividades.Unidade2pt1.Atividade10.Pagamento;
import org.atividades.Unidade2pt1.Atividade10.PagamentoCartao;
import org.atividades.Unidade2pt1.Atividade10.PagamentoPix;

public class PagamentoTest {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {new Pagamento(), new PagamentoCartao(), new PagamentoPix()};

        for (Pagamento p : pagamentos){
            p.processarPagamento(300);
        }

    }
}
