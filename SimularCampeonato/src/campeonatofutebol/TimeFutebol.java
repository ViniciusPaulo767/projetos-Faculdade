package campeonatofutebol;

public class TimeFutebol {

    private String nome;
    private int jogos;
    private int pontos;
    private int estiloDeJogo;

    public TimeFutebol(String nome, int estiloDeJogo) {
        this.nome = nome;
        this.estiloDeJogo = estiloDeJogo;
        this.jogos = 0;
        this.pontos = 0;
    }

    public int estiloDeJogo() {
        return estiloDeJogo;
    }

    public void estiloDeJogo(int estiloDeJogo) {
        if (this.estiloDeJogo == 0) {
            System.out.println("Retranqueiro");
        } else {
            System.out.println("Joga no ataque");
        }
    }

    public void venceu() {
        this.pontos += 3;
        this.jogos += 1;
    }

    public void empatou() {
        this.pontos += 1;
        this.jogos += 1;
    }

    public void perdeu() {
        this.pontos += 0;
        this.jogos += 1;
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontos: " + pontos);
        System.out.println("Jogos: " + jogos);
        System.out.println("Estilo de Jogo: " + estiloDeJogo);
    }
}
