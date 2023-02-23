/**
 * Main
 */
public class ModuloTestes {

    public static void main(String[] args) {
        ModuloCalculadora.soma(2,3);
        ModuloCalculadora.subtracao(4, 2);
        ModuloCalculadora.multiplicacao(2, 5);
        ModuloCalculadora.divisao(10, 2);

        ModuloMensagem.obterMensagem(5);
        ModuloMensagem.obterMensagem(10);
        ModuloMensagem.obterMensagem(15);
        ModuloMensagem.obterMensagem(26);
        
        ModuloEmprestimo.calcular(200, 2);
        ModuloEmprestimo.calcular(200, 3);
        ModuloEmprestimo.calcular(200,10);

        ModuloQuadrilatero.area(2);
        ModuloQuadrilatero.area(2,3);
        ModuloQuadrilatero.area(5,6,2);
    }
}