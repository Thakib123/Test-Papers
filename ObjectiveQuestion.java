public class ObjectiveQuestion extends Question {
    private String correctAnswer;

    // Constructor
    public ObjectiveQuestion(int points, int difficulty, int answerSpace, String questionText, String correctAnswer) {
        super(points, difficulty, answerSpace, questionText);
        this.correctAnswer = correctAnswer;
    }

    // Method to get string representation of the question
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("Correct Answer: ").append(correctAnswer).append("\n");
        return stringBuilder.toString();
    }

    // Method to get string representation of the question for grading
    public String toStringForGrading() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("Correct Answer: ").append(correctAnswer).append("\n");
        return stringBuilder.toString();
    }

    // Example usage in main method
    public static void main(String[] args) {
        // Creating a sample objective question
        ObjectiveQuestion question = new ObjectiveQuestion(10, 3, 5, "What is the capital of France?", "Paris");
        
        // Printing the string representation of the question
        System.out.println("Question for the student:\n" + question);
        
        // Printing the string representation of the question for grading
        System.out.println("Question for grading:\n" + question.toStringForGrading());
    }

	public int getPoints() {
		
		return 0;
	}

	public Object getDifficulty() {
		
		return 5;
	}

	public Object getAnswerSpace() {
		
		return 3;
	}

}
