public class GameManager {
    private int errors;
    private GameInterface gameInterface;
    private GameProgress gameProgress;

    public void NewGame(GameInterface gameInterface) {
        this.gameInterface = gameInterface;
        gameProgress = new GameProgress();
        errors = 0;
        gameInterface.UpdateInterface(errors, gameProgress.GetGuessWord());
        UpdateGame();
    }

    private void UpdateGame(){
        while (errors <= 6) {
            if(gameProgress.CheckLitter(gameInterface.GetLitter())) {
                if(gameProgress.CheckGuessWord()){
                    gameInterface.UpdateInterface(errors, gameProgress.GetGuessWord());
                    gameInterface.WinGame();
                    return;
                }
            } else {
                errors++;
            }
            gameInterface.UpdateInterface(errors, gameProgress.GetGuessWord());
        }
        gameInterface.LoseGame();
    }
}