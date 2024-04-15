package random;
import java.util.*;
public class fourth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		c = c.toLowerCase();
		int s = 0;
		int e = c.length()-1;
		while (s<= e) {
			if (c.charAt(s)!=c.charAt(e)) {
				System.out.println("not pallindrome");
				break;
				
			}
			s++;
			e--;
		}
		System.out.println("pallindrome");
		
		
	}

}
