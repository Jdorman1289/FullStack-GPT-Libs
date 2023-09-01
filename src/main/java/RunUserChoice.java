import java.util.Scanner;

public class RunUserChoice {
    static MadLib madlib = new MadLib();
    static Scanner sc = new Scanner(System.in);

    public static void gameTime() {
        System.out.println("Input an adj: ");
        madlib.setAdj(sc.next());
        System.out.println("\n****************\n");
        System.out.println("Input a noun: ");
        madlib.setNoun(sc.next());
        System.out.println("\n****************\n");
        System.out.println("Input an adv: ");
        madlib.setAdv(sc.next());
        System.out.println("\n****************\n");
        System.out.println("Input a verb: ");
        madlib.setVerb(sc.next());
        System.out.println("\n****************\n");

        madlib.setStory();
        String newStory = madlib.getStory();
        madlib.setSavedStories(newStory);

        System.out.printf("""
                                
                *************-Your Story-************
                                
                %s
                                
                *************-The End-***************
                """, newStory);

        System.out.println("\n");
        int userChoice = ShowMainMenu.MainMenu();
        RunUserChoice.run(userChoice);
    }

    public static void showStories() {
        for (String story : madlib.getSavedStories()) {
            System.out.printf("""
                                    
                    *************-Your Story-************
                                    
                    %s
                                    
                    *************-The End-***************
                    """, story);
        }
        System.out.println("\n");
        int userChoice = ShowMainMenu.MainMenu();
        RunUserChoice.run(userChoice);
    }

    public static void run(int userChoice) {
        if (userChoice == 1) {
            gameTime();
        } else if (userChoice == 2) {
            showStories();
        } else {
            System.out.println("Peace out!");
            System.exit(0);
        }
    }
}
