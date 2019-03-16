package DemoSpringFramework;

import org.springframework.context.event.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MultipleEventListener {
    @EventListener(ContextStartedEvent.class)
    @Async
    void start() {
        System.out.println("----------------start");
    }
    @EventListener(ContextStoppedEvent.class)
    void stopped() {
        System.out.println("----------------stopped");
    }
}

