package Estudos.Vagas.Spring_Desafio_EFFECTIVE.SISTEMAS;

import Estudos.Vagas.Spring_Desafio_EFFECTIVE.SISTEMAS.model.Sales;

import java.io.IOException;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String PENDENTES_DIR = "PENDENTES";
    private static final String INVALIDO_DIR = "INVALIDADO";
    private static final String VALIDADO_DIR = "VALIDADO";

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yy");

    public static void main(String[] args){

    }


    private static List<Sales> parseFile(Path path) throws IOException {

        List<Sales> salesList = new ArrayList<>();

        return null;
    }

}
