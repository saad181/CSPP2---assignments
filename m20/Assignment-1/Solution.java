import java.util.Scanner;
/**
 * Class for question.
 */
class Question {
    /**
     * { var_description }.
     */
    private String questiontext;
    /**
     * { var_description }.
     */
    private String[] choices;
    /**
     * { var_description }.
     */
    private int correctAnswer;
    /**
     * { var_description }.
     */
    private int maxMarks;
    /**
     * { var_description }.
     */
    private int penalty;
    /**
     * { var_description }.
     */
    private String response;
    /**
     * Constructs the object.
     */

    /**
     * Constructs the object.
     *
     * @param      question1       The question 1
     * @param      choices1        The choices 1
     * @param      correctAnswer1  The correct answer 1
     * @param      maxMarks1       The maximum marks 1
     * @param      penalty1        The penalty 1
     */
    Question(final String question1, final String[] choices1,
        final int correctAnswer1, final int maxMarks1, final int penalty1) {
       this.questiontext = question1;
        this.choices = choices1;
        this.correctAnswer = correctAnswer1;
        this.maxMarks = maxMarks1;
        this.penalty = penalty1;

    }
    /**
     * { function_description }.
     *
     * @param      choice  The choice
     *
     * @return     { description_of_the_return_value }
     */
    public boolean evaluateResponse(final String choice) {
        if (choice.equals(choices[correctAnswer - 1])) {
            return true;
        }
        return false;
    }
    /**
     * Gets the correct answer.
     *
     * @return     The correct answer.
     */
    public int getCorrectAnswer() {
        return this.correctAnswer;
    }
    /**
     * Gets the question text.
     *
     * @return     The question text.
     */
    public String getQuestionText() {
        return this.questiontext;
    }
    /**
     * Gets the choice.
     *
     * @return     The choice.
     */
    public String[] getChoice() {
        return this.choices;
    }
    /**
     * Gets the maximum marks.
     *
     * @return     The maximum marks.
     */
    public int getMaxMarks() {
        return this.maxMarks;
    }
    /**
     * Gets the penalty.
     *
     * @return     The penalty.
     */
    public int getPenalty() {
        return this.penalty;
    }
    /**
     * Sets the response.
     *
     * @param      answer  The answer
     */
    public void setResponse(final String answer) {
     response = answer;
    }
    /**
     * Gets the response.
     *
     * @return     The response.
     */
    public String getResponse() {
        return this.response;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "";
        for (int i = 0; i < choices.length - 1; i++) {
            str = str + choices[i] + "\t";
        }
        return str + choices[choices.length - 1];
    }
}
/**
 * Class for quiz.
 */
class Quiz {
    /**
     * { var_description }.
     */
    private final int onehundred = 100;
    /**
     * { var_description }.
     */
    private Question[] questions;
    /**
     * { var_description }.
     */
    private int size;
    /**
     * Constructs the object.
     */
    Quiz() {
    questions = new Question[onehundred];
    size = 0;
    }
    /**
     * Adds a question.
     *
     * @param      q     The question
     */
    public void addQuestion(final Question q) {
     questions[size++] = q;
    }
    /**
     * Gets the question.
     *
     * @param      index  The index
     *
     * @return     The question.
     */
    public Question getQuestion(final int index) {
        return questions[index];
    }
    /**
     * Shows the report.
     *
     * @return     { description_of_the_return_value }
     */
    public String showReport() {
        String str = "";
           int result = 0;
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                System.out.println(questions[i].getQuestionText());
                if (questions[i].evaluateResponse(questions[i].getResponse())) {
                    System.out.println(" Correct Answer! - Marks Awarded: "
                        + questions[i].getMaxMarks());
                    result = result + questions[i].getMaxMarks();
                } else {
                    System.out.println(" Wrong Answer! - Penalty: "
                        + questions[i].getPenalty());
                    result = result + questions[i].getPenalty();
                }
            }
            return "Total Score: " + result;
        } else {
            return str;
        }
    }
    }


/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      scan       The scan
     * @param      quiz       The quiz
     * @param      q          The question count
     *
     */
    public static void loadQuestions(final Scanner scan,
        final Quiz quiz, final int q) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
       final int varfive = 5;
        final int vartwo = 2;
        final int varthree = 3;
        final int varfour = 4;
        int i;
        if (q == 0) {
            System.out.println("Quiz does not have questions");
            return;
        }
        for (i = 0; i < q; i++) {
            String string = scan.nextLine();
            String[] words = string.split(":");
            // System.out.println(words.length);
            if (words.length < varfive || (words[0].length() == 0)) {
                System.out.println("Error! Malformed question");
                return;
            } else {
            if (words[1].split(",").length < vartwo) {
                System.out.println(words[0] + " "
                    + "does not have enough answer choices");
                return;
            } else if (Integer.parseInt(words[vartwo]) > varfour) {
                System.out.println(
                    "Error! Correct answer choice number is out of" + " "
                    + "range for question text 1");
                return;
            } else if (Integer.parseInt(words[varthree]) <= 0) {
                System.out.println("Invalid max marks for" + " " + words[0]);
                return;
            } else if (Integer.parseInt(words[varfour]) > 0) {
                System.out.println("Invalid penalty for" + " " + words[0]);
                return;
            }
        }
        String[] choices = words[1].split(",");
        Question quiz1 = new Question(words[0], choices,
        Integer.parseInt(words[vartwo]),
        Integer.parseInt(words[varthree]), Integer.parseInt(words[varfour]));
        quiz.addQuestion(quiz1);
        }
        System.out.println(q + " are added to the quiz");
    }
    /**
     * Starts a quiz.
     *
     * @param      scan  The scan
     * @param      quiz  The quiz
     * @param      q     The answer count
     */
    public static void startQuiz(final Scanner scan,
        final Quiz quiz, final int q) {
        // write your code here to display the quiz questions on the console.
        // read the user responses from the console using scanner object.
        // store the user respone in the question object
        try {
        String result;
        for (int i = 0; i < q; i++) {
            // Question questionnum = quiz.getQuestion(i);
            System.out.println(quiz.getQuestion(i).getQuestionText()
                + "(" + quiz.getQuestion(i).getMaxMarks() + ")");
            System.out.println(quiz.getQuestion(i).toString());
            System.out.println();
            result = scan.nextLine();
            quiz.getQuestion(i).setResponse(result);
        }
        } catch (Exception e) {

        }
    }
    /**
     * Displays the score report.
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report using quiz object.
        System.out.println(quiz.showReport());
    }
}

