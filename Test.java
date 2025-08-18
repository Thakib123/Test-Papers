import java.util.List;

public class Test {
    private List<ObjectiveQuestion> questions;
    private int totalPoints;

    // Constructor
    public Test(List<ObjectiveQuestion> questions) {
        this.questions = questions;
        this.totalPoints = calculateTotalPoints();
    }

    // Method to calculate total points of the test
    private int calculateTotalPoints() {
        int total = 0;
        for (ObjectiveQuestion question : questions) {
            total += question.getPoints();
        }
        return total;
    }

    // Method to get total points of the test
    public int getPoints() {
        return totalPoints;
    }

    // Method to get string representation of the test
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (ObjectiveQuestion question : questions) {
            stringBuilder.append(question.getQuestionText()).append("\n");
            stringBuilder.append("Points: ").append(question.getPoints()).append("\n");
            stringBuilder.append("Difficulty: ").append(question.getDifficulty()).append("\n");
            stringBuilder.append("Answer Space: ").append(question.getAnswerSpace()).append(" lines\n");
            stringBuilder.append("\n");
        }
        stringBuilder.append("Total Points: ").append(totalPoints).append("\n");
        return stringBuilder.toString();
    }

    // Method to generate answer key for the test
    public String generateAnswerKey() {
        StringBuilder answerKey = new StringBuilder();
        for (ObjectiveQuestion question : questions) {
            answerKey.append(question.toStringForGrading()).append("\n");
        }
        return answerKey.toString();
    }

    // Example usage in main method
    public static void main(String[] args) {
        // Create a list of objective questions
        List<ObjectiveQuestion> questions = List.of(
                new ObjectiveQuestion(5, 1, 2, "What is 2+2?", "4"),
                new ObjectiveQuestion(10, 2, 3, "Who is the current president of the United States?", "Joe Biden")
                // Add more questions here...
        );

        // Create a test
        Test test = new Test(questions);

        // Print the string representation of the test
        System.out.println("Test:\n" + test);

        // Print the total points of the test
        System.out.println("Total Points: " + test.getPoints());

        // Print the answer key
        System.out.println("Answer Key:\n" + test.generateAnswerKey());
    }
}
