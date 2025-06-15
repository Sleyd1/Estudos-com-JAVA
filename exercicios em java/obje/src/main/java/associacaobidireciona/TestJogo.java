package associacaobidireciona;

import associacaobidireciona.timejogador.Jogador;
import associacaobidireciona.timejogador.Time;

public class TestJogo {
    public static void main(String[] args) {
        Jogador jogaodr1 = new Jogador("gabigol");
        Jogador jogadr2 = new Jogador("tralala");
        Jogador[] jogadores = {jogaodr1, jogadr2};

        Time time = new Time("flamengo", jogadores);

        jogaodr1.setTime(time);
        jogadr2.setTime(time);

        jogaodr1.imprimir();
        jogadr2.imprimir();
        time.imprimir();
    }


}
