package app;

import java.util.ArrayList;
import model.Assalto;
import model.IncidenteAnimal;
import model.ViolenciaMulher;

public class Main {

    public static void main(String[] args) {
        // 1. Inicialização das listas
        ArrayList<Assalto> assaltos = new ArrayList<>();
        ArrayList<ViolenciaMulher> violenciaMulher = new ArrayList<>();
        ArrayList<IncidenteAnimal> incidentesAnimais = new ArrayList<>();

        // 2. Cadastro das ocorrências
        assaltos.add(new Assalto("Rua do Hospício", "Celular levado na esquina", "ALTA", true));
        violenciaMulher.add(new ViolenciaMulher("Av. Conde da Boa Vista", "Mulher sendo perseguida", "URGENTE", true));
        incidentesAnimais.add(new IncidenteAnimal("Rua da Aurora", "Cachorro atropelado na via", "ALTA", "Atropelamento", true));

        // 3. Exibição organizada por métodos
        listarAssaltos(assaltos);
        listarViolenciaMulher(violenciaMulher);
        listarIncidentesAnimais(incidentesAnimais);
    }

    private static void listarAssaltos(ArrayList<Assalto> lista) {
        System.out.println("=== OCORRÊNCIAS DE ASSALTO ===");
        for (Assalto item : lista) {
            item.acionarPolicia();
            item.exibirDados();
        }
        System.out.println();
    }

    private static void listarViolenciaMulher(ArrayList<ViolenciaMulher> lista) {
        System.out.println("=== VIOLÊNCIA CONTRA A MULHER ===");
        for (ViolenciaMulher item : lista) {
            item.acionarPatrulhaMulher();
            item.exibirDados();
        }
        System.out.println();
    }

    private static void listarIncidentesAnimais(ArrayList<IncidenteAnimal> lista) {
        System.out.println("=== INCIDENTES COM ANIMAIS E PEDESTRES ===");
        for (IncidenteAnimal item : lista) {
            item.acionarResgate();
            item.exibirDados();
        }
        System.out.println();
    }
}