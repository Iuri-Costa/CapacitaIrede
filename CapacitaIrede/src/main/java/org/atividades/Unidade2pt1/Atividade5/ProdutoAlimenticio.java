package org.atividades.Unidade2pt1.Atividade5;

import java.time.LocalDate;

public class ProdutoAlimenticio extends Produto {

    private LocalDate dataValidade;

    public ProdutoAlimenticio(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido() {
        System.out.println("o produto está vencido?");
        return LocalDate.now().isAfter(dataValidade);
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
