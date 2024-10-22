package builder_pattern.concrete_builder;

import builder_pattern.builder.Builder;
import builder_pattern.component.*;
import builder_pattern.product.Computer;

public class ComputerBuilder implements Builder {
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

    @Override
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void setMemory(Long memory) {
        this.memory = memory;
    }

    @Override
    public void setGraphicsCard(GraphicCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void setStorage(Long storage) {
        this.storage = storage;
    }

    @Override
    public void setCoolingSystem(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    @Override
    public void setPowerSupply(Long powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    @Override
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Computer getResult() {
        return new Computer(motherboard, processor, memory, graphicsCard, storage, coolingSystem, powerSupply, computerCase, monitor, keyboard, mouse);
    }
}
