package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");
        for (int i = 1; i <= 5; i++) {
            if (i<3) {
                System.out.println(i +"교시입니다.");
            } else if (i<5) {
                System.out.println(i +"교시입니다. 절반 왔습니다.");
            } else {
                System.out.println(i +"교시입니다. 거의다 끝났습니다.");
            }

        }
    }
}