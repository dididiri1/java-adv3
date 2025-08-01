package lambda.ex0;

import java.util.*;

class Customer {

    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Customer> users = new ArrayList<>();
        users.add(new Customer("Kim", 25));
        users.add(new Customer("Lee", 20));
        users.add(new Customer("Park", 30));

        // ✅ 이름 기준 오름차순 정렬
        Collections.sort(users, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println(users);
        // [Kim(25), Lee(20), Park(30)]

        // ✅ 나이 기준 내림차순 정렬 (람다 버전)
        users.sort((u1, u2) -> u2.age - u1.age);
        System.out.println(users);
        // [Park(30), Kim(25), Lee(20)]
    }
}