public class FullTime extends Student {
    int[] examscores = new int[2];

    public FullTime(String name, int[] scores, int[] examscores) {
        this.name = name;
        this.quizScore = scores;
        this.examscores = examscores;
        this.type = "Full";
    }
}
