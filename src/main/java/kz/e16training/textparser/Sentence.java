package kz.e16training.textparser;

import java.util.LinkedList;
import java.util.List;

/**
 * Sentence of line.
 *
 */
public class Sentence {
    private String sentence;
    private List<Word> words;
    private List<Sentence> sentences;

    public Sentence(String sentence) {
        this.sentence = sentence;
        this.sentences = new LinkedList<>();
        this.words = new LinkedList<>();
    }

    public void addSentence(Sentence sentence) {
        sentences.add(sentence);
    }

    public List<Word> parseSentenceForWords(Sentence sentence) {
        return Parser.getWordsFromSentence(sentence);
    }
}
