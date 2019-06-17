package task2;

public class Main {
    public static void main(String[] args) {
        Vocabulary vocab = new Vocabulary();

        vocab.addWordsForTranslation("WORD", "слово");
        vocab.addWordsForTranslation("WORLD", "планета");
        vocab.addWordsForTranslation("HELLO", "привет");
        vocab.addWordsForTranslation("I", "я");
        vocab.addWordsForTranslation("YOU", "тебя");
        vocab.addWordsForTranslation("LOVE", "любить");
        vocab.addWordsForTranslation("WORK", "работать");

        System.out.println(vocab.translateText("I love to work"));
    }
}
