package org.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcoes {
    Scanner sc = new Scanner(System.in);

    public int menu(){
        System.out.printf("Bem vindo ao cadastro de pessoas, digite um numero dentre as opções abaixo 🙂\n");
        System.out.printf("1 - Cadastrar pessoas 🧾\n2 - Procurar por pessoas 🔎\n3 - Sair 😭\n");
        return sc.nextInt();
    }

    public List<Pessoas> cadastra() {
        List<Pessoas> pessoas = new ArrayList<>();
        System.out.println("Digite quantas pessoas vai adicionar: ");
        int qntdPessoa = sc.nextInt();
        for (int x = 0; x < qntdPessoa; x++) {
            List<Enderecos> enderecos = new ArrayList<>();
            System.out.println("Digite o nome da pessoa " + (x+1));
            String nome = sc.next();
            System.out.println("Digite a idade da pessoa " + (x+1));
            int idade = sc.nextInt();
            System.out.println("Quantos endereços a pessoa vai ter ? ");
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
    public void procuraPessoas(List<Pessoas> pessoas){
        if(pessoas.isEmpty()){
            System.out.println("Cadastre uma pessoa antes... 🤒🤒");
        }else{
            System.out.print("Digite o nome da pessoa que quer procurar: ");
            String nome = sc.next();
            for(int i=0; i<pessoas.size(); i++){
                if(nome.equals(pessoas.get(i).getNome())){
                    System.out.println("Nome: " + pessoas.get(i).getNome());
                    System.out.println("Idade: " + pessoas.get(i).getIdade());

                    List<Enderecos> enderecos = pessoas.get(i).getEnderecos();
                    System.out.println("Endereços:");
                    for (Enderecos endereco : enderecos) {
                        System.out.println("- Rua: " + endereco.getRua() + ", Número: " + endereco.getNumero() + "\n");
                    }
                }else {
                    System.out.println("Não foi possivel encontrar essa pessoa!");
                }
            }
        }
    }
}
