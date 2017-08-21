import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lcm
{
	public static void main(String[] args) throws NumberFormatException, IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


		        int n1 = Integer.parseInt(br.readLine());
		        int n2 = Integer.parseInt(br.readLine());
		        int lcm;
		        lcm = (n1 > n2) ? n1 : n2;
		        while(true)
		        {
		            if( lcm % n1 == 0 && lcm % n2 == 0 )
		            {
		                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
		                break;
		            }
		            ++lcm;
		        }
		    
		}
}
