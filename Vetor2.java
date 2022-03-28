
//importa a classe Scanner para nosso projeto, que está dentro do pacote java.util
import java.util.Scanner;

//declara uma classe pública chamada Vetor 2 e inicia o corpo da classe por meio do sin
public class Vetor2 {
    /**
     * Crie uma classe que:
     * Leia um número inteiro “n”
     * Leia o nome dos funcionários em um Vetor “funcionário” com o tamanho n.
     * Imprima o nome dos funcionários
     */
    public static void main(String[] args) {
        // Criar um objeto chamado sc para receber dados dos usuários via teclado
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String funcionario[] = new String[n];
        // comente cada linha em detalhe, não pode faltar nada
        // estrutura de repetição para nome de funcionário para cada um dos valores do
        // vetor
        // o método .length retorna o tamenho total do vetor
        for (int index = 0; index < funcionario.length; index++) {
            System.out.println("Digite o nome do funcionário");
            // adicionar os nomes que foram digitados pelo usuário no vetor
            funcionario[index] = sc.next();

        }

        for (int index = 0; index < funcionario.length; index++) {
            System.out.println(funcionario[index]);

        }
        sc.close();
    }

}
