package com.company;

public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public void getFirstNumber(){
        return firstNumber;
    }
    public void getSecondNumber(){
        return secondNumber;
    }
    public  setFirstNumber(double firstNumber){
        this.firstNumber = setFirstNumber();
    }
    public  setSecondNumber (double secondNumber){
        this.secondNumber = setSecondNumber();
    }
    public  getAdditionResult(){
        return firstNumber+secondNumber;
    }
    public  getSubstractionResult(){
        return  secondNumber - firstNumber;
    }
    public  getMultiplicationResult(){
        return  secondNumber * firstNumber;
    }
    public  getDivisionResult(){
        return  secondNumber / firstNumber;
    }
}
