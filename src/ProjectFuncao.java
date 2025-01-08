import java.util.Scanner;

public class ProjectFuncao {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Classificador de nível de herói
        System.out.println("Quantas Vitórias e Derrotas você teve durante a temporada?");
        int vitoria = scanner.nextInt();
        int derrota = scanner.nextInt();

        // Chamando a função rank e mostrando o resultado
        System.out.println(rank(vitoria, derrota));

        scanner.close(); // Fechar o scanner para evitar vazamentos de recursos
    }

    // Método rank dentro da classe ProjectFuncao
    public static String rank(int vitorias, int derrotas) {
        if (vitorias < 10) {
            return "Seu rank é Ferro!";
        } else if (vitorias >= 11 && vitorias <= 20 || derrotas <= 10) {
            return "Seu rank é Bronze";
        } else if (vitorias >= 21 && vitorias <= 50 || derrotas <= 15) {
            return "Seu rank é Prata";
        } else if (vitorias >= 51 && vitorias <= 80 || derrotas <= 20) {
            return "Seu rank é Ouro";
        } else if (vitorias >= 81 && vitorias <= 90 || derrotas <= 25) {
            return "Seu rank é Diamante";
        } else if (vitorias >= 91 && vitorias <= 100 || derrotas <= 30) {
            return "Seu rank é Lendário";
        } else if (vitorias >= 101 || derrotas <= 30) {
            return "Seu rank é Imortal";
        }

        // Caso não haja correspondência, retornamos uma resposta padrão
        return "Rank desconhecido";
    }

}
