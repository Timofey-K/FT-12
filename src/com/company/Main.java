package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int test = sc.nextInt();

        Proverka p1 = (test1 -> {if (test1%15 == 0) {return true;} else {return false;}});

        Proverka p2 = (test1 -> {if (test1 >= 0) {return true;} else {return false;}});

        Proverka p3 = (test1 -> {
            int n0 = 0;
            int n1 = 1;
            int n2;
            boolean r = false;
            for (int i = 0; i < 30; i++){
                if (test1 == n0){
                    r = true;
                    break;
                }
                n2 = n0 + n1;
                n0 = n1;
                n1 = n2;
            }
            if (r) {return true;} else {return false;}});

        System.out.println(p1.prov(test));
        System.out.println(p2.prov(test));
        System.out.println(p3.prov(test));
    }
}


