import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Create a list of objective questions for the test
        List<ObjectiveQuestion> questions = List.of(
                new ObjectiveQuestion(5, 1, 2, "What is 2+2?", "4"),
                new ObjectiveQuestion(10, 2, 3, "Who is the current president of the United States?", "Joe Biden"),
                new ObjectiveQuestion(8, 3, 2, "What is the capital of France?", "Paris")
                // Add more questions here...
        );

        // Create a test
        Test test = new Test(questions);

        // Print the test
        System.out.println("Test:\n" + test);

        // Print the answer key
        System.out.println("Answer Key:\n" + test.generateAnswerKey());

        // Write the test to a file
        writeToFile("test.txt", test.toString());

        // Write the answer key to a file
        writeToFile("answer_key.txt", test.generateAnswerKey());
    }

    // Method to write data to a file
    private static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Successfully wrote to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to " + fileName);
            e.printStackTrace();
        }
    }
}
