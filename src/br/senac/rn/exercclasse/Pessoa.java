package br.senac.rn.exercclasse;

public class Pessoa {

    public String nome;
    public Integer idade;
    public Double peso;
    public Double altura;
    public Integer novaIdade;
    public Double novoPeso;
    public Double novaAltura;
    public Double contador = 0.5;

    public Integer envenlhece(Integer qtdsEvenlhecida) {

        novaIdade = idade + qtdsEvenlhecida;
        return novaIdade;

    }

    public Double engorda(Double qtdsEngordada) {

        novoPeso = peso + qtdsEngordada;
        return novoPeso;
    }

    public Double emagrece(Double qtdsEmagrecida) {

        novoPeso = peso - qtdsEmagrecida;
        return novoPeso;

    }

    public Double cresce(Double qtdsCresida) {

        novaAltura = altura + qtdsCresida;
        return novaAltura;


    }


}
