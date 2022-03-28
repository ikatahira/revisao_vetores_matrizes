import java.util.Scanner;

/*A empresa Programando Java vende produtos no Mercado Livre,
 e ela quer testar um sistema dos alunos da Fatec Pompeia 
 para cadastrar 5 produtos. O Cadastro do produto tem os 
 seguintes campos: Código do Produto, Nome do Produto e Preço 
 do Produto.
Crie uma classe que leia essas informações em 3 vetores
Após ler, mostre os produtos EX: ”10317485 – Saca de Soja –
 R$ 189,99”
Após Exibir os produtos, acrescente R$ 20,00 no preço dos produtos que o preço for maior que R$ 120,00
Mostre Todos os produtos novamente.*/

public class Vetor5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int codigo[]=new int[5];
        String nome[]=new String [5];
        double preco[]=new double[5];
        for (int i = 0; i < preco.length; i++) {
            System.out.println("Digite o código do produto");
            codigo[i]=sc.nextInt();
            System.out.println("Digite o nome do produto");
            nome[i]=sc.next();
            System.out.println("Digite o preço do produto");
            preco[i]=sc.nextDouble();
        }
        for (int i = 0; i < preco.length; i++) {
            System.out.println("Código: "+codigo[i]);
            System.out.println("Nome: "+nome[i]);
            if(preco[i]>120){
            System.out.println("Preço: "+(preco[i]+20));
        }
            else{
                System.out.println("Preço: "+preco[i]);  
            }
        }
        sc.close();
    }
}
