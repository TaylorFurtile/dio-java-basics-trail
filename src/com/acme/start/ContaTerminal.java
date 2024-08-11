package com.acme.start;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    static int number;
    static String agency;
    static String client;
    static double dept;

    final static Locale locale = Locale.US;

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
            
            System.out.println("Informe o número da conta:");
            number = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Informe o número da agência:");
            agency = scanner.nextLine();
            
            // utilizando o .nextLine() por conta da forma que o scanner faz a leitura
            // dos "tokens" ou palavras escritas. Com esse método podemos ler a linha inteira
            // invés de apenas uma palavra.
            System.out.println("Informe o seu nome completo:");
            client = scanner.nextLine();
            
            System.out.println("Informe o saldo da conta:");
            dept = scanner.nextDouble();
            
            System.out.printf(
                "\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque.\n",
                client,
                agency,
                number,
                currencyFormatter.format(dept)
            );
        }
    }
}
