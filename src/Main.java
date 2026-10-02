public class Main {

    public static void main(String[] args) {

        ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();

        arvore.inserir(".", "E");
        arvore.inserir("..", "I");
        arvore.inserir("...", "S");
        arvore.inserir("....", "H");
        arvore.inserir(".....", "5");
        arvore.inserir("....-", "4");
        arvore.inserir("...-", "V");
        arvore.inserir("...--", "3");
        arvore.inserir("..-", "U");
        arvore.inserir("..-.", "F");
        arvore.inserir("..---", "2");
        arvore.inserir(".-", "A");
        arvore.inserir(".-.", "R");
        arvore.inserir(".-..", "L");
        arvore.inserir(".--", "W");
        arvore.inserir(".--.", "P");
        arvore.inserir(".---", "J");
        arvore.inserir(".----", "1");
        arvore.inserir("-", "T");
        arvore.inserir("-.", "N");
        arvore.inserir("-..", "D");
        arvore.inserir("-...", "B");
        arvore.inserir("-....", "6");
        arvore.inserir("-..-", "X");
        arvore.inserir("-.-", "K");
        arvore.inserir("-.-.", "C");
        arvore.inserir("-.--", "Y");
        arvore.inserir("--", "M");
        arvore.inserir("--.", "G");
        arvore.inserir("--..", "Z");
        arvore.inserir("--...", "7");
        arvore.inserir("--.-", "Q");
        arvore.inserir("---", "O");
        arvore.inserir("---..", "8");
        arvore.inserir("----.", "9");
        arvore.inserir("-----", "0");

        arvore.buscar(".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. .---- ..--- ...-- ....- ..... -.... --... ---.. ----. -----");
        arvore.buscar("... --- ... / . ... - --- ..- / .--. .-. . ... ---");

        //.- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --.. .---- ..--- ...-- ....- ..... -.... --... ---.. ----. -----
    }
}