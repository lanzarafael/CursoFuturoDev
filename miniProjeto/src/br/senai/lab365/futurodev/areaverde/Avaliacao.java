package br.senai.lab365.futurodev.areaverde;

public class Avaliacao {
    private int areaVerdeId;
    private int quantidadeArvores;
    private int qualidadeAr;
    private int ausenciaPoluicaoSonora;
    private int coletaResiduos;
    private int facilidadeAcesso;

    public Avaliacao(int areaVerdeId, int quantidadeArvores, int qualidadeAr, int ausenciaPoluicaoSonora, int coletaResiduos, int facilidadeAcesso) {
        this.areaVerdeId = areaVerdeId;
        this.quantidadeArvores = quantidadeArvores;
        this.qualidadeAr = qualidadeAr;
        this.ausenciaPoluicaoSonora = ausenciaPoluicaoSonora;
        this.coletaResiduos = coletaResiduos;
        this.facilidadeAcesso = facilidadeAcesso;
    }

    public int getAreaVerdeId() {
        return areaVerdeId;
    }

    public double calcularMedia() {
        return (quantidadeArvores + qualidadeAr + ausenciaPoluicaoSonora + coletaResiduos + facilidadeAcesso) / 5.0;
    }

    @Override
    public String toString() {
            return String.format(
                    "Quantidade de Árvores: %d | Qualidade do Ar: %d | Poluição Sonora: %d | Coleta de Resíduos: %d | Facilidade de Acesso: %d | Média: %.1f",
                    quantidadeArvores, qualidadeAr, ausenciaPoluicaoSonora, coletaResiduos, facilidadeAcesso, calcularMedia()
            );

    }
}


