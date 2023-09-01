public class RunGame {

    public static void main(String[] args) {
        int userChoice = ShowMainMenu.MainMenu();

        RunUserChoice.run(userChoice);

    }
}
