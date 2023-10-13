package easyfish.data;

import lombok.Getter;

import java.util.UUID;

import org.jmolecules.ddd.types.AggregateRoot;
import org.jmolecules.ddd.types.Identifier;

public class Batch implements AggregateRoot<Batch, Batch.BatchIdentifier> {
    private @Getter BatchIdentifier id = new BatchIdentifier(UUID.randomUUID());

    public static record BatchIdentifier(UUID id) implements Identifier {}
}
