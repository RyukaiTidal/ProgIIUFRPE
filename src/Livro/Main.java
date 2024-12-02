package Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LivroNotas notas = new LivroNotas();
        double contador = 1;
        while (true){
            System.out.printf("Digite a %.0fª Nota(Para finalizar, digite um número negativo):\n", contador);
            notas.somarNotas = scanner.nextDouble();
            if (notas.somarNotas >= 0 && notas.somarNotas <= 10) {
                notas.adicionarNotas(notas.somarNotas);
                contador++;
            } if (notas.somarNotas > 10) {
                System.out.println("Nota inválida, tente novamente!\n");
            } if (notas.somarNotas < 0) {
                notas.calcularMedia(contador,notas.totalNotas);
                break;
            }
        }
    }
}
