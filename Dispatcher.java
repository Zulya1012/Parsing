package prs;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Dispatcher {
	public static void main(String[] args) {
		String s = "A Java program is nostly a collection of objects talking to other objects "
				+ "by invoking each other's methods. Every object is of a certain type, "
				+ "and that type is defined by a class or an interface. Most Java programs "
				+ "use a 456 99764 collection of objects of many different types.";
		String[] array = s.split("\\. ");
		for (String temp : array) {
//			System.out.println(temp);		
		}
		String s1 = "Java";
		Pattern p =  Pattern.compile("a?");
		Matcher m = p.matcher(s1);
		while (m.find()) {
//			System.out.println(m.start() + " " + m.end()+ " " + m.group());
		}
		Scanner sc = new Scanner(s);
		while(sc.hasNext()) {
			if (sc.hasNext("Java")) {
			System.out.println(sc.next());
			}
			else{
				if(sc.hasNextInt()) {
					System.out.println(sc.nextInt());
				}
				else {
					sc.next();
				}
			}
		}

	}

}
