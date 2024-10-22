package builder_pattern.product;

import builder_pattern.component.*;

public class Notebook {
    private Motherboard motherboard;
    private Processor processor;
    private Long memory;
    private GraphicCard graphicsCard;
    private Long storage;

    public Notebook(Motherboard motherboard, Processor processor, Long memory, GraphicCard graphicsCard, Long storage) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.memory = memory;
        this.graphicsCard = graphicsCard;
        this.storage = storage;
    }
}
