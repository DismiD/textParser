package kz.e16training.textparser;

import java.util.LinkedList;
import java.util.List;

/**
 * Line of book.
 *
 */
public class Line {
    private String line;
    private List<Sentence> sentences;
    private List<Line> lines;

    public Line(String line) {
        this.line = line;
        lines = new LinkedList<>();
        sentences = new LinkedList<>();
    }

    public void addLine(Line line) {
        lines.add(line);
        sentences.addAll(parseLineForSentences(line));
    }

    private List<Sentence> parseLineForSentences(Line line) {
        return Parser.getSentencesFromLine(line);
    }
}
