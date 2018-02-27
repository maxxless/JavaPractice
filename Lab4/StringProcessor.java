package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class StringProcessor {
    public String TEXT = "";


    public String readInputText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String: ");
        return br.readLine();
    }

    public String processText(String inputText) {
        StringBuilder finalStirng = new StringBuilder(inputText);

        String regexpForSentences = "[\\.!?]";
        String regexpForWords = "\\w+[\\.!?,\\s]";

        Matcher m = Pattern.compile(regexpForSentences).matcher(inputText);

        int firstIndex = 0;

        while (m.find()) {
            int firstWordIndex = firstIndex;
            String firstWord = "";
            String longestWord = "";

            String sentence = inputText.substring(firstIndex, m.start() + 1);

            Matcher wordsM = Pattern.compile(regexpForWords).matcher(sentence);

            while (wordsM.find()) {
                String word = sentence.substring(wordsM.start(), wordsM.end() - 1);

                if ((word.substring(0,1).matches("[aeiouAEIOU]")) && (firstWord.equals(""))) {
                    firstWord = word;
                }

                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            String finalSentence = "";
            if ((!longestWord.equals("")) && (!firstWord.equals("")) && (!longestWord.equals(firstWord))) {
                finalSentence = swap(sentence, firstWord, longestWord);
                TEXT =  finalSentence;
            }

            if (!finalSentence.equals("")) {
                finalStirng.replace(firstIndex, m.end(), finalSentence);
            }

            firstIndex = m.end();
        }

        return finalStirng.toString();
    }


    public String swap(String sentence, String firstWord, String longestWord) {
        String finalString = "";

        finalString = (sentence.replaceFirst(firstWord, longestWord));

        Matcher m = Pattern.compile(longestWord).matcher(finalString);
        m.find();
        if (sentence.indexOf(longestWord) > sentence.indexOf(firstWord)) {
            m.find();
        }
        int firstIntex = m.start();
        int lastIndex = m.end();

        finalString = finalString.substring(0, firstIntex) + firstWord + finalString.substring(lastIndex);

        return finalString;
    }

    public void showResult(String resultText) {
        System.out.println("\nFinal string:\n" + resultText);
    }

}
