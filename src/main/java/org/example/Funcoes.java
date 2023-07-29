package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcoes {
    public void menu(){

    }

    public List<Pessoas> cadastra() {
        List<Pessoas> pessoas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas pessoas vai adicionar: ");
        int qntdPessoa = sc.nextInt();
        for (int x = 0; x < qntdPessoa; x++) {
            List<Enderecos> enderecos = new ArrayList<>();
            System.out.println("Digite o nome da pessoa " + (x+1));
            String nome = sc.next();
            System.out.println("Digite a idade da pessoa " + (x+1));
            int idade = sc.nextInt();
            System.out.println("Quantos endereços a pessoa vai ter? ");
            int qntdEnd = sc.nextInt();
            for (int j = 0; j < qntdEnd; j++) {
                System.out.println("Endereço " + (j + 1));
                System.out.println("Digite a rua:");
                String rua = sc.next();
                System.out.println("Agora, o numero da casa:");
                int numero = sc.nextInt();
                enderecos.add(new Enderecos(rua, numero));
            }
            pessoas.add(new Pessoas(nome, idade, enderecos));
        }
        return pessoas;
    }

}
