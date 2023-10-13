package javaapplication3;
import java.util.Arrays;
import java.util.Random;

public class JavaApplication3 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {1,2,3,4,5,6,7};
        Random r = new Random();
        
        for(int i=0;i<array.length;i++)
        {
            int randomindex = r.nextInt(array.length);
            int temp = array[randomindex];
            array[randomindex]=array[i];
            array[i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
    
}
