package command_pattern;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        CommandHistory history = new CommandHistory();

        editor.setText("Hello, World!");
        System.out.println("Texto inicial: " + editor.getText());

        Command copy = new CopyCommand(editor, "Hello");
        copy.execute();

        Command cut = new CutCommand(editor, "World");
        cut.execute();
        history.push(cut);
        System.out.println("Após cortar: " + editor.getText());

        Command paste = new PasteCommand(editor, 6);
        paste.execute();
        history.push(paste);
        System.out.println("Após colar: " + editor.getText());

        Command undo = new UndoCommand(history);
        undo.execute();
        System.out.println("Após desfazer: " + editor.getText());
    }
}
