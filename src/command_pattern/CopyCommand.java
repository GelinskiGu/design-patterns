package command_pattern;

public class CopyCommand implements Command {
    private final Editor editor;
    private final String selection;

    public CopyCommand(Editor editor, String selection) {
        this.editor = editor;
        this.selection = selection;
    }

    @Override
    public void execute() {
        editor.copy(selection);
    }
}
