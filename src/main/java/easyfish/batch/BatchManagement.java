package easyfish.batch;

import easyfish.data.Batch;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BatchManagement {
    private final @NonNull ApplicationEventPublisher events;

    @Transactional
    public void complete(Batch order) {
        events.publishEvent(new BatchCompleted(order.getId()));
    }
}
