package javaapplication3;
import java.util.*;
import java.util.HashMap;
public class RomantoInteger{
   
public static int  RomantoInteger(String str) {
    if(str==null || str.length()==0){
        return 0;
    }
        HashMap<Character,Integer> charmap = new HashMap<>();
        
        charmap.put('I',1);
        charmap.put('V',5);
        charmap.put('X',10);
        charmap.put('L',50);
        charmap.put('C',100);
        charmap.put('D',500);
        charmap.put('M',1000);
        
        int result = 0;
        
        for(int i=0;i<str.length()-1;i++)
        {
            if(charmap.get(str.charAt(i))>=charmap.get(str.charAt(i+1)))
            {
                result+=charmap.get(str.charAt(i));
            }
            else {
                result-=charmap.get(str.charAt(i));
            }
        }
        
        result=result+charmap.get(str.charAt(str.length()-1));
        
        return result;
       
}
public static void main(String[] args)
    {
        System.out.println("Enter a Roman Number:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = RomantoInteger(str);
        System.out.println(result);
    }
}
