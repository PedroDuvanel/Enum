package com.example.demo;

import java.util.Scanner;

public class Perguntas extends Exercicioenum {

    public void ex01() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma das seguintes UFs: ");

        for (Ufbrasil uf : Ufbrasil.values()) {
            System.out.println(uf.getId() + ": " + uf.getUf());
        }

        System.out.print("Digite o número correspondente à UF que você escolhe: ");
        int choice = scanner.nextInt();

        Ufbrasil selectedUf = null;
        for (Ufbrasil uf : Ufbrasil.values()) {
            if (uf.getId() == choice) {
                selectedUf = uf;
                break;
            }
        }

        if (selectedUf != null) {
            System.out.println("Você escolheu: " + selectedUf.getNome() + " (" + selectedUf.getUf() + ")");
        } else {
            System.out.println("Escolha inválida!");
        }

        System.out.println("Escolha uma região do brasil:");

        


    }

}
