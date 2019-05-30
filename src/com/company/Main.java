package com.company;

import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();




    }}

//    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets){
//
//        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets <0 )
//        return -1;
//    else{
//        double areaToCover = width * height;
//        double areaLeft;
//        double bucketsToBuy;
//
//        areaLeft = areaToCover-(areaPerBucket*extraBuckets);
//        bucketsToBuy = areaLeft/areaPerBucket;
//
//        return (int)Math.ceil(bucketsToBuy);
//
//
//
//        }
//
//    }
//    public static int getBucketCount(double width, double height, double areaPerBucket){
//        if(width<=0 || height<=0 || areaPerBucket<=0 )
//            return -1;
//        else{
//            double areaToCover = width * height;
//
//            double bucketsToBuy;
//
//
//            bucketsToBuy = areaToCover/areaPerBucket;
//
//            return (int)Math.ceil(bucketsToBuy);
//
//
//
//        }
//    }
//    public static int getBucketCount(double area,double areaPerBucket){
//
//        if(area<=0 || areaPerBucket<=0)
//            return -1;
//        else {
//
//
//            double bucketsToBuy;
//            bucketsToBuy = area / areaPerBucket;
//            return (int) Math.ceil(bucketsToBuy);
//        }
//    }
//
//
//
//
//
//
//
//}
//    public static void inputThenPrintSumAndAvarange(){
//        Scanner scanner =new Scanner(System.in);
//        int newValue;
//        int suma = 0;
//        int licznik = 0;
//
//        while(true){
//
//            if(scanner.hasNextInt()){
//            newValue = scanner.nextInt();
//            suma = suma+newValue;
//            licznik++;
//            }else
//                break;
//
//        }System.out.println("SUM = "+ suma+" AVG ="+Math.round((double)suma/licznik));
//
//
//
//    }


















//        Scanner scanner = new Scanner(System.in);
//
//        int number;
//        int minNumber = 0;
//        int maxNumber = 0;
//
//
//        while(true) {
//
//            System.out.println("Ent3r the mfcking number");
//            boolean sprawdzanko = scanner.hasNextInt();
//
//            if(sprawdzanko) {
//                number = scanner.nextInt();
//                if (maxNumber == 0 && minNumber == 0) {
//                    maxNumber = number;
//                    minNumber = number;
//                }
//                if (number > maxNumber)
//                    maxNumber = number;
//                if (number < minNumber)
//                    minNumber = number;
//                System.out.println("Maximun value = " + maxNumber);
//                System.out.println("Minimum value = " + minNumber);
//            }else break;
//
//        }
//
//
//    }
//}


//    public static int getLargestPrime(int number) {
//        int P = 2;
//        int prime = 0;
//
//        if (number <= 1)
//            return -1;
//        else {
//
//            while (number >= P) {
//                for (int i = 2; i <= P; i++) {
//                    if (P % i == 0 && P != i)
//                        break;
//                    else {
//                        if (number % i ==0 && i ==P)
//                            prime = i;
//                    }
//                }
//                P++;
//            }
//            return prime;
//        }

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//
//        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
//
//
//            if (bigCount * 5 + smallCount < goal)
//                return false;
//            else {
//                if (goal % 5 != 0 && goal % 5 >= smallCount)
//                    return false;
//                else return true;
//            }
//
//
//        } else return false;
//
//
//    }

//    public static int reverse(int number){
//        int a,c=number ;
//        int b=0 ;
//
//
//        if(number<0)
//            c=number*(-1);
//
//        while(c>=1){
//            a = c%10;
//            c = c/10;
//            b =(b*10)+a;
//        }
//        if(number<0)
//            return-b;
//        return b;
//    }
//
//    public static void numberToWords(int number){
//
//        if(number<0)
//            System.out.println("Invalid Value");
//        else{
//
//        int a =0;
//        int b= 0;
//        int reversed = reverse(number);
//
//        while(reversed>=1){
//            a= reversed%10;
//
//
//            switch(a){
//                case(0):
//                    System.out.println("zero");
//                    break;
//                case(1):
//                    System.out.println("one");
//                    break;
//                case(2):
//                    System.out.println("two");
//                    break;
//                case(3):
//                    System.out.println("three");
//                    break;
//                case(4):
//                    System.out.println("four");
//                    break;
//                case(5):
//                    System.out.println("five");
//                    break;
//                case(6):
//                    System.out.println("six");
//                    break;
//                case(7):
//                    System.out.println("seven");
//                    break;
//                case(8):
//                    System.out.println("eight");
//                    break;
//                case(9):
//                    System.out.println("nine");
//                    break;
//
//            }
//            b++;
//
//
//
//                reversed = reversed/10;
//        }
////        if(number==0)
////            System.out.println("Zero");
//        //else {
//        for(int i = getDigitCount(number); i>b; i--)
//        System.out.println("zero");
//
//
//    }}
//    public static int getDigitCount(int number){
//
//
//        if(number<0)
//            return -1;
//        else{
//
//        int a = 0;
//
//        for(int i=1; number>=1; i++){
//
//            number= number /10;
//            a =i;
//
//        }
//        if(a==0)
//            return 1;
//        else
//        return a;
//    }}


//    public static boolean isPerfect(int number){
//
//        int num =0;
//
//        for(int i=1; i<number; i++){
//            if(number%i == 0)
//                num = num+i;
//            System.out.println(num);
//        }
//
//
//
//if(num==number)
//    return true;
//else
//    return false;
//    }

//    public static void printFactors(int number){
//        if(number<1)
//            System.out.println("Invalid value");
//        else{
//        for(int i=1; i<=number;i++){
//
//            if(number%i==0)
//                System.out.println(i);
//        }}
//    }

//    public static int getGreatestCommonDivisor(int first, int second){
//
//        if(first>=10&&second>=10) {
//
//            int save1 = 0;
//
//
//            for (int i = 1; (i < first) || (i < second); i++) {
//
//                if ((first % i == 0) && (second % i == 0))
//                    save1 = i;
//
//
//            }
//
//            return save1;
//
//        }else return -1;}

//    public static boolean hasSameLastDigit(int number1, int number2, int number3){
//
//        int extrakt1 = number1%10;
//        int extrakt2 = number2%10;
//        int extrakt3 = number3%10;
//
//
//        if(isValid(number1) && isValid(number2) && isValid(number3)){
//
//            if(extrakt1==extrakt2)
//                return true;
//            else if(extrakt1==extrakt3)
//                return true;
//            else if (extrakt2==extrakt3)
//                return true;
//            else
//                return false;
//
//
//
//
//
//        }
//        else return false;
//    }
//
//
//
//
//    public static boolean isValid(int number){
//        if (number>=10 && number <= 1000)
//            return true;
//        else
//            return false;
//    }

//    public static boolean hasSharedDigit(int number1, int number2) {
//
//
//        int extrakt1 = 0;
//        int extrakt2 = 0;
//        int sakrament = 0;
//        int sejf =number2;
//
//        if((number1>=10 && number1<=99) && (number2>=10 && number2<=99) ) {
//
//            while (number1 > 0) {
//                //System.out.println(number1);
//                extrakt1 = number1 % 10;
//                while (number2 > 0) {
//                   // System.out.println(number2);
//                    extrakt2 = number2 % 10;
//                    if (extrakt1 == extrakt2)
//                        sakrament++;
//                    number2 = number2 / 10;
//                }
//                number1 = number1 / 10;
//                number2 = sejf;
//            }
//            if (sakrament == 0)
//                return false;
//            else
//                return true;
//        }else return false; }


//    public static int getEvenDigitSum(int number){
//
//        if(number>=0) {
//            int magazyn = 0;
//            int reszta = 0;
//
//            while (number > 0) {
//                reszta = number % 10;
//                if (reszta%2 ==0) {
//
//                    magazyn = magazyn + reszta;
//                    System.out.println("magazyn = " + magazyn);
//                }
//
//                number = number / 10;
//                System.out.println("numer = " + number);
//            }
//            System.out.println(magazyn);
//            return magazyn;
//
//        }else return -1;
//    }

//    public static int sumFirstAndLastDigit(int number) {
//
//        int firstDigimon = number;
//        int lastDigimon = number % 10;
//
//        if(number<10 && number>0)
//            return number+number;
//
//        else if (number >= 0) {
//            while (number > 0) {
//
//
//                number = number / 10;
//                if (number < 10)
//                    break;
//
//                System.out.println("After loop = " + number);
//
//            }
//
//            System.out.println("First Number = " + number + " Last Number = " + lastDigimon);
//            return number + lastDigimon;
//        } else
//            return -1;


//public static int numbersSum(int number){
//
//        int reszta=0;
//        int magazyn=0;
//
//        while(number>0){
//            reszta = number%10;
//            System.out.println("reszta "+reszta);
//
//            magazyn= magazyn + reszta  ;
//            System.out.println("magazyn "+magazyn);
//
//            number/=10;
//            System.out.println("number "+number);
//
//        }return magazyn;
//}


//        System.out.println(AreaCalculator.area(12));
//        System.out.println(AreaCalculator.area(12, 12));
//        MinutesToYearsDaysCalculator.printYearsAndDays(527040);
//        IntEqualityPrinter.printEqual(2, 2, 3);
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
//        System.out.println(LeapYear.isLeapYear(2019));
//
//        switch ('h') {
//
//            case 'a':
//                System.out.println("znaleziono niga A");
//                break;
//            case 'b':
//                System.out.println("znaleziono niga B");
//                break;
//            case 'c':
//                System.out.println("znaleziono niga C");
//                break;
//            default:
//                System.out.println("Chuja znaleziono");
//        }
//
//        printDayOfTheWeek(1);
//        printDayOfTheWeek(2);
//        printDayOfTheWeek(3);
//

//for(int i=0; i<999999999;i++){
//    System.out.println(calculateInterest(100,i));
//        }
//        int mag = 0;
//        int loopik = 0;
//        for (int i = 1; i <= 1000; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0) && (loopik <= 5)) {
//                System.out.println("Number found = " + i);
//
//                loopik++;
//                mag = mag + i;
//            }
//            if (loopik == 5)
//                break;
//        }
//        System.out.println("Sum of loops = " + mag);

//        System.out.println(sumOdd(-100,100));
//        System.out.println(isOdd(2));
//        System.out.println(isOdd(3));
//        System.out.println(isOdd(4));
//        System.out.println(isOdd(5));
//        System.out.println(isOdd(6));
//        System.out.println(isOdd(7));


//
//    public static boolean isOdd(int number) {
//        if (number < 0)
//            return false;
//
//        else if (number % 2 != 0)
//            return true;
//        else return false;
//    }
////
//    public static int sumOdd(int start, int end) {
//        int sumka = 0;
//        if(start<0 || end<0 || start<end)
//            return -1;
//        for (int i = start; i <= end; i++) {
//            System.out.println("i = "+i);
//            System.out.println("sumka = "+sumka);
//            if (isOdd(i) == true)
//                sumka += i;
//
//
//        }
//        return sumka;
//    }
//
//
//    public static double calculateInterest(double amount, double interestRate) {
//        return amount * (interestRate / 100);
//
//    }
//
//    public static void getDurationString(int minutes, int seconds) {
//        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
//            int m;
//            int t = (minutes * 60) + seconds;
//            int h = (int) Math.floor((minutes * 60 + seconds) / 3600);
//            if (h > 0)
//                m = (t - (h * 3600)) / 60;
//            else m = minutes;
//            System.out.println(h + " godzin " + m + " minut " + seconds + " sekund");
//
//        } else
//            System.out.println("Invalid value");
//    }
//
//    public static int getDurationString(int seconds) {
//        return seconds / 60;
//    }
//
//    public static void printDayOfTheWeek(int day) {
//
//        switch (day) {
//            case 0:
//                System.out.println("Monday");
//                break;
//            case 1:
//                System.out.println("Tuesday");
//                break;
//            case 2:
//                System.out.println("Wednesday");
//                break;
//            case 3:
//                System.out.println("Thursday");
//                break;
//            case 4:
//                System.out.println("Friday");
//                break;
//            case 5:
//                System.out.println("Saturday");
//            case 6:
//                System.out.println("Sunday");
//            default:
//                System.out.println("Invalid day");
//        }
//    }
//
//

