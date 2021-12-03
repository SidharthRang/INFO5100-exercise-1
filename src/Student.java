import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String name,type;
    int[] quizScore = new int[15];

    public double CalculateAverageScore(){
        return Arrays.stream(this.quizScore).average().getAsDouble();
    }
}
