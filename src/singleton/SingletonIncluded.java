package singleton;

public class SingletonIncluded {



    private static SingletonIncluded ourInstance = new SingletonIncluded();

    public static SingletonIncluded getInstance() {
        return ourInstance;
    }

    private SingletonIncluded() {
    }
}
