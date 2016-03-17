package edu.utfpr.arquitetura01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String opcao = scan.nextLine();
        StrategyCidade strategy = null;

        switch (opcao) {
            case "txt":
                strategy = new StrategyTXT();
                break;
            case "csv":
                strategy = new StrategyCSV();
                break;
        }

        List <String> lista = strategy.ler();
        for (String cidade : lista) {
            System.out.println(cidade);
        }
        scan.close();
    }
}
