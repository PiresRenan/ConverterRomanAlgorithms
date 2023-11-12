import java.util.Scanner;

public class RomanConverter {
    public static void main(String[] args) {

// Intancia de objetos para uso.
        Scanner scanner = new Scanner(System.in);
        RomanToArabicConverter romanToArabicConverter = new RomanToArabicConverter();
        ArabicToRomanConverter arabicToRomanConverter = new ArabicToRomanConverter();
        RomanNumberValidator romanNumberValidator = new RomanNumberValidator();

// Mensagem de boas-vindas para garantir o início da execução do programa.
        System.out.println("Bem-vindo ao Conversor de Números Romanos!");

// Garantir autonomia do usuario preparando o algoritmo para receber diversos inputs e hora de encerrar a execução.
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Converter número romano para arábico");
            System.out.println("2. Converter número arábico para romano");
            System.out.println("3. Sair");

// Receber e validar o input dado pela escolha do usuario.
            String option = scanner.next();
            boolean valid = romanNumberValidator.isValidChoice(option);

// Fim da primeira etapa do algoritmo.
            if (valid) {
                int opcao = Integer.parseInt(option);
                if (opcao == 1) {
                    System.out.print("Perfeito! Agora digite um algorismo romano: ");
                    String roman = scanner.next();
                    if (romanNumberValidator.isValid(roman)) {
                        int arabic = romanToArabicConverter.convert(roman);
                        System.out.println("Número arábico correspondente: " + arabic);
                    } else {
                        System.out.println("Número romano inválido. Tente novamente.");
                    }
                } else if (opcao == 2) {
                    System.out.print("Perfeito! Agora digite um número: ");
                    int arabic = scanner.nextInt();
                    String roman = arabicToRomanConverter.convertToRoman(arabic);
                    System.out.println("Número romano correspondente: " + roman);

                } else if (opcao == 3) {
                    System.out.println("Obrigado por usar o Conversor de Números Romanos. Adeus!");
                    break;
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        }

//        scanner.close();
    }
}
