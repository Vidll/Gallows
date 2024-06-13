import java.util.Scanner;

public class GameInterface {

    private GameManager manager = new GameManager();

    public void UpdateInterface(int error, char[] guessWord) {
        System.out.print("You word:");
        System.out.println(guessWord);
        System.out.println("Erros: " + error);
    }

    public char GetLitter() {

        Scanner in = new Scanner(System.in);
        System.out.print("Write Litter: ");
        String c = in.next();
        return c.toLowerCase().toCharArray()[0];
    }

    public void WinGame() {
        System.out.println("You Win");
    }

    public void LoseGame() {
        System.out.println("You Lose");
    }

    public void StartGame() {
        Scanner in = new Scanner(System.in);
        boolean repeat = true;
        while (repeat){
            System.out.println("Chose: [1] New game, [2] Exit game");
            int val = in.nextInt();
            switch (val){
                case 1:
                    System.out.println("New game");
                    manager.NewGame(this);
                    break;
                case 2:
                    repeat = false;
                    System.out.println("Exit game");
                    break;
            }
        }
    }
}
