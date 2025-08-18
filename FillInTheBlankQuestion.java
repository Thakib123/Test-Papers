public class FillInTheBlankQuestion extends Question {
    private String correctAnswer;

    // Constructor
    public FillInTheBlankQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
        super(points, difficulty, answerSpace, questionText);
        this.correctAnswer = correctAnswer;
    }

    // Method to get string representation of the question
    @Override
    public String toString() {
        return getQuestionText().replaceAll("______", "___" + "___") + "\n";
    }

    // Method to get string representation of the question with correct answer
    public String toStringWithAnswer() {
        return getQuestionText().replaceFirst("______", "___" + correctAnswer + "___") + "\n";
    }


    // Example usage in main method
    public static void main(String[] args) {
        // Creating a sample fill-in-the-blank question
        FillInTheBlankQuestion question = new FillInTheBlankQuestion(5, 2, 3, "______ was the 16th US President.", "Abraham Lincoln");

        // Printing the string representation of the question
        System.out.println("Question for the student:\n" + question);

        // Printing the string representation of the question with correct answer
        System.out.println("Answer key:\n" + question.toStringWithAnswer());
    }
}
