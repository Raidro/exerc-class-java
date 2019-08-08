package br.senac.rn.exercclasse;

public class Quadrado {

    public Double tamanhoDoLado;
    public Double area;

    public void mudaValorLado(Double tamanhoNovo) {
        tamanhoDoLado = tamanhoNovo;
    }

    public Double mostraValorLado() {

        return tamanhoDoLado;
    }

    public Double calculaArea() {

        area = tamanhoDoLado * tamanhoDoLado;
        return area;
    }

}
