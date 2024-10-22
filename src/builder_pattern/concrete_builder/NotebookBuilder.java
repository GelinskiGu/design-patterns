package builder_pattern.concrete_builder;

import builder_pattern.builder.Builder;
import builder_pattern.component.*;
import builder_pattern.product.Notebook;

public class NotebookBuilder implements Builder {
    private Motherboard motherboard;
    private Processor processor;
    private Long memory;
    private GraphicCard graphicsCard;
    private Long storage;

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
    }

    @Override
    public void setPowerSupply(Long powerSupply) {
    }

    @Override
    public void setComputerCase(ComputerCase computerCase) {
    }

    @Override
    public void setMonitor(Monitor monitor) {
    }

    @Override
    public void setKeyboard(Keyboard keyboard) {
    }

    @Override
    public void setMouse(Mouse mouse) {
    }

    public Notebook getResult() {
        return new Notebook(motherboard, processor, memory, graphicsCard, storage);
    }
}
