import java.util.List;

public class MultipleChoiceQuestion extends Question {
    private List<String> possibleAnswers;
    private String correctAnswer;

    // Constructor
    public MultipleChoiceQuestion(int points, int difficulty, int answerSpace, String questionText,
                                  List<String> possibleAnswers, String correctAnswer) {
        super(points, difficulty, answerSpace, questionText);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    // Method to get string representation of the question
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getQuestionText()).append("\n");
        for (String option : possibleAnswers) {
            stringBuilder.append(option).append("\n");
        }
        return stringBuilder.toString();
    }

    // Method to get string representation of the question with correct answer marked
    public String toStringWithAnswer() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getQuestionText()).append("\n");
        for (String option : possibleAnswers) {
            if (option.equals(correctAnswer)) {
                stringBuilder.append("**** ").append(option).append(" ****\n");
            } else {
                stringBuilder.append(option).append("\n");
            }
        }
        return stringBuilder.toString();
    }

    // Example usage in main method
    public static void main(String[] args) {
        // Creating a sample multiple choice question
        List<String> options = List.of("A. Peter Griffin", "B. Scooby Doo", "C. Spongebob Squarepants", "D. Eric Cartman");
        MultipleChoiceQuestion question = new MultipleChoiceQuestion(5, 2, 1, "Who lives in a pineapple under the sea?", options, "C. Spongebob Squarepants");

        // Printing the string representation of the question
        System.out.println("Question for the student:\n" + question);

        // Printing the string representation of the question with correct answer marked
        System.out.println("Answer key:\n" + question.toStringWithAnswer());
    }
}
