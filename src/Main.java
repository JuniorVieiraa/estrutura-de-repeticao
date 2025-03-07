/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Locale.setDefault (Locale.US);

        int senha = 0;

        while (senha != 2002) {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();

            if (senha != 2002) {
                System.out.println("Senha Invalida");
            }
        }
        System.out.println("Acesso Permitido");

        sc.close();

        }
    }
