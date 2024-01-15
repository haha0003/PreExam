package Ex11;

import java.util.ArrayList;

public class Article {
    private String heading;
    private String body;
    private String author;

    Article(String heading, String body, String author){
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public void getLongestWord(){
        String longestWord = "";
        String[] words = body.split(" ");
        for (int i = 0; i < words.length; i++){
            if (words.length > longestWord.length()){
                longestWord = words[i];
            }
        }
        System.out.println(longestWord);
    }

    public void getWords(){
        String[] words = body.split(" ");
        ArrayList<String> uniqueWords = new ArrayList<>();

        for (String word : words){
            if (!uniqueWords.contains(word)){
                uniqueWords.add(word);
            }
        }

        for (int i = 0; i < uniqueWords.size(); i++){
            System.out.println(1+i + ". " + uniqueWords.get(i));
        }

    }

}
