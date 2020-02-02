import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
      String ageString = console.readLine("How old are you? ");
      int age = Integer.parseInt(ageString);
      if (age < 18) {
        console.printf("Sorry. You must be at least 18 to use this program.\n");
        System.exit(0);
      } 
      String name = console.readLine("Enter a Name: ");
      String adjective = console.readLine("Enter an adjective ");
      String noun;
      boolean isInvalidWord;
      do{
       noun = console.readLine("Enter a noun ");
       isInvalidWord = (noun.equalsIgnoreCase("dork")||
                        noun.equalsIgnoreCase("jerk")||
                        noun.equalsIgnoreCase("dick") );
       if (isInvalidWord){
       console.printf("That word is not allowed! Please try again! \n\n");
       }       
      } while(noun.equalsIgnoreCase("dork")||
              noun.equalsIgnoreCase("jerk")||
              noun.equalsIgnoreCase("dick"));
      String adverb = console.readLine("Enter an adverb ") ; 
      String verb = console.readLine("Enter a verb ending in ing ");
      console.printf("Here is your Story:\n---------------\n");
      console.printf("%s is a %s %s.",name,adjective,noun);
      
      console.printf("%s is always %s %s.\n",name,adverb,verb);
    }
    
}