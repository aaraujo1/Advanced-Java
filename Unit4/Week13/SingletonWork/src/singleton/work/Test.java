package singleton.work;

public class Test {
    private static Test ourInstance = new Test();

    public static Test getInstance() {
        return ourInstance;
    }

    private Test() {
    }
}
