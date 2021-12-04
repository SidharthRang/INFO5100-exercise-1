import java.util.Arrays;

public class Session {
    Student[] students = new Student[20];
    int[] scores = new int[] { 5, 6, 4, 8, 5, 10, 10, 7, 7, 3, 9, 2, 2, 4, 5, 5, 9, 1, 9, 1 };

    public Session(Student[] students) {
        this.students = students;
    }

    public void printQuizScores() {
        System.out.println("The Quiz Scores in this session are");
        Arrays.sort(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }

    public void printPartTimeStudents() {
        System.out.println("The Part Time Students are");
        for (Student student : students) {
            if (student.type == "Part") {
                System.out.println(student.name);
            }
        }
    }

    public void printAvgScores() {
        System.out.println("The Average Scores are");
        for (Student student : students) {
            double score = student.calculateAverageScore();
            System.out.println(String.format("%.2f", score));
        }
    }

    public void printExamScores() {
        System.out.println("The Exam Scores are");
        for (Student student : students) {
            if (student.type == "Full") {
                FullTime s = (FullTime) student;
                int[] examscores = s.examscores;
                System.out.println(examscores[0] + " " + examscores[1]);
            }
        }
    }

}
