/*Создай класс NumberTranslator. Внутри класса создай метод public int translate(String romanNumber), который переводит переданную строку с римскими цифрами в арабское число. При этом:
римское число, переданное на вход, лежит в диапазоне от 1 (I) до 12 (XII) включительно
для записи римских чисел используются символы 'I', 'V', 'X', причем в большом и маленьком регистре
в начале и в конце строки могут быть пробелы, и программа должна не учитывать их
если переданное число не является римским числом от 1 до 12, программа должна возвращать -1
можно использовать только оператор switch-case, оператор if использовать нельзя
 */

public class  exercise27 {
    public int translate(String romanNumber) {
        int result = 0;
        switch (romanNumber.toUpperCase().replace(" ", "")) {
            case "XII":
                result = 12;
                break;
            case "XI":
                result = 11;
                break;
            case "X":
                result = 10;
                break;
            case "IX":
                result = 9;
                break;
            case "VIII":
                result = 8;
                break;
            case "VII":
                result = 7;
                break;
            case "VI":
                result = 6;
                break;
            case "V":
                result = 5;
                break;
            case "IV":
                result = 4;
                break;
            case "III":
                result = 3;
                break;
            case "II":
                result = 2;
                break;
            case "I":
                result = 1;
                break;
        }
        return result;
    }

}
