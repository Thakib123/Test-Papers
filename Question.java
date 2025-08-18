public class Question {
    private int points;
    private int difficulty;
    private int answerSpace;
    private String questionText;

    // Constructor
    public Question(int points, int difficulty, int answerSpace, String questionText) {
        this.points = points;
        this.difficulty = difficulty;
        this.answerSpace = answerSpace;
        this.setQuestionText(questionText);
    }

    // Method to get string representation of the question
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Question: ").append(getQuestionText()).append("\n");
        stringBuilder.append("Points: ").append(points).append("\n");
        stringBuilder.append("Difficulty: ").append(difficulty).append("\n");
        stringBuilder.append("Answer Space: ").append(answerSpace).append(" lines\n");
        return stringBuilder.toString();
    }

    // Example usage in main method
    public static void main(String[] args) {
        // Creating a sample question
        Question question = new Question(10, 2, 2, "What is the capital of France?");
        
        // Printing the string representation of the question
        System.out.println(question);
    }

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
}
