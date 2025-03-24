package br.senai.lab365.futurodev.areaverde;

import java.util.ArrayList;
import java.util.List;

public class AreaVerdeRepository {
    // Lista estática para armazenar todas as áreas verdes cadastradas
    public static List<AreaVerde> AREAS_VERDES = new ArrayList<>();

    //Adicionar uma nova área verde ao repositório
    public static void adicionarAreaVerde(AreaVerde areaVerde) {
        AREAS_VERDES.add(areaVerde);
    }

    // Busca uma área verde pelo ID
    public static AreaVerde buscarPorId(int id) {
        for (AreaVerde area : AREAS_VERDES) {
            if (area.getId() == id) {
                return area;
            }
        }
        return null; // Retorna null se não encontrar
    }

    // Lista todas as áreas verdes
    public static List<AreaVerde> listarTodas() {
        return AREAS_VERDES;
    }
}
