import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestBank {
    private List<Question> questions;

    // Constructor
    public TestBank() {
        this.questions = new ArrayList<>();
    }

    // Method to add a question to the bank
    public void addQuestion(Question question) {
        questions.add(question);
    }

    // Method to generate a test with a given number of random questions
    public Test generateTest(int numberOfQuestions) {
        List<ObjectiveQuestion> selectedQuestions = new ArrayList<>();
        Random random = new Random();

        // Select random questions from the bank
        for (int i = 0; i < numberOfQuestions; i++) {
            Question randomQuestion = questions.get(random.nextInt(questions.size()));
            if (randomQuestion instanceof ObjectiveQuestion) {
                selectedQuestions.add((ObjectiveQuestion) randomQuestion);
            }
        }

        // Create and return a test with selected questions
        return new Test(selectedQuestions);
    }

    // Method to read questions from a file and add them to the bank
    public void readQuestionsFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Reading line: " + line); // Print the line being read
                String[] parts = line.split(",");
                if (parts.length == 5) { // Assuming the format: points,difficulty,answerSpace,questionText,correctAnswer
                    int points = Integer.parseInt(parts[0]);
                    int difficulty = Integer.parseInt(parts[1]);
                    int answerSpace = Integer.parseInt(parts[2]);
                    String questionText = parts[3];
                    String correctAnswer = parts[4];
                    ObjectiveQuestion question = new ObjectiveQuestion(points, difficulty, answerSpace, questionText, correctAnswer);
                    addQuestion(question);
                    System.out.println("Added question: " + question); // Print the added question
                }
            }
            System.out.println("Questions read from file: " + fileName); // Print when done reading file
        } catch (IOException e) {
            System.out.println("An error occurred while reading questions from file: " + fileName);
            e.printStackTrace();
        }
    }

    // Method to write questions to a file
    public void writeQuestionsToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Question question : questions) {
                writer.write(question.toString());
                writer.newLine();
            }
            System.out.println("Questions written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing questions to file: " + fileName);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TestBank testBank = new TestBank();
        testBank.readQuestionsFromFile("questions.txt");

        // Example: Generate a test with 2 random questions
        Test test = testBank.generateTest(2);
        System.out.println(test);
    }
}
