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
                strategy = new StrategyTXT("data/cidades.txt");
                break;
            case "csv":
                strategy = new StrategyCSV("data/cidades.csv");
                break;
        }

        ServicoCidades servico = new ServicoCidades(strategy);
        servico.buscar(opcao);
        scan.close();
    }
}
