package com.random_leader;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        System.out.println(randomLeader());
    }
    public static String randomLeader(){
        String[] lname={"wendell", "alvis","francis","james","trisha","eunice"};
        return lname[ranNum()];
    }
    public static int ranNum(){
        Random random = new Random();
        return random.nextInt(5);
    }
}
