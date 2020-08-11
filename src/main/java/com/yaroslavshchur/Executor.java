package main.java.com.yaroslavshchur;

import main.java.com.yaroslavshchur.builder.User;
import main.java.com.yaroslavshchur.chain.Chain;
import main.java.com.yaroslavshchur.singleton.Singleton;

public class Executor {
    public void run() {
        User user = User.builder()
                .setLogin("user_login")
                .setPassword("user_password")
                .setFirstName("Yaroslav")
                .setLastName("Shchur")
                .setAge(17)
                .setCity("Kiev")
                .build();

        System.out.println(user.toString());

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);

        Chain chain = new Chain();

        chain.process(12);
        chain.process(-50);
        chain.process(0);
        chain.process(12332);
    }
}
