package command_pattern;

public class PasteCommand implements UndoableCommand {
    private final Editor editor;
    private final int position;
    private String previousText;

    public PasteCommand(Editor editor, int position) {
        this.editor = editor;
        this.position = position;
    }

    @Override
    public void execute() {
        previousText = editor.getText();
        editor.paste(position);
    }

    @Override
    public void undo() {
        editor.setText(previousText);
    }
}
