package model;

public class Assalto extends Ocorrencia {
    private boolean tinhaArma;

    public Assalto(String local, String descricao, String prioridade, boolean tinhaArma) {
        super(local, descricao, prioridade);
        this.tinhaArma = tinhaArma;
    }

    public boolean isTinhaArma() {
        return tinhaArma;
    }

    public void acionarPolicia() {
        System.out.println("[POLÍCIA] Viatura enviada para assalto em: " + getLocal() + " (Arma: " + tinhaArma + ")");
    }
}