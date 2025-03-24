package br.senai.lab365.futurodev.areaverde;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        DadosPreCadastrados.carregarDados();

        while (true) {
            System.out.println( "\n*** Mapeamento de Áreas Verdes em Joinville ***\n");
            System.out.println("1 - Listar Áreas Verdes Cadastradas");
            System.out.println("2 - Avaliar Área Verde");
            System.out.println("3 - Ver Detalhe de uma Área Verde");
            System.out.println("4 - Cadastrar Nova Área Verde");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    listarAreasVerdes();
                    break;
                case 2:
                    avaliarAreaVerde(entrada);
                    break;
                case 3:
                    verDetalheAreaVerde(entrada);
                    break;
                case 4:
                    cadastrarNovaAreaVerde(entrada);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void listarAreasVerdes() {
        List<AreaVerde> areas = AreaVerdeRepository.listarTodas();
        if (areas.isEmpty()) {
            System.out.println("\nNenhuma Área Verde cadastrada!");
        } else {
            for (AreaVerde area : areas) {
                System.out.println(area.listarDados());
            }
        }
    }

    private static void avaliarAreaVerde(Scanner entrada) {
        System.out.print("Digite o ID da Área Verde que deseja avaliar: ");
        int id = entrada.nextInt();
           entrada.nextLine();

        AreaVerde area = encontrarAreaVerdePorId(id);
        if (area == null) {
            System.out.println("\nÁrea Verde não encontrada!");
            return;
        }

        System.out.print("Quantidade de árvores (1-5): ");
        int quantidadeArvores = entrada.nextInt();
        System.out.print("Qualidade do ar (1-5): ");
        int qualidadeAr = entrada.nextInt();
        System.out.print("Ausência de poluição sonora (1-5): ");
        int ausenciaPoluicaoSonora = entrada.nextInt();
        System.out.print("Coleta de resíduos (1-5): ");
        int coletaResiduos = entrada.nextInt();
        System.out.print("Facilidade de acesso (1-5): ");
        int facilidadeAcesso = entrada.nextInt();
        entrada.nextLine();

        Avaliacao avaliacao = new Avaliacao(id, quantidadeArvores, qualidadeAr, ausenciaPoluicaoSonora, coletaResiduos, facilidadeAcesso);
        area.adicionarAvaliacao(avaliacao);
        AvaliacaoRepository.AVALIACOES.add(avaliacao);
        System.out.println("\nAvaliação registrada com sucesso!");
    }

    private static void verDetalheAreaVerde(Scanner entrada) {
        System.out.print("Digite o ID da Área Verde que deseja ver detalhes: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        AreaVerde area = encontrarAreaVerdePorId(id);
        if (area == null) {
            System.out.println("\nÁrea Verde não encontrada!");
            return;
        }

        System.out.println(area.detalharDados());
    }

    private static void cadastrarNovaAreaVerde(Scanner entrada) {
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Tipo (Parque ou Praça): ");
        String tipo = entrada.nextLine();
        System.out.print("Latitude: ");
        String latitudeInput = entrada.nextLine().replace(",", ".");
        double latitude = Double.parseDouble(latitudeInput);
        System.out.print("Longitude: ");
        String longitudeInput = entrada.nextLine().replace(",", ".");
        double longitude = Double.parseDouble(longitudeInput);
        System.out.print("Tipo de vegetação: ");
        String tipoVegetacao = entrada.nextLine();
        System.out.print("Horário de funcionamento: ");
        String horariosFuncionamento = entrada.nextLine();
        System.out.print("Atividades disponíveis (separadas por vírgula): ");
        String atividadesInput = entrada.nextLine();
        List<String> atividadesDisponiveis = List.of(atividadesInput.split(","));

        int id = AreaVerdeRepository.AREAS_VERDES.size() + 1;
        Localizacao localizacao = new Localizacao(latitude, longitude, id);
        AreaVerde areaVerde = new AreaVerde(id, nome, tipo, localizacao, tipoVegetacao, horariosFuncionamento, atividadesDisponiveis);

        AreaVerdeRepository.AREAS_VERDES.add(areaVerde);
        LocalizacaoRepository.LOCALIZACOES.add(localizacao);
        System.out.println("\nÁrea Verde cadastrada com sucesso! \nID: " + id);
    }

    private static AreaVerde encontrarAreaVerdePorId(int id) {
        for (AreaVerde area : AreaVerdeRepository.AREAS_VERDES) {
            if (area.getId() == id) {
                return area;
            }
        }
        return null;
    }
}