package br.senai.lab365.futurodev.areaverde;

import java.util.ArrayList;
import java.util.List;

public class AreaVerde {
    private int id;
    private String nome;
    private String tipo;
    private Localizacao localizacao;
    private String tipoVegetacao;
    private String horarioFuncionamento;
    private List<String> atividadesDisponiveis;
    private List<Avaliacao> avaliacoes;

    public AreaVerde(int id, String nome, String tipo, Localizacao localizacao, String tipoVegetacao, String horarioFuncionamento, List<String> atividadesDisponiveis) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.localizacao = localizacao;
        this.tipoVegetacao = tipoVegetacao;
        this.horarioFuncionamento = horarioFuncionamento;
        this.atividadesDisponiveis = atividadesDisponiveis;
        this.avaliacoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public String getTipoVegetacao() {
        return tipoVegetacao;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public List<String> getAtividadesDisponiveis() {
        return atividadesDisponiveis;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public double calcularMediaAvaliacoes() {
        if (avaliacoes.isEmpty()) {
            return 0;
        }
        double soma = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            soma += avaliacao.calcularMedia();
        }
        return soma / avaliacoes.size();
    }

    public String listarDados() {
        return "\nID: " + id + " \nNome: " + nome + " \nTipo de Vegetação: " + tipoVegetacao + " \nMédia das Avaliações: " + calcularMediaAvaliacoes();
    }

    public String detalharDados() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append(String.format(
                "ID: %d  \nNome: %s  \nTipo: %s%nLocalização: %s%nVegetação: %s \nHorário: %s%nAtividades: %s%nMédia Geral: %.1f%n",
                id, nome, tipo, localizacao.toString(), tipoVegetacao, horarioFuncionamento, atividadesDisponiveis, calcularMediaAvaliacoes()
        ));

        // Adiciona detalhes das avaliações
        if (!avaliacoes.isEmpty()) {
            detalhes.append("\nAvaliações:\n");
            for (Avaliacao avaliacao : avaliacoes) {
                detalhes.append("- ").append(avaliacao.toString()).append("\n"); // Usa o toString() da Avaliacao
            }
        } else {
            detalhes.append("\nAinda não há avaliações.\n");
        }

        return detalhes.toString();
    }
}
