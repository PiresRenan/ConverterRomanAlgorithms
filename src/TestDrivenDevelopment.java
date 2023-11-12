import org.junit.Assert;
import org.junit.Test;

public class TestDrivenDevelopment {

// Teste para escolha para continuação da execução do algoritmo
@Test
public void testForChoice() {
        RomanNumberValidator romanNumberValidator = new RomanNumberValidator();
        // Teste para escolha válida 1
        String validChoice1 = "1";
        Assert.assertTrue(romanNumberValidator.isValidChoice(validChoice1));

        // Teste para escolha válida (2)
        String validChoice2 = "2";
        Assert.assertTrue(romanNumberValidator.isValidChoice(validChoice2));

        // Teste para escolha válida (3)
        String validChoice3 = "3";
        Assert.assertTrue(romanNumberValidator.isValidChoice(validChoice3));

        // Teste para escolha inválida
        String invalidChoice = "4";
        Assert.assertFalse(romanNumberValidator.isValidChoice(invalidChoice));

        // Teste para escolha inválida (não numérica)
        String nonNumericChoice = "abc";
        Assert.assertFalse(romanNumberValidator.isValidChoice(nonNumericChoice));
    }

    @Test
    public void testForNumberInput() {
        RomanNumberValidator validator = new RomanNumberValidator();

// Teste para números inteiros válidos no intervalo (1-99999)
        Assert.assertTrue(validator.isValid("1"));
        Assert.assertTrue(validator.isValid("100"));
        Assert.assertTrue(validator.isValid("99999"));

// Teste para valores romanos
        Assert.assertTrue(validator.isValid("IV"));
        Assert.assertTrue(validator.isValid("XVII"));
        Assert.assertTrue(validator.isValid("LVII"));
        Assert.assertTrue(validator.isValid("DV"));

// Teste para valores romanos inválidos
        Assert.assertFalse(validator.isValid("IIII"));
        Assert.assertFalse(validator.isValid("XXXX"));
        Assert.assertFalse(validator.isValid("CCCC"));

// Teste para números inteiros inválidos
        Assert.assertFalse(validator.isValid("-1"));
        Assert.assertFalse(validator.isValid("0"));
        Assert.assertFalse(validator.isValid("100000"));
        Assert.assertFalse(validator.isValid("abc"));
        Assert.assertFalse(validator.isValid("42.5"));
    }

    @Test
    public void testRomanToArabicConversion() {
        RomanToArabicConverter converter = new RomanToArabicConverter();

// Teste para ver se o conversor de numero romano para arabico funciona
        Assert.assertEquals(1, converter.convert("I"));
        Assert.assertEquals(4, converter.convert("IV"));
        Assert.assertEquals(5, converter.convert("V"));
        Assert.assertEquals(9, converter.convert("IX"));
        Assert.assertEquals(10, converter.convert("X"));
        Assert.assertEquals(49, converter.convert("XLIX"));
        Assert.assertEquals(123, converter.convert("CXXIII"));
        Assert.assertEquals(767, converter.convert("DCCLXVII"));
        Assert.assertEquals(2023, converter.convert("MMXXIII"));
    }

    @Test
    public void testArabicToRomanConversion() {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        Assert.assertEquals("I", converter.convertToRoman(1));
        Assert.assertEquals("IV", converter.convertToRoman(4));
        Assert.assertEquals("IX", converter.convertToRoman(9));
        Assert.assertEquals("LVII", converter.convertToRoman(57));
        Assert.assertEquals("CCXXIII", converter.convertToRoman(223));
        Assert.assertEquals("DCCLXII", converter.convertToRoman(762));
        Assert.assertEquals("MMDXCIX", converter.convertToRoman(2599));
    }

}
