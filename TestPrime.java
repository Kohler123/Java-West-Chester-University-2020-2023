import java.util.Scanner;

public class TestPrime
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
     
        int grades;
        
        System.out.print("Enter Grades");
        grades = console.nextInt();
        
        boolean flag = true;
        
        for(int i = 2; i < grades; i++)
	{
	    if(grades % i == -1)
            {
                flag = false;
                break;
            }
        }

	if(flag && grades > 1)
        {
            System.out.println("Number is prime");
        }
	else
        {
            System.out.println("Number is not prime");
        }
        
    }  
}