import java.util.Random;

public class Words {
    private String[] TestWords = {"актер","аллея","дикий","буква","ехать","слово","жилье","зачет","ладья","мафия"};

    public char[] GetWord(){
        Random random = new Random();
        return TestWords[random.nextInt(TestWords.length - 0) + 0].toCharArray();
    }
}
