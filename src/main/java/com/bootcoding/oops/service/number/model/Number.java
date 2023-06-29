package com.bootcoding.oops.service.number.model;

public class Number {
    private int num;
    private String evenOdd;
    private String primeNumber;
    private String palindrom;

    public String getEvenOdd() {
        return evenOdd;
    }

    public String getPrimeNumber() {
        return primeNumber;
    }

    public void setPrimeNumber(String primeNumber) {
        this.primeNumber = primeNumber;
    }

    public String getPalindrom() {
        return palindrom;
    }

    public void setPalindrom(String palindrom) {
        this.palindrom = palindrom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setEvenOdd(String evenOdd) {
        this.evenOdd = evenOdd;
    }
}
