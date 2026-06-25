public class Word {
    private String word;
    private String meaning;
    private String definition;

    public Word(String word, String meaning, String definition) {
        this.word = word;
        this.meaning = meaning;
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getDefinition() {
        return definition;
    }

    @Override
    public String toString() {
        return word + " (" + meaning + "): " + definition;
    }

    public String toFileString() {
        return word + "|" + meaning + "|" + definition;
    }
}