package homework_2;

import java.util.concurrent.TimeUnit;

public class Task5_1 {
    public static void main(String[] args) {
        CountdownTimer timer = new CountdownTimer(10);

        timer.start();
    }
}

interface Task {
    /**
     * Запускает задачу
     */
    void start();

    /**
     * Останавливает задачу
     */
    void stop();
}


class CountdownTimer implements Task {

    private int remainingSeconds;
    private Thread timerThread;

    public CountdownTimer(int initialSeconds) {
        this.remainingSeconds = initialSeconds;
    }

    @Override
    public void start() {
        timerThread = new Thread(() -> {
            while (remainingSeconds > 0) {
                System.out.println("Осталось: " + remainingSeconds + " секунд(ы)");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    System.err.println("Таймер прерван: " + e.getMessage());
                    break;
                }
                remainingSeconds--;
            }
            if (remainingSeconds == 0) {
                System.out.println("Время вышло!");
            }
        });
        timerThread.start();
    }

    @Override
    public void stop() {
        if (timerThread != null && timerThread.isAlive()) {
            timerThread.interrupt();
        }
    }
}
