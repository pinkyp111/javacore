package udemychap3;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("To check the string palindrome or not");
		String a="abba";
		int leng=a.length();
		System.out.println(leng);
		for(int i=0;i<=leng;i++) //i=0,1,2,3,4,5;
		for(int j=leng-1;j>=0;j--)	//j=6,5,4,3,2,1,0;
		{
		if(a.charAt(i)==a.charAt(j));//a[0]=a[6](p=p)//
		else
			System.out.println("not  palindrome");	
		}							
		System.out.println(" palindrome");
		
		
}
		}


		

			
