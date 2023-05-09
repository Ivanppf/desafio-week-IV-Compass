import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz {

    private String[] questions;
    private String[] answers;

    public String[] getQuestions() {
        return questions;
    }

    public String[] getAnswers() {
        return answers;
    }

    public Quiz() {
        questions = new String[10];
        answers = new String[questions.length];
        Random random = new Random();

        for (int i = 0; i < questions.length; i++) {

            int n1 = random.nextInt(1, 100);
            int n2 = random.nextInt(1, 100);
            questions[i] = n1 + " + " + n2;
            answers[i] = "" + (n1+n2);

        }

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = "";
        while (true) {
            try {
                System.out.print("Type your name here: ");
                name = input.nextLine();
                if (!name.matches("[a-zA-Z]+"))
                    throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("ERROR, insert a valid name!");
            }
        }
        int right = 0;
        int wrong = 0;

        Quiz q = new Quiz();
        String[] questions = q.getQuestions();
        String[] a = q.getAnswers();

        for (int i = 0; i < questions.length; i++) {

            String answer;

            while (true) {
                try {
                    System.out.print("What is " + questions[i] + "? ");
                    answer = input.nextLine();
                    if (!answer.matches("[0-9]+"))
                        throw new Exception();
                    break;
                } catch (Exception e) {
                    System.out.println("ERROR, only numbers are allowed!");
                }
            }

            if (answer.equals(a[i])) {
                System.out.println("Right answer");
                right++;
            }
            else {
                System.out.println("Wrong answer");
                wrong++;
            }

        }

        System.out.println("\nUser: " + name);
        System.out.println("right: " + right);
        System.out.println("wrong: " + wrong);

    }

}
