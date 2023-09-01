import java.util.Scanner;

public class ShowMainMenu {

    public static int MainMenu() {
        int userInput = 0;
        Scanner sc = new Scanner(System.in);

        while (userInput != 1 && userInput != 2 && userInput != 3) {
            String menu = """
                    1. Play the game
                    2. View played games
                    3. Exit
                    Enter an option (1, 2, or 3):
                    """;
            System.out.println(menu);
            userInput = sc.nextInt();
        }


        return userInput;
    }


}


