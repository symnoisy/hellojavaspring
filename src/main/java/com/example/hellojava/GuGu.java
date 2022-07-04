package com.example.hellojava;

public class GuGu {

    public void dan (int n) {
        System.out.printf("%d단의 구구단을 시작합니다. \n", n);
        for(int x=1; x<10; x++){
            System.out.printf("%d*%d=%d\n", n, x, n*x);
        }
    }

    // static 메소드로 선언하면 main 객체 생성없이 메소드 호출만으로도 사용가능
    public static void main(String[] args) {
        int n;
        n = 5;

        // gugu가 GuGu 클래스의 자료형임을 나타냄,
        // 즉 gugu 변수에는 GuGu 클래스로 생성한 객체만 대입 가능
        GuGu gugu = new GuGu();  // 객체를 만들기 위해서는 new 키워드를 사용해야함
        gugu.dan(n);
    }

}
