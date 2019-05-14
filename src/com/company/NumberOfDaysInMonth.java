package com.company;

public class NumberOfDaysInMonth {
    public static int getDaysInMonth(int month, int year){

        if(LeapYear.isLeapYear(year)==false){
            switch(month){
                case 1:
                    return 31;

                case 2:
                    return 28;

                case 3:
                    return 31;

                case 4:
                    return 30;

                case 5:
                    return 31;

                case 6:
                    return 30;

                case 7:
                    return 31;

                case 8:
                    return 31;

                case 9:
                    return 30;

                case 10:
                    return 31;

                case 11:
                    return 30;

                case 12:
                    return 31;

                default:
                    return -1;
            }
        }else if(LeapYear.isLeapYear(year)==true){
            switch(month){
                case 1:
                    return 31;

                case 2:
                    return 29;

                case 3:
                    return 31;

                case 4:
                    return 30;

                case 5:
                    return 31;

                case 6:
                    return 30;

                case 7:
                    return 31;

                case 8:
                    return 31;

                case 9:
                    return 30;

                case 10:
                    return 31;

                case 11:
                    return 30;

                case 12:
                    return 31;

                default:
                    return -1;
            }

        }else
            return -1;}}