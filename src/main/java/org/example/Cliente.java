package org.example;

public class Cliente {
    private String  valorCompra;

    public String getValorCompra() {
        return valorCompra;
    }

    public void parcelarPix(float valor, float parcela) {
        Pagamento pagamento = new Pagamento(valor, parcela);
        this.valorCompra = pagamento.parcelar(new OperacaoPix());
    }
    public void parcelarCartao(float valor, float parcela) {
        Pagamento pagamento = new Pagamento(valor, parcela);
        this.valorCompra = pagamento.parcelar(new OperacaoCartao());
    }
    public void parcelarBoleto(float valor, float parcela) {
        Pagamento pagamento = new Pagamento(valor, parcela);
        this.valorCompra = pagamento.parcelar(new OperacaoBoleto());
    }
}
