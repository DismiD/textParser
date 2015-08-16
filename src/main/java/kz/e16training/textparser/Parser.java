package kz.e16training.textparser;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * File to List parse.
 *
 */
public class Parser {
    private String fileForParse;
    private String encode;

    public Parser(String fileForParse, String encode) {
        this.encode = encode;
        this.fileForParse = fileForParse;
    }

    public void start() {
        try  {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileForParse)), encode));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Sentence> getSentencesFromLine(Line line) {
        List<Sentence> result = new LinkedList<>();
        // do get sentences from line
        return result;
    }

    public static List<Word> getWordsFromSentence(Sentence sentence) {
        List<Word> word = new LinkedList<>();
        //do get words from sentence
        return word;
    }
}
