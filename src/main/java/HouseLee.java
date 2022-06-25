// static 키워드 쓰면 메모리 할당을 딱 한번만 하게되어 메모리 사용에 이점이 있음
// 공유 개념도 있음, 같은 곳의 메모리 주소만을 바라보기 때문에 static 변수의 값을 공유하게 됨
public class HouseLee {
    final static String lastname = "이"; // final 쓰면 바꿀수 없음
}


class Sample {
    public static void main(String[] args){
        HouseLee lee = new HouseLee();
        HouseLee lee2 = new HouseLee();
    }
}
