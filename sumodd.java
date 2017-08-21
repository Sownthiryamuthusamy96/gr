import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumodd
{
	public static void main(String[] args) throws NumberFormatException, IOException
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//	int n=Integer.parseInt(br.readLine());
		int sum=0,count=0;
		for(int i=1;i<=15;i++)
		{     
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println(""+sum);
		System.out.println();
		for(int i=1;i<=15;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				count=count+i;
			}
		}
		System.out.println(count);
		}
}
