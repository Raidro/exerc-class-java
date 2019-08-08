package br.senac.rn.exercclasse.teste;

import br.senac.rn.exercclasse.Quadrado;

public class TesteQuadrado extends Quadrado {

    public static void main(String[] args) {


        Quadrado quadrado = new Quadrado();

        quadrado.tamanhoDoLado= 1.5;

        System.out.println(quadrado.mostraValorLado());

        quadrado.mudaValorLado(5.0);

        System.out.println(quadrado.mostraValorLado());

    }
}
