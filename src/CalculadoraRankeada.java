import java.util.Scanner;

public class CalculadoraRankeada {

    public static String calcularNivel(int vitorias, int derrotas) {
        int saldoVitorias = vitorias - derrotas;
        String nivel;

        if (vitorias < 10) {
            nivel = "Ferro";
        } else if (vitorias <= 20) {
            nivel = "Bronze";
        } else if (vitorias <= 50) {
            nivel = "Prata";
        } else if (vitorias <= 80) {
            nivel = "Ouro";
        } else if (vitorias <= 90) {
            nivel = "Diamante";
        } else if (vitorias <= 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        return "O Herói tem um saldo de " + saldoVitorias + " e está no nível de " + nivel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de vitórias: ");
        int vitorias = scanner.nextInt();

        System.out.print("Digite o número de derrotas: ");
        int derrotas = scanner.nextInt();

        String resultado = calcularNivel(vitorias, derrotas);

        System.out.println(resultado);

        scanner.close();
    }
}
