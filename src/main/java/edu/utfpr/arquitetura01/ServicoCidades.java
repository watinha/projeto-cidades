package edu.utfpr.arquitetura01;

import java.util.List;

public class ServicoCidades {
    private StrategyCidade strategy;

    public ServicoCidades(StrategyCidade strategy) {
        this.strategy = strategy;
    }

    public void buscar (String opcao) {
        List <String> lista = this.strategy.ler();
        for (String cidade : lista) {
            System.out.println(cidade);
        }
    }
}
