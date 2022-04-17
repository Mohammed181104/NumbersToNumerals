package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number to convert: ");
        int num = input.nextInt();
        System.out.println(numeralConverter(num));
    }
    public static String numeralConverter(int num){
        String answer="";
        while(num>=1000){
            answer = answer + 'M';
            num -= 1000;
        }
        if(num>=900){
            answer = answer +"CM";
            num-=900;
        }
        while(num>=500){
            answer = answer + 'D';
            num-=500;
        }
        if(num>=400){
            answer = answer + "CD";
            num -=400;
        }
        while(num>=100){
            answer = answer + 'C';
            num-=100;
        }
        if(num>=90){
            answer = answer + "XC";
            num -=90;
        }
        while(num>=50){
            answer = answer + 'L';
            num-=50;
        }
        if(num>=40){
            answer = answer + "XL";
            num -=40;
        }
        while(num>=10){
            answer = answer + 'X';
            num-=10;
        }
        if(num>=9){
            answer = answer + "IX";
            num -=9;
        }
        while(num>=5){
            answer = answer + 'V';
            num-=5;
        }
        if(num>=4){
            answer = answer + "IV";
            num -=4;
        }
        while(num>=1){
            answer = answer + 'I';
            num-=1;
        }
        return answer;
    }
}
