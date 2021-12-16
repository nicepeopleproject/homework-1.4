public class Foo {
    int sequence = 0;

    public Foo() {
    }

    synchronized public void first() {
        while (sequence != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("first");
        sequence++;
        notify();
    }

    synchronized public void second() {
        while (sequence != 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("second");
        sequence++;
        notify();
    }

    synchronized public void third() {
        while (sequence != 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("third");
        sequence++;
    }
}
