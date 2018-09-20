/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)
public class ASCIIArt {
	
	public static void Legs() {
		System.out.print("         \"/\" ");
		System.out.println("\"\\\"");
		
		System.out.print("        \"/\" ");
		System.out.println("  \"\\\"");
		
		System.out.print("       \"/\" ");
		System.out.println("    \"\\\"");
		
		System.out.print("      \"/\" ");
		System.out.println("      \"\\\"");
		
		System.out.print("     \"/\" ");
		System.out.print("        \"\\\"\n");
	}
	
	public static void Feets() {
		System.out.print(" mmmmm");
		System.out.print("             mmmmm");
		
	}
	
	public static void upper_Body() {
		System.out.println("         ________");
		System.out.println("        \"|      |\"");
		System.out.print("        \"|      |\"");
		Legs();
		System.out.print("     W             W");
		
	}
		
	public static void down_Body() {
		System.out.println("\n        \"|      |\"");
		System.out.println("        \"|______|\"----------@");
	}
	
	public static void head() {
		System.out.println("          M____M");
		System.out.println("         (      )");
		System.out.println("        (        )");
		System.out.println("       (__*____*__)");
		System.out.println("            OO     ");
		System.out.println("       |____vv____|");
		System.out.println("       \"(       ) \" ");
		
		
	}
	
			
	public static void main(String[] arg) {
		head();
		upper_Body();
		down_Body();
		Legs();
		Feets();
		System.out.println(" \n\nThis here is a monkey which is goofing off to the computer world.");
		
	}
}