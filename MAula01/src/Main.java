public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora: ");
        Calculadora.soma(4, 7);
        Calculadora.subtracao(8, 4);
        Calculadora.multiplicacao(7, 7);
        Calculadora.divisao(9, 3);

        System.out.println();

        //Mensagem
        System.out.println("Exercício Mensagem: ");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(23);

        System.out.println();

        //Empréstimo
        System.out.println("Exercício Empréstimo: ");
        Emprestimo.calcular(1100, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(3000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(800, 5);
    }
}
