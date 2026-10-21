import java.util.Scanner;

public class main {

    public class ExerciciosCollections {

    //1 - Escreva um código que cria uma calculadora para as operações de soma e subtração, 
    // o usuário deve informar todos os números que serão usados na conta de uma só vez utilizando virgulas para separa-los.
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a operação: SOMA ou SUBTRACAO");
        String operacao = scanner.nextLine().toUpperCase();

        System.out.println("Digite os números separados por vírgula:");
        String input = scanner.nextLine();
        String[] numerosStr = input.split(","); // O split divide a string sempre que encontra o padrão indicado, no caso a vírgula, e retorna um array de strings.
        double resultado = 0;

        switch (operacao) {
            case "SOMA":
                for (String numStr : numerosStr) {
                    resultado += Double.parseDouble(numStr.trim());
                }
                break;
            case "SUBTRACAO":
                resultado = Double.parseDouble(numerosStr[0].trim());
                for (int i = 1; i < numerosStr.length; i++) {
                    resultado -= Double.parseDouble(numerosStr[i].trim());
                }
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
}
}
