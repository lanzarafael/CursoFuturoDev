package br.senai.lab365.futurodev.areaverde;

import java.util.ArrayList;
import java.util.List;

public class LocalizacaoRepository {
    // Lista estática para armazenar todas as localizações cadastradas
    public static List<Localizacao> LOCALIZACOES = new ArrayList<>();

    // Adiciona uma nova localização ao repositório
    public static void adicionarLocalizacao(Localizacao localizacao) {
        LOCALIZACOES.add(localizacao);
    }

    // Busca uma localização pelo ID da área verde
    public static Localizacao buscarPorAreaVerdeId(int areaVerdeId) {
        for (Localizacao localizacao : LOCALIZACOES) {
            if (localizacao.getAreaVerdeId() == areaVerdeId) {
                return localizacao;
            }
        }
        return null; // Retorna null se não encontrar
    }
}
