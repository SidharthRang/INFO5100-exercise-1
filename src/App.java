public class App {

    //Generate an array of random numbers
    public static int[] GetRandomNumbers(int size) {
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++) {
            int n = (int) (Math.random() * 9) + 1;
            num[i] = n;
        }
        return num;
    }

    public static void main(String[] args) throws Exception {

        //Dummy names for Students in a session
        String[] names = new String[] { "A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T" };

        Student[] students = new Student[20];
        for (int i = 0; i < 20; i++) {
            //First 10 Students are Part Time
            if(i<10){
                students[i] = new PartTime(names[i],App.GetRandomNumbers(15));
            }
            //Last 10 Students are Full Time
            else{
                students[i] = new FullTime(names[i],App.GetRandomNumbers(15),App.GetRandomNumbers(2));
            }
        }
        
        Session session = new Session(students);
        session.PrintAvgScores();
        session.PrintExamScores();
        session.PrintPartTimeStudents();
        session.PrintQuizScores();
    }
}
