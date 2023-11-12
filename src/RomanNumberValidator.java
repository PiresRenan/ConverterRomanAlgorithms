public class RomanNumberValidator {

// Função para verificação de entrada dos números digitados pelo usuario.
    public boolean isValid(String userInput) {

// Regex para distinguir os números romanos.
        if (userInput.matches("^[IVXLCDM]+$")) {

// Validação das regras dos números romanos
            if (userInput.matches(".*IIII.*|.*XXXX.*|.*CCCC.*")) {
            // Não pode haver mais de três "I", "X", "C" ou "M" consecutivos
                if (userInput.matches(".*IIII.*")) {
                    System.out.println("O valor fornecido é inválido, o correto deve ser 'IV'.");
                }
                if (userInput.matches(".*XXXX.*")){
                    System.out.println("O valor fornecido é inválido, o correto deve ser 'XL'.");
                }
                if (userInput.matches(".*CCCC.*")){
                    System.out.println("O valor fornecido é inválido, o correto deve ser 'CD'.");
                }
                return false;
            }
            if (userInput.matches(".*VV.*|.*LL.*|.*DD.*")) {
                // "V", "L" e "D" não podem se repetir
                if (userInput.matches(".*VV.*")) {
                    System.out.println("O valor fornecido é inválido, o correto deve ser 'X'.");
                }
                if (userInput.matches(".*LL.*")){
                    System.out.println("O valor fornecido é inválido, o correto deve ser 'C'.");
                }
                if (userInput.matches(".*DD.*")){
                    System.out.println("O valor fornecido é inválido, o correto deve ser 'M'.");
                }
                return false;
            }
            if (userInput.matches(".*IL.*|.*IC.*|.*ID.*|.*IM.*|.*XL.*|.*XC.*|.*CD.*|.*CM.*|.*XD.*|.*XM.*")) {
                // Regra de subtração não é obedecida (valores não válidos)
                if (userInput.matches(".*IL.*")) {
                    System.out.println("O valor fornecido é inválido, o correto deve ser 'XLIX'.");
                }
                if (userInput.matches(".*IC.*")){
                    System.out.println("O valor fornecido é inválido, o correto deve ser 'XCIX'.");
                }
                if (userInput.matches(".*ID.*")){
                    System.out.println("O valor fornecido é inválido, o correto deve ser 'CDXCIX'.");
                }
                if (userInput.matches(".*IM.*")) {
                    System.out.println("O valor fornecido é inválido, o correto deve ser 'CMXCIX'.");
                }
                return false;
            }
            return true;
        }

// Verifica se a entrada é um número inteiro.
        try {
            int intValue = Integer.parseInt(userInput);
            return (intValue >= 1 && intValue <= 99999);
        } catch (NumberFormatException e) {
            return false;
        }
    }

// Função para validar a escolha do usuario, prevenindo possiveis erros.
    public boolean isValidChoice(String choice){
        try {
            int choiceInt = Integer.parseInt(choice);
            return (choiceInt >= 1 && choiceInt <= 3);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
