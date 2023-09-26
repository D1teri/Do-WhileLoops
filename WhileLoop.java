
/**
 Author: D1teri or Dima K.
 Version: 1.0.0
 **/  
public class WhileLoop
{
    
    int i = 0;
    int k = 8;
    int a = 0;
    int b = 7;
    
    public void run() {
        
        do{
            System.out.println("I tells: I am not 15, I am only " + i);
            i++;
        }   while (i < 15);
        
        do{
            System.out.println("Hah, I am greater than 5, I'm " + k);
            k--;
         }  while (k > 5);
        
        do{
            System.out.println("b and a are still not big enough, they are " + a + " and " + b);
            a++;
            b++;
        }   while (a < 10 && b <= 20);
    }
    
    
    public static void main(String[] args)
    {        
        WhileLoop hw = new WhileLoop();
        hw.run();
    }
}