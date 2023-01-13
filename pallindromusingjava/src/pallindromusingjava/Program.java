package pallindromusingjava;

public class Program {
public static void main(String[] args) {
	String str1 = "";
	String str = "nayan";
	for(int i=str.length()-1;i>=0;i--)
	{
		System.out.println(str.charAt(i));
		str1 = str1 + str.charAt(i);
	}
	
	System.out.println(str1);
	if (str.equals(str1))
	{
		System.out.println("palindrome");
	}else {
		System.out.println("not a pallindrome");
	}
}
}
