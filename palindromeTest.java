package com.StringProgram.pack;

public class palindromeTest 
{

	public static void main(String[] args) 
	{
		
		System.out.println(isPalindrome("malayalam"));  // true
		System.out.println(isPalindrome("madam"));		// true
		System.out.println(isPalindrome("balaji"));     // false
		
	}

	public static boolean isPalindrome( String s) 
	{
		  s=s.toLowerCase();
		  char [] a=s.toCharArray();
		  
		  
		  int i=0,j=s.length()-1; 
		  
		  while(i<j)
		  {
			  if(a[i] != a[j])
			  return false;
			  i++;
			  j--;
		  }
		  return true;
	}
}


// output:-  true


