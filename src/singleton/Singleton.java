package WebNavi.src.singleton;

import java.util.Scanner;
public class Singleton {
    private Singleton() {
    }
    public Scanner sc = new Scanner(System.in);
    private static class SingletonHolder {
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {

        return SingletonHolder.singleton;
    }
}
