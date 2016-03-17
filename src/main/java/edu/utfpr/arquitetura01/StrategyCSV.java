package edu.utfpr.arquitetura01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StrategyCSV extends StrategyCidade {

    public List<String> ler() {
        BufferedReader in_csv;
        try {
            in_csv = new BufferedReader(
                    new FileReader("data/cidades.csv"));
            String linha2 = in_csv.readLine();
            List<String> lista = new ArrayList<String> ();
            while (linha2 != null) {
                lista.add(linha2.substring(
                            0, linha2.indexOf(",")));
                linha2 = in_csv.readLine();
            }
            in_csv.close();
            return lista;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
