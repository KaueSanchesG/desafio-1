package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        List<Pessoas> pessoas = funcoes.cadastra();

        for (Pessoas pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());

            List<Enderecos> enderecos = pessoa.getEnderecos();
            System.out.println("Endereços:");
            for (Enderecos endereco : enderecos) {
                System.out.println("- Rua: " + endereco.getRua() + ", Número: " + endereco.getNumero());
            }

            System.out.println();
        }
    }
}
