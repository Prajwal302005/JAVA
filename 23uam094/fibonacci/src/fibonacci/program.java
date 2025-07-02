package fibonacci;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		int first =0; int second=1;
		System.out.println("fibonacci series :");
		for(int i=0;i<n;i++)
		{
			 System.out.println(first + " ");
			 int nxt = first + second;
	            first = second;
	            second = nxt;

		}
		
	}

}
