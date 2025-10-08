package main.java;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner estrutura = new Scanner(System.in);

        System.out.println("CRIAÇÃO DO OBJETO CORPO HUMANO");
        System.out.print("Informe a massa inicial (kg): ");
        float massa = estrutura.nextFloat();

        System.out.print("Informe o volume inicial (m³): ");
        float volume = estrutura.nextFloat();

        System.out.print("Informe a densidade inicial (kg/m³): ");
        float densidade = estrutura.nextFloat();

        System.out.print("Informe a altura inicial (m): ");
        float altura = estrutura.nextFloat();

        CorpoHumano c1 = new CorpoHumano(massa, volume, densidade, altura);

        System.out.println("Demonstração dos valores principais");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Volume: " + c1.getVolume() + " m³");
        System.out.println("Densidade: " + c1.getDensidade() + " kg/m³");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("IMC: " + c1.calculoIMC());

        System.out.print("Digite uma nova massa (kg): ");
        float novaMassa = estrutura.nextFloat();

        System.out.print("Digite uma nova altura (m): ");
        float novaAltura = estrutura.nextFloat();

        c1.setMassa(novaMassa);
        c1.setAltura(novaAltura);

        System.out.println("Atualização dos valores novos");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("Novo IMC: " + c1.calculoIMC());

        estrutura.close();
    }
}