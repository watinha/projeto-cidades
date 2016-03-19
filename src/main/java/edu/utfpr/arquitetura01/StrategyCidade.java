package edu.utfpr.arquitetura01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public abstract class StrategyCidade {

    protected BufferedReader in;

    public StrategyCidade (String filename) throws IOException {
        this.in = new BufferedReader(
                new FileReader(filename));
    }

    public abstract List <String> ler ();
}
