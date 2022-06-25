// 접근 제어자 테스트
public class access_modifier {
// private -> default -> protected -> public 순으로 보다 많은 접근을 허용한다.

    // 해당 클래스에서만 접근 가능
    private String secret;

    // 세팅 없다면 default로 설정됨, 해당 패키지 내에서만 접근 가능
    String default_test;

    // 동일 패키지, 해당 클래스를 상속 받은 다른 패키지의 클래스에서 접근 가능
    protected String protected_test;

    // 어떤 클래스에서라도 접근 가능
    public String public_test;
}
