package br.senac.rn.exercclasse;

import java.nio.channels.Pipe;
import java.util.Vector;

public class Retangulo {

    public Double ladoA;
    public Double ladoB;
    public Double area;
    public Double perimetro;
    public final Double PISO = 0.2025;
    public Double qtdsPiso;
    public final Double PISOP = 0.90;
    public Double qtdsRodape;

    public Double medePiso() {

        qtdsPiso = (area / PISO);
        qtdsPiso = qtdsPiso + (qtdsPiso * 0.1);
        return qtdsPiso;

    }

    public Double medePerimetro(){

        qtdsRodape = (PISO/PISOP)*100;
        return qtdsRodape;
    }


    public void mudarValorLado(Double novoLadoA, Double novoLaboB) {

        ladoA = novoLadoA;
        ladoB = novoLaboB;

    }

    public Vector mostraValorLados() {

        Vector lados = new Vector();
        lados.add(ladoA);
        lados.add(ladoB);

        return lados;
    }

    /*
    Soluções pra mostrarValorLado:

    public Double mostraValorLadoA(){
        return ladoA;
    }

    public Double mostraValorLadoB(){
        return ladoB;
    }

    */


    public Double calculaArea() {

        area = ladoA * ladoB;
        return area;
    }

    public Double calculaPerimetro() {

        perimetro = 2 * (ladoA + ladoB);
        return perimetro;
    }

}
