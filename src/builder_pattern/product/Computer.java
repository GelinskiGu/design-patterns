package builder_pattern.product;

import builder_pattern.component.*;

public class Computer {
    private Motherboard motherboard;
    private Processor processor;
    private Long memory;
    private GraphicCard graphicsCard;
    private Long storage;
    private CoolingSystem coolingSystem;
    private Long powerSupply;
    private ComputerCase computerCase;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(Motherboard motherboard, Processor processor, Long memory, GraphicCard graphicsCard, Long storage, CoolingSystem coolingSystem, Long powerSupply, ComputerCase computerCase, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.memory = memory;
        this.graphicsCard = graphicsCard;
        this.storage = storage;
        this.coolingSystem = coolingSystem;
        this.powerSupply = powerSupply;
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
