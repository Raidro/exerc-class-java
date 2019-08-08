package br.senac.rn.exercclasse.teste;

import br.senac.rn.exercclasse.Retangulo;

public class TesteRetangulo extends Retangulo {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();

        retangulo.ladoA = 5.0;
        retangulo.ladoB = 10.0;

        System.out.println("Lados: " + retangulo.mostraValorLados());

        retangulo.mudarValorLadoA(5.0);
        retangulo.mudarValorLadoB(5.0);


        System.out.println("Lados: " + retangulo.mostraValorLados());

        System.out.println("Area: " + retangulo.calculaArea());
        System.out.println("Perimetro: " + retangulo.calculaPerimetro());

        System.out.println("Quantidade de pisos necessarios: " + retangulo.medePiso());

        System.out.println("Quantidade de pisos necessarios:"+ retangulo.medePerimetro());


    }

}
