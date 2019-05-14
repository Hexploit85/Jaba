package com.company;

public class DecimalComparator
{
    public static boolean areEqualByThreeDecimalPlaces(double d1,double d2)
    {
        double i1= d1*1000;
        double i2 = d2*1000;
        int i3 = (int)i1;
        int i4 = (int)i2;
        if(i3==i4)
        {
            return true;
        }
        return false;
    }
}

