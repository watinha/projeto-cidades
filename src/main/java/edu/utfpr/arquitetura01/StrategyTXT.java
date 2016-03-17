package edu.utfpr.arquitetura01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StrategyTXT extends StrategyCidade {

    public List<String> ler() {
        BufferedReader in;
        try {
            in = new BufferedReader(
                    new FileReader("data/cidades.txt"));
            String linha = in.readLine();
            List <String> lista = new ArrayList <String> ();
            while (linha != null) {
                if (!linha.equals("")) {
                    lista.add(linha);
                }
                linha = in.readLine();
            }
            in.close();
            return lista;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
