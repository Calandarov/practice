/*
* Дана строка, состоящая из скобок, а также открывающий и закрывающий символ скобок.
* Необходимо реализовать метод, который проверяет что в строке у каждой открывающей скобки есть соответствующая ей закрывающая скобка.
* Строка в которой закрывающая скобка идёт впереди открывающей является некорректной.
* Например (()) - корректная строка, ()) - некорректная строка
*/
package practice.task3;

public class BracketUtil {
    private BracketUtil() {}
    public static boolean isCorrectBrackets(String input, char bracketOpenSymbol, char bracketCloseSymbol) {
        int openSymbolCounter = 0;
        int closeSymbolCounter = 0;

        for(int i = 0; i <= input.length() - 1; i++) {
            char bracket = input.charAt(i);

            if(bracket == bracketOpenSymbol) {
                openSymbolCounter += 1;
            } else if(bracket == bracketCloseSymbol) {
                closeSymbolCounter += 1;
            }
        }

        return openSymbolCounter == closeSymbolCounter;
    }
}
