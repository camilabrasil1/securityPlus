package model;

public class IncidenteAnimal extends Ocorrencia {
    private String tipoIncidente; // Ex: "Ataque" ou "Atropelamento"
    private boolean precisaResgate;

    public IncidenteAnimal(String local, String descricao, String prioridade, String tipoIncidente, boolean precisaResgate) {
        super(local, descricao, prioridade);
        this.tipoIncidente = tipoIncidente;
        this.precisaResgate = precisaResgate;
    }

    public String getTipoIncidente() {
        return tipoIncidente;
    }

    public boolean isPrecisaResgate() {
        return precisaResgate;
    }

    public void acionarResgate() {
        System.out.println("[RESGATE] " + tipoIncidente + " em: " + getLocal() + " (Precisa de resgate: " + precisaResgate + ")");
    }
}