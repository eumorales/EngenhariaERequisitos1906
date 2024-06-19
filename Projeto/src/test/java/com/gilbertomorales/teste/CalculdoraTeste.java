package com.gilbertomorales.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTeste {

    // Soma

    @Test
    void somaDois() {
        var calculadora = new Calculdora();
        calculadora.setX(2);
        calculadora.setY(2);
        assertEquals(4, calculadora.soma());
    }

    @Test
    void somaDoisPontoCinco() {
        var calculadora = new Calculdora();
        calculadora.setX(2.5f);
        calculadora.setY(2.5f);
        assertEquals(5.0f, calculadora.soma());
    }

    @Test
    void somaDoisEMenosCinco() {
        var calculadora = new Calculdora();
        calculadora.setX(2);
        calculadora.setY(-5);
        assertEquals(-3, calculadora.soma());
    }

    @Test
    void somaDezEDoisPontoCinco() {
        var calculadora = new Calculdora();
        calculadora.setX(10);
        calculadora.setY(2.5f);
        assertEquals(12.5f, calculadora.soma());
    }

    // Subtração

    @Test
    void subtracaoDoisEMenosTres() {
        var calculadora = new Calculdora();
        calculadora.setX(2);
        calculadora.setY(3);
        assertEquals(-1, calculadora.sub());
    }

    @Test
    void subtracaoDoisEDoisPontoCinco() {
        var calculadora = new Calculdora();
        calculadora.setX(2);
        calculadora.setY(2.5f);
        assertEquals(-0.5f, calculadora.sub());
    }

    @Test
    void subtracaoCincoPontoDoisEDoisPontoDois() {
        var calculadora = new Calculdora();
        calculadora.setX(5.2f);
        calculadora.setY(2.2f);
        assertEquals(3.0f, calculadora.sub());
    }

    @Test
    void subtracaoMenosTresEMenosDois() {
        var calculadora = new Calculdora();
        calculadora.setX(-3);
        calculadora.setY(-2);
        assertEquals(-1, calculadora.sub());
    }

    // Divisão

    @Test
    void divisaoQuatroEDois() {
        var calculadora = new Calculdora();
        calculadora.setX(4);
        calculadora.setY(2);
        assertEquals(2.0f, calculadora.div());
    }

    @Test
    void divisaoCincoEDois() {
        var calculadora = new Calculdora();
        calculadora.setX(5);
        calculadora.setY(2);
        assertEquals(2.5f, calculadora.div());
    }

    @Test
    void divisaoNoveETres() {
        var calculadora = new Calculdora();
        calculadora.setX(9);
        calculadora.setY(3);
        assertEquals(3.0f, calculadora.div());
    }

    @Test
    void divisaoDezEZero() {
        var calculadora = new Calculdora();
        calculadora.setX(10);
        calculadora.setY(0);
        assertEquals(Float.NaN, calculadora.div());
    }

    // Multiplicação

    @Test
    void multiplicacaoDoisESeis() {
        var calculadora = new Calculdora();
        calculadora.setX(2);
        calculadora.setY(6);
        assertEquals(12.0f, calculadora.mult());
    }

    @Test
    void multiplicacaoTresEMenosTres() {
        var calculadora = new Calculdora();
        calculadora.setX(3);
        calculadora.setY(-3);
        assertEquals(-9.0f, calculadora.mult());
    }

    @Test
    void multiplicacaoDoisEDoisPontoCinco() {
        var calculadora = new Calculdora();
        calculadora.setX(2);
        calculadora.setY(2.5f);
        assertEquals(5.0f, calculadora.mult());
    }

    @Test
    void multiplicacaoTresETresPontoTres() {
        var calculadora = new Calculdora();
        calculadora.setX(3);
        calculadora.setY(3.3f);
        assertEquals(9.9f, calculadora.mult());
    }

    // Raiz

    @Test
    void raizDeNove() {
        var calculadora = new Calculdora();
        calculadora.setX(9);
        assertEquals(3.0, calculadora.raiz());
    }

    @Test
    void raizDeDoze() {
        var calculadora = new Calculdora();
        calculadora.setX(12);
        assertEquals(Math.sqrt(12), calculadora.raiz());
    }

    @Test
    void raizDeMenosDez() {
        var calculadora = new Calculdora();
        calculadora.setX(-10);
        assertEquals(Double.NaN, calculadora.raiz());
    }

    @Test
    void raizDeTres() {
        var calculadora = new Calculdora();
        calculadora.setX(3);
        assertEquals(Math.sqrt(3), calculadora.raiz());
    }

    // Potência

    @Test
    void potenciaTresEDois() {
        var calculadora = new Calculdora();
        calculadora.setX(3);
        calculadora.setY(2);
        assertEquals(9.0, calculadora.potencia());
    }

    @Test
    void potenciaTresEMenosDois() {
        var calculadora = new Calculdora();
        calculadora.setX(3);
        calculadora.setY(-2);
        assertEquals(Math.pow(3, -2), calculadora.potencia());
    }

    @Test
    void potenciaNoveEPontoCinco() {
        var calculadora = new Calculdora();
        calculadora.setX(9);
        calculadora.setY(0.5f);
        assertEquals(Math.sqrt(9), calculadora.potencia());
    }

    @Test
    void potenciaNoveEZero() {
        var calculadora = new Calculdora();
        calculadora.setX(9);
        calculadora.setY(0);
        assertEquals(1.0, calculadora.potencia());
    }
}
