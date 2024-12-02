package command_pattern;

public class UndoCommand implements Command {
    private final CommandHistory history;

    public UndoCommand(CommandHistory history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            if (lastCommand instanceof UndoableCommand) {
                ((UndoableCommand) lastCommand).undo();
            }
        }
    }
}
