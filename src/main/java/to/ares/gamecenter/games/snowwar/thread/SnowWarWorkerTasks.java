package to.ares.gamecenter.games.snowwar.thread;

import com.eu.habbo.Emulator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SnowWarWorkerTasks {
    private static final Logger LOGGER = LoggerFactory.getLogger(Emulator.class);

    public static int serverType;

    public static final int SERVER_TINY = 0;
    public static final int SERVER_SMALL = 1;
    public static final int SERVER_NORMAL = 2;
    public static final int SERVER_LARGE = 3;
    public static final int SERVER_EXTRALARGE = 4;
    public static final int SERVER_TURBO = 5;

    public static ScheduledThreadPoolExecutor SnowWarTasks;

    public static void initWorkers() {
        SnowWarTasks = new ScheduledThreadPoolExecutor(1);
        LOGGER.info("[GameCenter] SnowWar Tasks started");
    }

    public static void addTask(final GameTask task, final int initDelay, final int repeatRate, final ScheduledThreadPoolExecutor worker) {
        if (repeatRate > 0) {
            task.future = worker.scheduleAtFixedRate(task, initDelay, repeatRate, TimeUnit.MILLISECONDS);
        } else {
            task.future = worker.schedule(task, initDelay, TimeUnit.MILLISECONDS);
        }
    }
}