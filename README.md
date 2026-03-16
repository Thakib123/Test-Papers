# Test Papers Assignment 

This Java project, implements a class hierarchy to represent test papers used in a school setting. It includes a variety of question types, a test generator, and optional extra credit features for file output and a test bank. The project demonstrates object-oriented programming principles, such as inheritance, polymorphism, and encapsulation, to manage test questions and generate formatted test and answer key outputs.

## Project Overview

The assignment focuses on designing a system to model different types of test questions and generate tests with their corresponding answer keys. The system includes a base `Question` class and specialized subclasses for objective questions, with functionality to format questions for students and graders. Extra credit features add file output and a `TestBank` class for random question selection and file-based storage.

### Features

- **Class Hierarchy**:
  - **`Question`**: Base class with attributes:
    - `points`: Points awarded for a correct answer.
    - `difficulty`: Integer value between `MIN_DIFFICULTY` and `MAX_DIFFICULTY`.
    - `answerSpace`: Number of lines required for the answer.
    - `questionText`: The question’s text (e.g., "How much wood would a woodchuck chuck?").
    - Provides a string representation for test display.
  - **`ObjectiveQuestion`**: Extends `Question`, adds:
    - `correctAnswer`: The definitive correct answer.
    - Supports string representations for both test (student view) and answer key (grader view).
  - **`FillInTheBlankQuestion`**: Extends `ObjectiveQuestion`, represents questions with a blank to fill (e.g., "____ was the 16th US President.").
    - Test format: Shows a blank (e.g., "______ was the 16th US President.").
    - Answer key format: Highlights the correct answer (e.g., "___Abraham Lincoln___ was the 16th US President.").
  - **`MultipleChoiceQuestion`**: Extends `ObjectiveQuestion`, includes:
    - `possibleAnswers`: A list of answer options, one of which is correct.
    - Test format: Lists options (e.g., "Who lives in a pineapple under the sea? 1. Peter Griffin 2. Scooby Doo 3. Spongebob Squarepants 4. Eric Cartman").
    - Answer key format: Highlights the correct answer (e.g., "3. **** Spongebob Squarepants ****").
    - Fixed `answerSpace` of one line.
  - **`Test`**: Manages a single list of objective questions (not partitioned by subtype).
    - Tracks `totalPoints` (sum of question points).
    - Generates string representations for the test and answer key.

- **Driver Program**:
  - Creates a test with various question types and prints both the test and answer key to the console.
  - Non-interactive; focuses on formatted output.

- **Extra Credit Features**:
  - **File Output (+5 points)**: Saves test and answer key to files with user-specified names.
  - **TestBank (+10 points)**:
    - Maintains a collection of questions.
    - Generates a `Test` with a specified number of randomly selected questions.
    - Reads questions from and writes them to files (file reading is the most complex part).

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE (e.g., IntelliJ IDEA, Eclipse) or command-line tools for compiling and running Java
- For extra credit: Input files for `TestBank` (example files provided, if implemented)

## Thakib Aroworowon
