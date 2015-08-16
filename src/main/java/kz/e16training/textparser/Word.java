package kz.e16training.textparser;

import java.util.LinkedList;
import java.util.List;

/**
 * Word of sentence.
 *
 */
public class Word {
    private String word;
    private List<Word> words;

    public Word(String word) {
        this.word = word;
        this.words = new LinkedList<>();
    }

    public void addWord(Word word) {
        words.add(word);
    }
}
