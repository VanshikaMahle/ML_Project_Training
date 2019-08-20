package CalculatorLabProject;

/**
 * @author vanshikamahle
 * @version 1.0
 * */
public class Calculator {
    private char operatorChar;
    private double operand1;
    private double operand2;
    private double result;

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public void setOperatorChar(char operatorChar) {
        this.operatorChar = operatorChar;
    }

    public void setResult(double result) {
        this.result = result;
    }
    public Calculator(double operand1, char operatorChar, double operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operatorChar = operatorChar;
    }
    private double calculate(){
        double result = 0.0;
        switch (this.operatorChar){
            case '+':
                setResult();
        }
    }
}
