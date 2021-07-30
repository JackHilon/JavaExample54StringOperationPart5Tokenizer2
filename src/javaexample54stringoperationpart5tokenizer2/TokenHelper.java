
package javaexample54stringoperationpart5tokenizer2;

import java.util.ArrayList;
import java.util.Scanner;


public class TokenHelper {
 
    
    public static ArrayList<String> StringTokenizer(String str)
    {
        Scanner tokenizer=new Scanner(str);
        ArrayList<String> res=new ArrayList<>();
        String temp;
        
        while(tokenizer.hasNext())
        {
            temp=tokenizer.next();
            res.add("("+temp+")");
        }
        return res;
    }
    
    // this does not consider multiple separation-tokens as one separation-token.....
    // this consider empty token(string) between multiple separation-tokens
    public static ArrayList<String> StringTokenizer(String str , String delimiter)
    {
        Scanner tokenizer=new Scanner(str);
        tokenizer.useDelimiter("["+delimiter+"]");
        
        ArrayList<String> res=new ArrayList<>();
        String temp;
        
        while(tokenizer.hasNext())
        {
            temp=tokenizer.next();
            res.add("("+temp+")");
        }
        return res;
    }
    
    // to consider multiple separation-tokens as one separation-token
    public static ArrayList<String> StringTokenizer(String str , String delimiter, String special)
    {
        Scanner tokenizer=new Scanner(str);
        tokenizer.useDelimiter("["+delimiter+"]"+special);
        
        ArrayList<String> res=new ArrayList<>();
        String temp;
        
        while(tokenizer.hasNext())
        {
            temp=tokenizer.next();
            res.add("("+temp+")");
        }
        return res;
    }
    
    public static void PrintArrayListStrings(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
