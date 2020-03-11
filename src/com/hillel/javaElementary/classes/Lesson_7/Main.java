package com.hillel.javaElementary.classes.Lesson_7;

public class Main {
    public static void main(String[] args) {
        HumanLifecycle lifecycle = new HumanLifecycle();

        IHumanLifecycleObserver observer = new LoggingHumanLifecycleObserver();

        lifecycle.startLife(observer);

        observer = new NetworkReportingLifecycleObserver();

        IHumanLifecycleObserver[] observers = new IHumanLifecycleObserver[]{
            new LoggingHumanLifecycleObserver(),
                new NetworkReportingLifecycleObserver()
        };

        IHumanLifecycleObserver observer1 = new MulticastingLifecycleObserver(observers);

        lifecycle.startLife(observer1);
    }
}
