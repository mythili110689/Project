package testcases;

import org.testng.annotations.Test;

public class StaticClass {
	 @Test
	public void occurence() {
		
	String code = "I am a wonderful person";
	char[] c = code.toCharArray();
	for(int i=0;i<c.length;i++) {
		
			if (c[i]!=c[j]) {
				
			}
		}
		
}
//	@Test
//	public void anagram() {
//		String str1 = "Listen";
//		String str2 = "Silent";
//		char[] s1 = str1.toCharArray();
//		char[] s2 = str2.toCharArray();
//		if(s1.length == s2.length)  {
//			System.out.println("The string length matches");
//			
//			
//		}
//		Arrays.sort(s1);
//		Arrays.sort(s2);
//		
//				
//	}  
// 	
//	
//}
	 
//	@Test//to print alphabets
//	public void print() {
//		String str = "#My@thi11";
//	    char[] s1 = str.toCharArray();
//		String number = "",alphabets= "",splchar= ""; 
//		for (char c : s1) {
//			if(Character.isAlphabetic(c)) {
//				alphabets = alphabets + c;
//				
//			}else if(Character.isDigit(c)) {
//				number = number + c;
//			}
//			else {
//				splchar = splchar + c;
//				
//			}
//		}
//	System.out.println("The numbers present in string: " + number);	
//	System.out.println("The alphabets present in string: " + alphabets);
//	System.out.println("The special characters present in string: " + splchar);	
//		}
//	}
	
	
	
	//to remove duplicates from string
//	String word = "goodday";
//	@Test
//	public void removeDup() {
//		int count = 0;
//		char[] ch = word.toCharArray();
//		for(int i=0; i<ch.length; i++) {
//			for(int j=i+1; j<ch.length; j++) {
//				if(ch[i]==ch[j]) {
//					count++;
//				}
//			}
//			     if(count==0){
//			    	 System.out.print(ch[i]);
//			    	 				
//			}
//			count = 0;
//		}
//	}
	
	
	
	
		
	//to append strings
//	 String alpha = "abcde";
//	 @Test
//	 public void append() {
//	  String let1 = alpha.substring(0,3);
//	  String let2 = alpha.substring(3);
//	  System.out.print(let1 + "*" + let2);
//	 }

	   
//	static int a;
//	public static void main(String[] args) {
//		StaticClass obj1 = new StaticClass();
//		StaticClass obj2 = new StaticClass();
//		obj1.a =5;
//		obj1.a=7;
//		System.out.println(obj1.a);
//		System.out.println(a);
//		
//	}


	  //to reverse the string 
//	  String name = "Cognizant";
//	  @Test	  
//	  	public void reverseString() {
//	  		char[] ch = name.toCharArray();
//	  		for(int i = ch.length-1; i>=0 ;i--) {
//	  			System.out.print(ch[i]);
//	  		}
//	  	}

	  
	 