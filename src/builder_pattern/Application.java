package builder_pattern;

import builder_pattern.concrete_builder.ComputerBuilder;
import builder_pattern.concrete_builder.NotebookBuilder;
import builder_pattern.director.Director;
import builder_pattern.product.Computer;
import builder_pattern.product.Notebook;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();

        ComputerBuilder computerBuilder = new ComputerBuilder();
        director.constructGamingPC(computerBuilder);
        Computer gamingPC = computerBuilder.getResult();

        director.constructOfficePC(computerBuilder);
        Computer officePC = computerBuilder.getResult();

        NotebookBuilder notebookBuilder = new NotebookBuilder();
        director.constructOfficeNotebook(notebookBuilder);
        Notebook officeNotebook = notebookBuilder.getResult();

        System.out.println("Gaming PC: " + gamingPC);
        System.out.println("Office PC: " + officePC);
        System.out.println("Office Notebook: " + officeNotebook);
    }
}
