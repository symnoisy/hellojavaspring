// 단하나의 객체만 생성하게 강제하는 패턴
class Singleton {

    private static Singleton one;
    private Singleton(){

    }

    public static Singleton getInstance() {
        if (one==null){
            one = new Singleton();
        }
        return one ;// 같은 클래스이므로 생성자 호출이 가능
    }
}

class SingletonSample {
    public static void main(String[] args) {
        // private 키워드로 다른 클래스에서 Singleton 클래스의
        // 생성자로서 접근을 막았기 때문에,
        // Singleton 클래스를 new를 이용해 생성할 수 없음
//        Singleton singleton = new Singleton();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
