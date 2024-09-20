package Expressions.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Pattern refers to the pattern to be used in a search
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        //Matcher used to search for the pattern
        Matcher matcher = pattern.matcher("Visit w3schools!");

        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        }
        else {
            System.out.println("Match not found");
        }
    }    
}
