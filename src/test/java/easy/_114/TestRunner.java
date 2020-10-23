package easy._114;

import java.util.concurrent.CountDownLatch;

import org.junit.jupiter.api.Test;

/**
 * @author zhizhao.zhang
 * @date 2020/10/23
 */
public class TestRunner {

    @Test
    public void test() throws InterruptedException {
        Foo foo = new Foo();
        CountDownLatch latch = new CountDownLatch(3);
        new Thread(() -> {
            try {
                latch.countDown();
                latch.await();
                while (true) {
                    foo.first(() -> System.out.println(1));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                latch.countDown();
                latch.await();
                while (true) {
                    foo.second(() -> System.out.println(2));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                latch.countDown();
                latch.await();
                while (true) {
                    foo.third(() -> System.out.println(3));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
