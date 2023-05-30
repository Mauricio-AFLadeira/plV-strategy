package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveParcelarPixCliente() {
        Cliente cliente = new Cliente();
        cliente.parcelarPix(80.0f, 2);
        assertEquals("2 parcelas de 40 no pix", cliente.getValorCompra());
    }

    @Test
    void deveParcelarBoletoCliente() {
        Cliente cliente = new Cliente();
        cliente.parcelarBoleto(80.0f, 1);
        assertEquals("1 parcelas de 80 no boleto", cliente.getValorCompra());
    }

    @Test
    void deveParcelarCartaoCliente() {
        Cliente cliente = new Cliente();
        cliente.parcelarCartao(100.0f, 2);
        assertEquals("2 parcelas de 50 no cartão", cliente.getValorCompra());
    }

    @Test
    void naoDeveParcelarValorClientePorZeroCartao() {
        try {
            Cliente cliente = new Cliente();
            cliente.parcelarCartao(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }
    @Test
    void naoDeveParcelarValorClientePorZeroBoleto() {
        try {
            Cliente cliente = new Cliente();
            cliente.parcelarBoleto(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }
    @Test
    void naoDeveParcelarValorClientePorZeroPix() {
        try {
            Cliente cliente = new Cliente();
            cliente.parcelarPix(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }
}