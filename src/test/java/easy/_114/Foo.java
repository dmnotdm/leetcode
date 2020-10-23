package easy._114;

/**
 * <a>https://leetcode-cn.com/problems/print-in-order/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/10
 */
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
