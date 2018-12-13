import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversedWords {
    public static void main(String[]args) {
        String[] words = {
                "привет", "тевирп", "ненужно", "пропустить", "нужно", "онжун",
        };


        List<Integer> usedIndexes;
        usedIndexes = new ArrayList<>();

        for (int i = 0; i < words.length; i++ ) {
            String reversed = new StringBuilder(words[i]).reverse().toString();
            int index = Arrays.asList(words).indexOf(reversed);
            if(index != -1 && !usedIndexes.contains(i)) {
                usedIndexes.add(index);
                System.out.println("Pairs of words are: " + words[i] + " : " + words[index]);
            }
        }
    }
}
