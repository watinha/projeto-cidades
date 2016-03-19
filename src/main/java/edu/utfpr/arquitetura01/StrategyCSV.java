package edu.utfpr.arquitetura01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StrategyCSV extends StrategyCidade {

    public StrategyCSV (String filename) throws IOException {
        super(filename);
    }

    public List<String> ler() {
        try {
            String linha2 = in.readLine();
            List<String> lista = new ArrayList<String> ();
            while (linha2 != null) {
                lista.add(linha2.substring(
                            0, linha2.indexOf(",")));
                linha2 = in.readLine();
            }
            in.close();
            return lista;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
