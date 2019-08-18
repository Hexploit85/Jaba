package com.company;

public class Printer {
    private int tonerLvl;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLvl, int pagesPrinted, boolean duplex) {
        this.tonerLvl = tonerLvl;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public void fillUp(int percent) {
        if (this.tonerLvl < 100) {
            if (this.tonerLvl + percent <= 100)
                this.tonerLvl = this.tonerLvl + percent;
            else
                System.out.println("Overflooding");
        } else
            System.out.println("Toner is already full");

    }

    public void print(int pages){
        if(duplex)
            this.pagesPrinted=pages/2;
        else
            this.pagesPrinted=pages;
    }
    public void setDuplex(String wasd){
        if(wasd.equals("on"))
            this.duplex = true;
        else
            this.duplex = false;
    }

    public int getTonerLvl() {
        return tonerLvl;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
