package com.company;

public class Main {

    public static void main(String[] args) {
	int j=0;
	    for(int i=0; i<10;i++,j++) {
            if (i==3) continue;;
            if (i==6) break;
            System.out.println(i);
	    }
    }
}

