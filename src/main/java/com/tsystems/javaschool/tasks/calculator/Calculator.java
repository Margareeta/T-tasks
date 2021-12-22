package com.tsystems.javaschool.tasks.calculator;

import java.util.Stack;

import static java.lang.Double.parseDouble;

public class Calculator {

    /**
     * Evaluate statement represented as string.
     *
     * @param statement mathematical statement containing digits, '.' (dot) as decimal mark,
     *                  parentheses, operations signs '+', '-', '*', '/'<br>
     *                  Example: <code>(1 + 38) * 4.5 - 1 / 2.</code>
     * @return string value containing result of evaluation or null if statement is invalid
     */
    public String evaluate(String statement) {
        Stack numbers = new Stack();
        Stack signs = new Stack();
        int operationPriority = 0;
        String x, x1, sign;
        Double result;


        // TODO: Implement the logic here
        if (!statement.matches("[\\d.]+|\\+|\\-|\\/|\\(|\\*|\\(|\\)"))
            return null;
        else {
            for (int i = 0; i < statement.length(); i++) {
                if (statement.substring(i).matches("\\d+")) {
                    numbers.push(statement.substring(i));
                } else {
                    signs.push(statement.substring(i));
                }
            }
            for (int i = 0; i < numbers.size(); i++) {
                x = (String) numbers.pop();
                sign = (String) signs.pop();
                x1 = (String) numbers.pop();
                switch (sign) {
                    case "+":
                        result = parseDouble(x) + parseDouble(x1);
                        Math.round(result);
                        return result.toString();
                    case "-":
                        result = parseDouble(x) - parseDouble(x1);
                        Math.round(result);
                        return result.toString();

                    case "*":
                        result = parseDouble(x) * parseDouble(x1);
                        return result.toString();

                    case "/":
                        result = parseDouble(x) / parseDouble(x1);
                        return result.toString();

                }

            }
        }
        return "";
    }

}
