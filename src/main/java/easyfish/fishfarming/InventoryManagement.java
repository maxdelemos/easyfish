package easyfish.fishfarming;

import easyfish.batch.BatchCompleted;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.modulith.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryManagement {
    private static final Logger LOG = LoggerFactory.getLogger(InventoryManagement.class);

    @ApplicationModuleListener
    void on(BatchCompleted event) throws InterruptedException {

        var orderId = event.batchIdentifier();

        LOG.info("Received order completion for {}.", orderId);

        // Simulate busy work
        Thread.sleep(1000);

        LOG.info("Finished order completion for {}.", orderId);
    }
}
