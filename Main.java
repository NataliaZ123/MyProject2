import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	    Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(calc(input));
	}
	public static String calc(String input){
		int a, b, c;
		String [] strings = input.split(" ");
		if(strings.length != 3){
			return("throws Exception");
		}
		try{
            a = Integer.parseInt(strings[0]);
			b = Integer.parseInt(strings[2]);
			if((a > 10) || (b > 10) ||(a < 1)||(b < 1)){
				return("throws Exception");
			}
			switch (strings[1]){
				case "+":
			    	c = a + b;
			    	return String.valueOf(c);
				case "-":
				    c = a - b;
					return String.valueOf(c);
				case "*":
					c = a * b;
					return String.valueOf(c);
				case "/":
					c = a/b;
					return String.valueOf(c);
				default:
					return("throws Exception");
			}
		}
		catch(NumberFormatException e){
			return("throws Exception");
		}
	}
}