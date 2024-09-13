import  java.util.*;
public class check_palindrom_or_not{
   public static void main(String[] args) 
    {
        System.out.println("input string:");
        Scanner ob1 = new Scanner(System.in);
        StringBuilder str = new StringBuilder(ob1.nextLine());
        StringBuilder str2 = new StringBuilder(str);
        for(int i=0 ; i<str.length()/2; i++)
        {
            int indexf =i, indexl=str.length()-1-i;
            char front = str.charAt(indexf);
            char back = str.charAt(indexl);
            str.setCharAt(indexf, back); 
            str.setCharAt(indexl, front);
        }
        System.out.println(str);
        if(str == str2){
            System.out.println("entered string is a palindrom");
        }else{
            System.out.println("Not palindrom string");
        }
    }
}