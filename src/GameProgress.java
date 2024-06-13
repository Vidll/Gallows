public class GameProgress {
    private char[] word;
    private char[] guessWord;

    public char[] GetGuessWord() { return this.guessWord; }

    public GameProgress (){
        Words words = new Words();
        this.word = words.GetWord();
        this.guessWord = new char[this.word.length];
        for(int i = 0; i < this.word.length; i++){
            guessWord[i] = '_';
        }
    }

    public boolean CheckLitter(char litter){
        boolean find = false;
        for(int index = 0; index < word.length; index++){
            if(word[index] == litter){
                guessWord[index] = litter;
                find = true;
            }
        }
        if(find) return true;
        return false;
    }

    public boolean CheckGuessWord(){
        for(int i = 0; i < guessWord.length; i++){
            if(guessWord[i] == '_') return false;
        }
        return true;
    }
}