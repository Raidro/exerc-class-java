package br.senac.rn.exercclasse;

import java.nio.channels.Pipe;
import java.util.Vector;

public class Retangulo {

    public Double ladoA;
    public Double ladoB;
    public Double area;
    public Double perimetro;
    public final Double PISO = 0.2025; // valor constante de 45cm x 45cm *trabalei com tudo em metros*
    public Double qtdsPiso;
    public final Double PISOP = 0.45; // o dobro da largura, 45cm * 2
    public Double qtdsRodape;

    //posso criar 2 construtores um vazio e outro com os valores de ladoa e ladob.

    public Double medePiso() {

        qtdsPiso = (area / PISO);
        qtdsPiso = qtdsPiso + (qtdsPiso * 0.1);
        return qtdsPiso;

    }

    public Double medePerimetro() {

        qtdsRodape = (perimetro / PISOP);
        return qtdsRodape;
    }

    public void mudarValorLadoA(Double novoLadoA) {

        ladoA = novoLadoA;

    }

    public void mudarValorLadoB(Double novoLaboB) {

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
