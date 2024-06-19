package com.gilbertomorales.teste;

public class Calculdora {

    private float x;
    private float y;

    float resultado;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float soma() {
        resultado = x + y;
        System.out.println("Soma: " + resultado);
        return resultado;
    }

    public float sub() {
        resultado = x - y;
        System.out.println("Subtração: " + resultado);
        return resultado;
    }

    public float mult() {
        resultado = x * y;
        System.out.println("Multiplicação: " + resultado);
        return resultado;
    }

    public float div() {
        if (y != 0) {
            resultado = x / y;
            System.out.println("Divisão: " + resultado);
        } else {
            System.out.println("A divisão não pode ser por zero.");
            resultado = Float.NaN;
        }
        return resultado;
    }

    public double raiz() {
        double resultado;
        if (x >= 0) {
            resultado = Math.sqrt(x);
            System.out.println("Raiz quadrada de " + x + ": " + resultado);
        } else {
            System.out.println("Não é possível calcular raiz de um número negativo.");
            resultado = Double.NaN;
        }
        return resultado;
    }

    public double potencia() {
        double resultado = Math.pow(x, y);
        System.out.println(x + " elevado a " + y + ": " + resultado);
        return resultado;
    }
}
