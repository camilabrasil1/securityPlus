package model;

public class ViolenciaMulher extends Ocorrencia {
    private boolean agressorNoLocal;

    public ViolenciaMulher(String local, String descricao, String prioridade, boolean agressorNoLocal) {
        super(local, descricao, prioridade);
        this.agressorNoLocal = agressorNoLocal;
    }

    public boolean isAgressorNoLocal() {
        return agressorNoLocal;
    }

    public void acionarPatrulhaMulher() {
        System.out.println("[PATRULHA DA MULHER] Atendimento em: " + getLocal() + " (Agressor no local: " + agressorNoLocal + ")");
    }
}