

// static method 안에서는 객체 변수 접근 불가능!
// static method 는 보통 유틸리티성 메소드 작성할 때 많이 사용
class Counter {
    static int count = 0;
    Counter() {
//        this.count++;  // 객체 인스턴스 내에서 value 접근할때는 this 붙임
//        System.out.println(this.count);

        count++;
        System.out.println(count);
    }
}


public class static_method {
    public static void main(String[] args){
        Counter count1 = new Counter();
        Counter count2 = new Counter();

    }
}
