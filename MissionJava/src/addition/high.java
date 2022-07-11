package addition;

public class high {

	public static void main(String[] args) {
		int a=384;
		int min=9;
		while(a>0)
		{
			int c=a%10;
			if(c<min)
			 min=c;
			a=a/10;
		}
		System.out.println(min);
	}
	
	

}
