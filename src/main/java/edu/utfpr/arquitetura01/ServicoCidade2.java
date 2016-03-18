package edu.utfpr.arquitetura01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServicoCidade2 {
    public List <String> buscarTodas (String opcao) {
        switch (opcao) {
            case "txt":
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
            case "csv":
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
        return null;
    }
}
