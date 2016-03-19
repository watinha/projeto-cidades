package edu.utfpr.arquitetura01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StrategyTXT extends StrategyCidade {

    public StrategyTXT (String filename) throws IOException {
        super(filename);
    }

    public List<String> ler() {
        try {
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
