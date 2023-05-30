package org.example;

public class Pagamento {
    private  float valor;
    private float parcela;

    public Pagamento(float valor, float parcela) {
        this.parcela = parcela;
        this.valor = valor;
    }

    public String parcelar(Operacao operacao) {
        return operacao.parcelar(valor, parcela);
    }
}
