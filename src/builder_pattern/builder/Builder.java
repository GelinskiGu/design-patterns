package builder_pattern.builder;

import builder_pattern.component.*;

public interface Builder {
    void setMotherboard(Motherboard motherboard);
    void setProcessor(Processor processor);
    void setMemory(Long memory);
    void setGraphicsCard(GraphicCard graphicsCard);
    void setStorage(Long storage);
    void setCoolingSystem(CoolingSystem coolingSystem);
    void setPowerSupply(Long powerSupply);
    void setComputerCase(ComputerCase computerCase);
    void setMonitor(Monitor monitor);
    void setKeyboard(Keyboard keyboard);
    void setMouse(Mouse mouse);
}
