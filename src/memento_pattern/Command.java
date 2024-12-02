package memento_pattern;

import java.util.Stack;

public class Command {
    private final Editor editor;
    private final Stack<Editor.Snapshot> history;

    public Command(Editor editor) {
        this.editor = editor;
        this.history = new Stack<>();
    }

    // Salva o estado atual do editor
    public void save() {
        history.push(editor.createSnapshot());
        System.out.println("Estado salvo: " + editor.getText());
    }

    // Restaura o estado anterior do editor
    public void undo() {
        if (!history.isEmpty()) {
            Editor.Snapshot snapshot = history.pop();
            editor.restore(snapshot);
            System.out.println("Estado restaurado: " + editor.getText());
        } else {
            System.out.println("Nenhum estado para restaurar!");
        }
    }
}
