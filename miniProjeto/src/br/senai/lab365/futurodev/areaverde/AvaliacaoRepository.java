package br.senai.lab365.futurodev.areaverde;

import java.util.ArrayList;
import java.util.List;

public class AvaliacaoRepository {
    // Lista estática para armazenar todas as avaliações cadastradas
    public static List<Avaliacao> AVALIACOES = new ArrayList<>();

    // Adiciona uma nova avaliação ao repositório
    public static void adicionarAvaliacao(Avaliacao avaliacao) {
        AVALIACOES.add(avaliacao);
    }

    // Busca todas as avaliações de uma área verde pelo ID
    public static List<Avaliacao> buscarPorAreaVerdeId(int areaVerdeId) {
        List<Avaliacao> avaliacoesDaArea = new ArrayList<>();
        for (Avaliacao avaliacao : AVALIACOES) {
            if (avaliacao.getAreaVerdeId() == areaVerdeId) {
                avaliacoesDaArea.add(avaliacao);
            }
        }
        return avaliacoesDaArea; // Retorna a lista de avaliações da área
    }
}
