public class FooTest {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Runnable runnable1 = ()->{foo.third();};
        Runnable runnable2 = ()->{foo.first();};
        Runnable runnable3 = ()->{foo.second();};
        new Thread(runnable1).start();
        Thread.sleep(545);
        new Thread(runnable2).start();
        Thread.sleep(1000);
        new Thread(runnable3).start();
    }
}
