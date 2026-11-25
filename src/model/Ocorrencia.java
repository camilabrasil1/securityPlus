package model;

public class Ocorrencia {
    private String local;
    private String descricao;
    private String prioridade;

    public Ocorrencia(String local, String descricao, String prioridade) {
        this.local = local;
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getLocal() {
        return local;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void exibirDados() {
        System.out.println("Local: " + local + " | Descrição: " + descricao + " | Prioridade: " + prioridade);
    }
}