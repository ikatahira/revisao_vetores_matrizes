/**Cria uma classe com um vetor preenchido com 
 * todos os nomes dos meses do ano.
Utilize um for para mostrar os meses do 2º semestre.
Utilize um for para mostrar os meses do 1º semestre.
 */
public class Vetor3{

    public static void main(String[] args) {
        
        String meses[]={"janeiro", "fevereiro","março", "abril","maio","junho",
        "julho","agosto","setembro","outubro","novembro","dezembro"};
 
 
         System.out.println("1º semestre");
        for (int i = 0; i <(meses.length)/2; i++) {
            System.out.println(meses[i]);
        }
        
        System.out.println("2º semestre");
        for (int i = 6; i < meses.length; i++) {
            System.out.println(meses[i]);
            
        }

    }

}