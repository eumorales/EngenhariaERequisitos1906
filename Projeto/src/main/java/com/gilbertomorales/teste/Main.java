package com.gilbertomorales.teste;

public class Main {
    public static void main(String[] args) {

        Calculdora c = new Calculdora();

        c.setX(2);
        c.setY(2);

        c.soma();
        c.sub();
        c.mult();
        c.div();
        c.raiz();
        c.potencia();

    }
}