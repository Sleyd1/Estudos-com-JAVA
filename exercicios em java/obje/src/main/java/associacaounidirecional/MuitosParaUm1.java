package associacaounidirecional;

import associacaounidirecional.ass.AssociacaoUnidirecional;
import associacaounidirecional.ass.Associacaoum;

//Associação unidirecional muitos para um
public class MuitosParaUm1 {
    public static void main(String[] args) {
    Associacaoum professor = new Associacaoum("Marcos");
    AssociacaoUnidirecional escola = new AssociacaoUnidirecional("jose mendoça", professor);

    escola.imprimir();





    }

}
