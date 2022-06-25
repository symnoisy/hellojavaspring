package com.example.hellojava;

public class ClassTest {

    public static void dan(int n){

        for(int i=1; i<10; i++){
            System.out.printf("%d*%d=%d\n", n, i, n*i);
        }
    }

    public static void main(String[] args){
        int n;
        n = 4; // 주석 테스트

       dan(9);
    }
}


