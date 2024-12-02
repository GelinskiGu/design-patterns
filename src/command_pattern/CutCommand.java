package command_pattern;

public class CutCommand implements UndoableCommand {
    private final Editor editor;
    private final String selection;
    private String previousText;

    public CutCommand(Editor editor, String selection) {
        this.editor = editor;
        this.selection = selection;
    }

    @Override
    public void execute() {
        previousText = editor.getText();
        editor.cut(selection);
    }

    @Override
    public void undo() {
        editor.setText(previousText);
    }
}
