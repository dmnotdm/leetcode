package normal._1226;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <a>https://leetcode-cn.com/problems/the-dining-philosophers/</a>
 *
 * @author zhizhao.zhang
 * @date 2020/08/10
 */
class DiningPhilosophers {
    private final Lock k1 = new ReentrantLock();
    private final Lock k2 = new ReentrantLock();
    private final Lock k3 = new ReentrantLock();
    private final Lock k4 = new ReentrantLock();
    private final Lock k5 = new ReentrantLock();
    private final Lock[] locks = new Lock[]{k1, k2, k3, k4, k5};

    public DiningPhilosophers() {

    }

    // call the run() method of any runnable to execute its code
    public synchronized void wantsToEat(int philosopher,
                                        Runnable pickLeftFork,
                                        Runnable pickRightFork,
                                        Runnable eat,
                                        Runnable putLeftFork,
                                        Runnable putRightFork) throws InterruptedException {
        Lock left = locks[philosopher];
        Lock right = locks[(philosopher + 1) % 5];
        while (true) {
            if (!left.tryLock()) {
                continue;
            }
            pickLeftFork.run();
            if (!right.tryLock()) {
                putLeftFork.run();
                left.unlock();
            }
            pickRightFork.run();
            eat.run();
            putRightFork.run();
            putLeftFork.run();
            left.unlock();
            right.unlock();
            break;
        }
    }
}
