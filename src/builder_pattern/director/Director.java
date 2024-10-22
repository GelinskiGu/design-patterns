package builder_pattern.director;

import builder_pattern.builder.Builder;
import builder_pattern.component.*;

public class Director {
    public void constructGamingPC(Builder builder) {
        builder.setMotherboard(new Motherboard());
        builder.setProcessor(new Processor());
        builder.setMemory(32L);
        builder.setGraphicsCard(new GraphicCard());
        builder.setStorage(1024L);
        builder.setCoolingSystem(new CoolingSystem());
        builder.setPowerSupply(1000L);
        builder.setComputerCase(new ComputerCase());
        builder.setMonitor(new Monitor());
        builder.setKeyboard(new Keyboard());
        builder.setMouse(new Mouse());
    }

    public void constructOfficePC(Builder builder) {
        builder.setMotherboard(new Motherboard());
        builder.setProcessor(new Processor());
        builder.setMemory(8L);
        builder.setGraphicsCard(new GraphicCard());
        builder.setStorage(256L);
        builder.setCoolingSystem(new CoolingSystem());
        builder.setPowerSupply(400L);
        builder.setComputerCase(new ComputerCase());
        builder.setMonitor(new Monitor());
        builder.setKeyboard(new Keyboard());
        builder.setMouse(new Mouse());
    }

    public void constructOfficeNotebook(Builder builder) {
        builder.setMotherboard(new Motherboard());
        builder.setProcessor(new Processor());
        builder.setMemory(8L);
        builder.setGraphicsCard(new GraphicCard());
        builder.setStorage(256L);
    }
}
