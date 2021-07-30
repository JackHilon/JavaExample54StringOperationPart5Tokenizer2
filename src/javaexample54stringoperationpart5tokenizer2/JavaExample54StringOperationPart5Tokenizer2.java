
package javaexample54stringoperationpart5tokenizer2;

import java.util.ArrayList;
import java.util.Scanner;


public class JavaExample54StringOperationPart5Tokenizer2 {

    
    public static void main(String[] args) {
        
        
        
        String s= "5+8+4+3+9=27";
        
        Scanner stringTokenizer=new Scanner(s);
        
        stringTokenizer.useDelimiter("[+=]"); // token as delimiter (+, =, or both)
                                              // but be careful down here 
                                              //       \||/
                                              // stringTokenizer.useDelimiter("+=");
                                              // this means the string "+=" is used as delimiter
             
        String token;
        
        while(stringTokenizer.hasNext())
        {
            token=stringTokenizer.next();
            System.out.println(token);
        }
        
        System.out.println();
        System.out.println();
        
        TokenHelper.PrintArrayListStrings(TokenHelper.StringTokenizer("3 + 4+5=9", "=+"));
        System.out.println("---");
        TokenHelper.PrintArrayListStrings(TokenHelper.StringTokenizer("3 + 4+5=9", "=+", "+"));
        System.out.println("---");        
        TokenHelper.PrintArrayListStrings(TokenHelper.StringTokenizer("1+2+3=4=5+=6=+7 8 9 10", "=+"));
        System.out.println("---");
        TokenHelper.PrintArrayListStrings(TokenHelper.StringTokenizer("1+2+3=4=5+=6=+7 8 9 10", "=+", "+"));
        System.out.println("---");
        ArrayList<String> z1=TokenHelper.StringTokenizer(" + + = = += =+ ++=++ ", "=+");
        System.out.println("z1 size is: "+z1.size());
        TokenHelper.PrintArrayListStrings(z1);
        System.out.println("---");
        ArrayList<String> z2=TokenHelper.StringTokenizer(" + + = = += =+ ++=++ ", "=+", "+");
        System.out.println("z2 size is: "+z2.size());
        TokenHelper.PrintArrayListStrings(z2);
        System.out.println("---");
        ArrayList<String> z3=TokenHelper.StringTokenizer(" + + = = += =+ ++=++ ", "=+", "#");
        System.out.println("z3 size is: "+z3.size());
        TokenHelper.PrintArrayListStrings(z3);
        
        System.out.println();
        System.out.println();
        
        String str2 = "a| b c";
        
        Scanner tokenizer2=new Scanner(str2);
        tokenizer2.useDelimiter("[|]");
        
        String k;
        while (tokenizer2.hasNext()) {            
            k=tokenizer2.next();
            System.out.println("("+k+")");
        }
        
        System.out.println("---");
        
        tokenizer2=new Scanner(str2);
        tokenizer2.useDelimiter("[ ]");
        
        while (tokenizer2.hasNext()) {            
            k=tokenizer2.next();
            System.out.println("("+k+")");
        }
        
        System.out.println("---");
        
        tokenizer2=new Scanner(str2);
        tokenizer2.reset(); // to go back to administrative installing conf. (geographic region, separation-token, and number-system-base)
                                                    // looks like tokenizer2.useDelimiter("[ ]");
        while (tokenizer2.hasNext()) {            
            k=tokenizer2.next();
            System.out.println("("+k+")");
        }
        
        System.out.println();
        System.out.println();
        
        String str3 ="one plus two plus three plus four five";
        
        Scanner tokenizer3 =new Scanner(str3);
        
        tokenizer3.useDelimiter(" plus "); // string as delimiter
        
        while (tokenizer3.hasNext()) {            
            k=tokenizer3.next();
            System.out.println("#"+k+"#");
        }
        
    }// end main()
    
    
}
