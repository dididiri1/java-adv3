package lambda.ex0;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class User implements Comparable<User> {

    public String name;
    public int age;
    public int height;

    public User(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(User o) {
        if (this.age == o.age) {
            return this.height - o.height;
        } else {
            return this.age - o.age;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

public class ComparableExample {

    public static void main(String[] args) {
        User user1 = new User("Kim", 20, 180);
        User user2 = new User("Lee", 20, 173);
        User user3 = new User("Park", 18, 168);

        List<User> users = new ArrayList<>(List.of(user1, user2, user3));

        Collections.sort(users);

        System.out.println(users.toString());
    }
}

