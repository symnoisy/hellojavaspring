package com.example.hellojava;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>();  // 제네릭스로 ArrayList에 받을수 있는 데이터형 정의해줘야함

        test.add("123");

        test.add("345");
        System.out.println(test.get(0));
        System.out.println(test.size());
        System.out.println(test.contains("123"));


        String[] data = {"123", "456", "789"};
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches);


        // 딕셔너리 같은 느낌
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people"));
        System.out.print(map.getOrDefault("Test", "HelloWorld"));

        final int n = 123;
    }

}
