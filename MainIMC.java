/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetojava;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class MainIMC {
  


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ENTRADA DE DADOS

        System.out.println("Digite o nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("Digite a idade:");
        int idade = sc.nextInt();

        System.out.println("Digite a altura:");
        double altura = sc.nextDouble();

        System.out.println("Digite o peso:");
        double peso = sc.nextDouble();

        // OBJETO

        Pessoa p = new Pessoa(
                nome,
                sobrenome,
                idade,
                altura,
                peso
        );

        // CALCULAR IMC
        p.calcularIMC();

        // SAÍDA

        System.out.println("\nRESULTADO");
        System.out.println("Nome: " + p.getNome());

        System.out.println("IMC: " + p.getImc());

        System.out.println(
                "Classificação: "
                + p.informarObesidade()
        );

        sc.close();
    }
} 

