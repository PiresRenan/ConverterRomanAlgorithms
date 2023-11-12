import java.util.HashMap;
public class RomanToArabicConverter {
    public int convert(String roman) {
// HashMap que mapeia cada caractere romano para o seu valor decimal
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

// Variável que armazena o resultado da conversão
        int result = 0;

// Laço que percorre cada caractere da String, começando pelo último
        for (int i = roman.length() - 1; i >= 0; i--) {
            // Obtém o valor decimal do caractere atual
            char c = roman.charAt(i);
            int value = map.getOrDefault(c, -1);

// Se o valor for -1, significa que o caractere não é um algarismo romano válido
            if (value == -1) {
                throw new IllegalArgumentException("Invalid roman numeral: " + roman);
            }

// Se o valor for maior ou igual ao valor do caractere anterior, adiciona-o ao resultado
// Caso contrário, subtrai-o do resultado
            if (i == roman.length() - 1 || value >= map.get(roman.charAt(i + 1))) {
                result += value;
            } else {
                result -= value;
            }
        }

// Retorna o resultado da conversão
        return result;
    }

}

