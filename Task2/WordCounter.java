import java.util.*;
import java.io.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a text or provide the path to a file:");
        String input=sc.nextLine();
        String txt="";
        if(input.toLowerCase().endsWith(".txt")) {
            txt=readFile(input);
        } 
        else{
            txt=input;
        }
        String[] words=txt.split("[\\s\\p{Punct}]+");
        int wordCount=0;
        for(String word:words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }
        System.out.println("Total words: "+wordCount);
        sc.close();
    }
    private static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try{
            File file=new File(filePath);
            Scanner fscanner=new Scanner(file);
            while (fscanner.hasNextLine()) {
                content.append(fscanner.nextLine()).append("\n");
            }
            fscanner.close();
        } 
        catch(Exception e) {
            System.out.println("File not found...");
        }
        return content.toString();
    }
}
