package com.company;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }
    public void add(double real, double imaginary){
        this.real = this.real+ real;
        this.imaginary = this.imaginary + imaginary;

    }
    public void add (ComplexNumber z){
        this.real = this.real + z.getReal();
        this.imaginary = this.imaginary + z.getImaginary();
    }
    public void subtract(double real, double imaginary){
        this.real = this.real- real;
        this.imaginary = this.imaginary - imaginary;

    }
    public void subtract(ComplexNumber z){
        this.real = this.real - z.getReal();
        this.imaginary = this.imaginary - z.getImaginary();
    }


}
