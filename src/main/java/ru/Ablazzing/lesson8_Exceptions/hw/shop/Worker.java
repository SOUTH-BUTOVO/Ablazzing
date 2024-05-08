package ru.Ablazzing.lesson8_Exceptions.hw.shop;

public class Worker extends Store implements Watch {
    boolean tick;

    public boolean isTick() {
        return tick;
    }

    public void setTick(boolean tick) {
        this.tick = tick;
    }

    @Override
    public void isTicking() {
        if (tick) {
            try {
                throw new WatchBrokenError("Часы сломаны: " + tick);
            } catch (WatchBrokenError e) {
                System.err.println("Часы не тикают." + e.getMessage());
            }
        } else {
            System.out.println("Часы тикают");
        }
    }
}
