import java.util.ArrayList;

public class WordManager {
    private ArrayList<Word> vocabList;

    public WordManager() {
        vocabList = new ArrayList<>();
    }

    public void addWord(Word word) {
        vocabList.add(word);
    }

    public void listAllWords() {
        if (vocabList.isEmpty()) {
            System.out.println("No vocabulary yet.");
            return;
        }

        for (Word word : vocabList) {
            System.out.println(word);
        }
    }

    public ArrayList<Word> getVocabList() {
        return vocabList;
    }
}
