package br.senai.lab365.futurodev.areaverde;

import java.util.List;

public class DadosPreCadastrados {
    public static void carregarDados() {
        // Área 1: Parque da Cidade
        Localizacao localizacao1 = new Localizacao(-26.3044, -48.8467, 1);
        AreaVerde parqueDaCidade = new AreaVerde(1, "Parque da Cidade", "Parque", localizacao1, "Árvores", "06:00 às 22:00", List.of("caminhada", "ciclismo", "piquenique"));
        parqueDaCidade.adicionarAvaliacao(new Avaliacao(1, 5, 4, 4, 5, 4)); // Avaliação 1

        // Área 2: Praça da Bandeira
        Localizacao localizacao2 = new Localizacao(-26.3056, -48.8433, 2);
        AreaVerde pracaDaBandeira = new AreaVerde(2, "Praça da Bandeira", "Praça", localizacao2, "Grama", "24 horas", List.of("caminhada", "parquinho infantil"));
        pracaDaBandeira.adicionarAvaliacao(new Avaliacao(2, 3, 4, 5, 3, 4)); // Avaliação 1

        // Área 3: Parque Zoobotânico
        Localizacao localizacao3 = new Localizacao(-26.3167, -48.8333, 3);
        AreaVerde parqueZoobotanico = new AreaVerde(3, "Parque Zoobotânico", "Parque", localizacao3, "Árvores e Arbustos", "08:00 às 18:00", List.of("caminhada", "observação de animais", "piquenique"));
        parqueZoobotanico.adicionarAvaliacao(new Avaliacao(3, 5, 5, 5, 5, 5)); // Avaliação 1

        // Área 4: Praça Nereu Ramos
        Localizacao localizacao4 = new Localizacao(-26.3011, -48.8419, 4);
        AreaVerde pracaNereuRamos = new AreaVerde(4, "Praça Nereu Ramos", "Praça", localizacao4, "Grama e Árvores", "24 horas", List.of("caminhada", "parquinho infantil", "eventos"));
        pracaNereuRamos.adicionarAvaliacao(new Avaliacao(4, 4, 4, 4, 4, 4)); // Avaliação 1

        // Adicionar áreas ao repositório
        AreaVerdeRepository.adicionarAreaVerde(parqueDaCidade);
        AreaVerdeRepository.adicionarAreaVerde(pracaDaBandeira);
        AreaVerdeRepository.adicionarAreaVerde(parqueZoobotanico);
        AreaVerdeRepository.adicionarAreaVerde(pracaNereuRamos);

        // Adicionar localizações ao repositório
        LocalizacaoRepository.adicionarLocalizacao(localizacao1);
        LocalizacaoRepository.adicionarLocalizacao(localizacao2);
        LocalizacaoRepository.adicionarLocalizacao(localizacao3);
        LocalizacaoRepository.adicionarLocalizacao(localizacao4);

        // Adicionar avaliações ao repositório
        for (Avaliacao avaliacao : parqueDaCidade.getAvaliacoes()) {
            AvaliacaoRepository.adicionarAvaliacao(avaliacao);
        }
        for (Avaliacao avaliacao : pracaDaBandeira.getAvaliacoes()) {
            AvaliacaoRepository.adicionarAvaliacao(avaliacao);
        }
        for (Avaliacao avaliacao : parqueZoobotanico.getAvaliacoes()) {
            AvaliacaoRepository.adicionarAvaliacao(avaliacao);
        }
        for (Avaliacao avaliacao : pracaNereuRamos.getAvaliacoes()) {
            AvaliacaoRepository.adicionarAvaliacao(avaliacao);
        }

    }
}
