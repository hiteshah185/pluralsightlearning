import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ExceptionExample02 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            throw new IllegalArgumentException("Expected exactly one argument (filename)");
        }
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        processFile(reader);
    }
    private static void processFile(BufferedReader reader) throws IOException {
        String inputLine = null;
        while((inputLine = reader.readLine()) != null)
            performOperation(inputLine);
    }

    private static void performOperation(String inputLine) {
        String[] prts = inputLine.split(" ");
        MathOperation operation = MathOperation.valueOf(prts[0].toUpperCase());
        int leftVal = valueFromWord(prts[1]);
        int rightVal = valueFromWord(prts[2]);

        int result = execute(operation, leftVal, rightVal);

        System.out.println(inputLine + " = " + result);
    }
    static int valueFromWord(String word) {
        String[] numberWordsList = {
                "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine", "zero"
        };
        int valueInInt = -1;
        for(int index = 0; index < numberWordsList.length; index++) {
            if(word.equals(numberWordsList[index])) {
                valueInInt = index;
                break;
            }
        }
        if(valueInInt == -1d)
            valueInInt = Integer.parseInt(word);

        return valueInInt;
    }
    static int execute(MathOperation operation, int leftVal, int rightVal) {
        int result = 0;
        switch (operation) {
            case ADD:
                result = leftVal + rightVal;
                break;
            case SUBTRACT:
                result = leftVal - rightVal;
                break;
            case MULTIPLY:
                result = leftVal * rightVal;
                break;
            case DIVIDE:
                result = leftVal / rightVal;
                break;
        }
        return result;
    }




}
