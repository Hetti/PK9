import java.util.Scanner;
class LuLz {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);
	String rainbowdash="";
	String y="you";
	System.out.println("Please type in the word "+y);
	if(scanner.hasNext()){
		rainbowdash=scanner.next();
		System.out.println("hi "+rainbowdash);
		
        } else 
        System.out.println("Bad Luck Dude");
    }
}
