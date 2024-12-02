package command_pattern;

public interface UndoableCommand extends Command {
    void undo();
}
