package easyfish.batch;

import easyfish.data.Batch;
import org.jmolecules.event.types.DomainEvent;

public record BatchCompleted(Batch.BatchIdentifier batchIdentifier) implements DomainEvent {}
