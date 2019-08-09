package br.senac.rn.exercclasse.teste;

import br.senac.rn.exercclasse.Pessoa;

public class TestePessoa extends Pessoa {

    public static void main(String[] args) {


        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Mateus";
        pessoa.idade = 18;
        pessoa.peso = 80.0;
        pessoa.altura = 1.74;

        pessoa.envenlhecer(8);

        System.out.println("Idade: " + pessoa.novaIdade + "\n" + "Altura: " + pessoa.altura);



    }


}
