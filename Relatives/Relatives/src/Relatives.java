//John Carlo Cabanilla
// Java 143
//Syeda Nizami

// This program reports ancestors and descendants for various people given
// a family database.




import java.io.*;
import java.util.*;

public class Relatives {
    public static void main (String[] args) throws FileNotFoundException {
        giveIntro();
        FamilyInfo family = new FamilyInfo();
        Scanner console = new Scanner(System.in);
        System.out.print("What is the input file? ");
        String fileName = console.nextLine();
        Scanner input = new Scanner(new File(fileName));
        System.out.println();

        family.read(input);
        showInfo(console, family);
    }

    // program explained to the user
    public static void giveIntro() {
        System.out.println("This program will show you all of the ancestors");
        System.out.println("and descendants of a person.");
        System.out.println();
    }

    // user prompted for name of person to show info for; info shown
    public static void showInfo(Scanner console, FamilyInfo list) {
    	  String name;
    	    System.out.print("Whom do you want to see info for ('quit' to end)? ");
    	    name = console.nextLine();
    	    System.out.println();
    	    Person next = list.getPerson(name);
    	    if (next == null)
    	      System.out.println("No match.");
    	    else
    	      showRelatives(next);

    }

    // shows the ancestors and descendats of the given person
    public static void showRelatives(Person current) {
    	
        System.out.println("Ancestors:");
        showAncestors(current, 1);
        System.out.println();
        System.out.println("Descendants:");
        showDescendants(current, 1);
        System.out.println();




    }

    public static void showAncestors(Person current, int level) {
    	 if (current != null) {
    	      for (int i = 0; i < level; i++)
    		System.out.print("    ");
    	      System.out.println(current.getName());
    	      showAncestors(current.getMother(), level + 1);
    	      showAncestors(current.getFather(), level + 1);
    	    }
    }

    public static void showDescendants(Person current, int level) { 

    	  if (current != null) {
    	      for (int i = 0; i < level; i++)
    		System.out.print("    ");
    	      System.out.println(current.getName());
    	      for (int i = 1; i <= current.numKids(); i++)
    		showDescendants(current.nthKid(i-1), level + 1);



   }

    }
}