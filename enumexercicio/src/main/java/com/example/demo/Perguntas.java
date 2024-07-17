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

        System.out.println("Escolha uma região do Brasil:");
        for (int i = 0; i < Regiao.values().length; i++) {
            System.out.println((i + 1) + ": " + Regiao.values()[i].getNome());
        }

        System.out.print("Digite o número correspondente à região: ");
        int regiaoChoice = scanner.nextInt();

        if (regiaoChoice > 0 && regiaoChoice <= Regiao.values().length) {
            Regiao selectedRegiao = Regiao.values()[regiaoChoice - 1];
            System.out.println("Você escolheu a região: " + selectedRegiao.getNome());
            printUfsByRegiao(selectedRegiao);
        } else {
            System.out.println("Escolha de região inválida!");
        }

        scanner.close();
    }

    private void printUfsByRegiao(Regiao regiao) {
        System.out.println("As UFs da região " + regiao.getNome() + " são:");

        switch (regiao) {
            case NORTE:
                System.out.println("AC, AL, AP, AM, PA, RO, RR, TO");
                break;
            case NORDESTE:
                System.out.println("BA, CE, MA, PB, PE, PI, RN, SE");
                break;
            case CENTRO_OESTE:
                System.out.println("DF, GO, MT, MS");
                break;
            case SUDESTE:
                System.out.println("ES, MG, RJ, SP");
                break;
            case SUL:
                System.out.println("PR, RS, SC");
                break;
        }

    }
}