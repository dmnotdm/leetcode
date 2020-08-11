package easy;

import java.util.concurrent.CountDownLatch;

import org.junit.jupiter.api.Test;

/**
 * <a>https://leetcode-cn.com/problems/print-in-order/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/10
 */
public class _1114 {

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

    class Foo {

        private volatile int k = 0;

        public Foo() {
        }

        public void first(Runnable printFirst) throws InterruptedException {
            while (k != 0) ;
            printFirst.run();
            k = 1;
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (k != 1) ;
            printSecond.run();
            k = 2;
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (k != 2) ;
            printThird.run();
            k = 0;
        }
    }
}
