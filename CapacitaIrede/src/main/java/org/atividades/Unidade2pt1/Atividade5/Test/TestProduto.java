package org.atividades.Unidade2pt1.Atividade5.Test;

import org.atividades.Unidade2pt1.Atividade5.ProdutoAlimenticio;

import java.time.LocalDate;

public class TestProduto {
    public static void main(String[] args) {

        ProdutoAlimenticio produto = new ProdutoAlimenticio(
                LocalDate.of(2026, 2, 10)
        );

        System.out.println(produto.estaVencido());
    }
}
