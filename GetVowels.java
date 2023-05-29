import java.util.Scanner;
/**
Reads a string and prints out all vowels contained in that string.
Vowels are A E I O U a e i o u.
Input: the value of s, a string
Output: a string containing all the vowels in s,
in the order in which they appear in s
*/
public class GetVowels
{
   public static void main(String[] args)
   {
String r = "";
System.out.print("Please enter a String: ");
Scanner in = new Scanner(System.in);
String s = in.nextLine();
// your work here

int n = s.length();
for (int i=0; i< n; ++i) {
    if(s.charAt(i)== 'A'||s.charAt(i)== 'E'||s.charAt(i)== 'I'||s.charAt(i)=='O'||s.charAt(i)== 'U'||
    s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
    r = r+s.charAt(i); 
    }
}
   System.out.println(r);
  }
}
