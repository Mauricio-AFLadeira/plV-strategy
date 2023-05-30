package org.example;

public class OperacaoPix implements Operacao{
    public String parcelar(float valor, float parcela) {
        if (parcela == 0) {
            throw new IllegalArgumentException("Divisão por zero");
        } else {
            return (int) parcela + " parcelas de " + (int) (valor / parcela) + " no pix";
        }
    }
}
