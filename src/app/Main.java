package app;

import java.util.ArrayList;
import java.util.List;
import model.Assalto;
import model.IncidenteAnimal;
import model.ViolenciaMulher;

public class Main {

    public static void main(String[] args) {
        List<Assalto> assaltos = new ArrayList<>();
        List<ViolenciaMulher> violenciaMulher = new ArrayList<>();
        List<IncidenteAnimal> incidentesAnimais = new ArrayList<>();

        assaltos.add(new Assalto("Rua do Hospício", "Celular levado na esquina", "ALTA", true));
        violenciaMulher.add(new ViolenciaMulher("Av. Conde da Boa Vista", "Mulher sendo perseguida", "URGENTE", true));
        incidentesAnimais.add(new IncidenteAnimal("Rua da Aurora", "Cachorro atropelado na via", "ALTA", "Atropelamento", true));

        listarAssaltos(assaltos);
        listarViolenciaMulher(violenciaMulher);
        listarIncidentesAnimais(incidentesAnimais);
    }

    private static void listarAssaltos(List<Assalto> lista) {
        exibirCabecalho("OCORRÊNCIAS DE ASSALTO");
        for (Assalto item : lista) {
            item.acionarPolicia();
            item.exibirDados();
        }
    }

    private static void listarViolenciaMulher(List<ViolenciaMulher> lista) {
        exibirCabecalho("VIOLÊNCIA CONTRA A MULHER");
        for (ViolenciaMulher item : lista) {
            item.acionarPatrulhaMulher();
            item.exibirDados();
        }
    }

    private static void listarIncidentesAnimais(List<IncidenteAnimal> lista) {
        exibirCabecalho("INCIDENTES COM ANIMAIS E PEDESTRES");
        for (IncidenteAnimal item : lista) {
            item.acionarResgate();
            item.exibirDados();
        }
    }

    private static void exibirCabecalho(String titulo) {
        System.out.println("\n=== " + titulo + " ===");
    }
}