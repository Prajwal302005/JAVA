
public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=109,b=122,c=245;
		   int max=0; 
		   if(a>b) {
			   if(a>c) {
			   max=a; 
		   }
			   else {
			   max=c;
		   }
		  }
		   if(b>a) {
			   if(b>c) {
				   max=b;
			   }else {
				   max=c;
			   }
		   }
			System.out.println("max num is=" + max);
	}

}
