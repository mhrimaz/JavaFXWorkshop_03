/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxworkshop_03;

/**
 *
 * @author mhrimaz
 */
public class CalculatorEngine {

    private double result;
    private char operator = '+';

    public CalculatorEngine(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double calculate(double secondNumber) {
        switch (operator) {
            case '+':
                return result = result + secondNumber;
            case '-':
                return result = result - secondNumber;
            case '÷':
                return result = result / secondNumber;
            case 'X':
                return result = result * secondNumber;
            default:
                return 0;
        }
    }
}
