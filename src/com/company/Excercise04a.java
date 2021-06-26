package com.company;

public class Excercise04a {
    public static void main(String[] args) {

        boolean red = true;
        boolean blue = false;

        if ((red) && (blue)){
            System.out.println("Both red AND blue are true.");
        }

        if ((red) || (blue)){
            System.out.println("Either red AND blue are true. ");
        }

        if (!blue){
            System.out.println("The variable blue is false");
        }
    }
}
