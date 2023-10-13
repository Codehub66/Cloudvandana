package javaapplication3;

import java.util.*;
public class Panagram {
    
    public static void containAllletter(String str)
    {
        str = str.toLowerCase();
        boolean allpresent = true;
        for(char ch='a';ch<='z';ch++)
        {
            if(!str.contains(String.valueOf(ch)))
            {
                allpresent=false;
                break;
            }
        }
        
        if(allpresent)
        {
            System.out.println("Panagram string");
        }
        else
        {
            System.out.println("Not a Panagram String");
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        containAllletter(str);
    }
    
}
