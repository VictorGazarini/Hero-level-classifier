import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
      Scanner scanner = new Scanner(System.in);

      //Classificador de nivel de herói

      System.out.println("Digite o nome e o XP do Herói: ");
      String nome = scanner.nextLine();
      int XP = scanner.nextInt();



      /*Se XP for menor do que 1.000 = Ferro
      Se XP for entre 1.001 e 2.000 = Bronze
      Se XP for entre 2.001 e 5.000 = Prata
      Se XP for entre 5.001 e 7.000 = Ouro
      Se XP for entre 7.001 e 8.000 = Platina
      Se XP for entre 8.001 e 9.000 = Ascendente
      Se XP for entre 9.001 e 10.000= Imortal
      Se XP for maior ou igual a 10.001 = Radiante*/

      if ( XP <= 1000){
        System.out.println("O Herói de nome " + nome + " está no nível de Ferro");
      } if (XP >= 1001 && XP <= 2000){
        System.out.println("O Herói de nome " + nome + " está no nível de Bronze");
      }if (XP >= 2001 && XP <= 5000){
        System.out.println("O Herói de nome " + nome + " está no nível de Prata");
      }if (XP >= 5001 && XP <= 7000){
        System.out.println("O Herói de nome " + nome + " está no nível de Ouro");
      }if (XP >= 7001 && XP <= 8000){
        System.out.println("O Herói de nome " + nome + " está no nível de Platina");
      }if (XP >= 8001 && XP <= 9000){
        System.out.println("O Herói de nome " + nome + " está no nível de Ascendente");
      }if (XP >= 9001 && XP <= 10000){
        System.out.println("O Herói de nome " + nome + " está no nível de Imortal");
      }if ( XP > 10001){
        System.out.println("O Herói de nome " + nome + " está no nível de Radiante");
      }
      
      scanner.close();

      
    }
}
