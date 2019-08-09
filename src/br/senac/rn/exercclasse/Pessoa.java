package br.senac.rn.exercclasse;


public class Pessoa {

    public String nome;
    public Integer idade;
    public Double peso;
    public Double altura;
    public Integer novaIdade;
    public Double novoPeso;
    public Double novaAltura;
    public Integer aux;

    public void envenlhecer(Integer qtdsEvenlhecida) {

        novaIdade = idade + qtdsEvenlhecida;

        if (novaIdade <= 21) {
            altura = (qtdsEvenlhecida * 0.005) + altura;

        } else {
            aux = 21 - idade;
            if (aux > 0) {
                altura = (aux * 0.005) + altura;
            }

        }
    }

    public void engordar(Double qtdsEngordada) {

        novoPeso = peso + qtdsEngordada;

    }

    public void emagrecer(Double qtdsEmagrecida) {

        novoPeso = peso - qtdsEmagrecida;


    }

    public void crescer(Double qtdsCresida) {

        novaAltura = altura + qtdsCresida;


    }


}
