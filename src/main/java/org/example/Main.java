package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        List<Pessoas> pessoas = new ArrayList<>();
        int opc;
        do{
            opc = funcoes.menu();
            switch(opc){
                case 1 -> pessoas = funcoes.cadastra();
                case 2 -> funcoes.procuraPessoas(pessoas);
                case 3 -> System.out.println("Até uma proxima!!");
                default -> System.out.println("Opção inválida. Escolha novamente.");
            }
        }while(opc<3);
    }
}

