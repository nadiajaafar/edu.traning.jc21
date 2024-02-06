package edu.traning.jc.l21.logic;

import edu.traning.jc.l21.logic.impl.NotebookLogicImpl;

public class LogicProvider {
    private static final LogicProvider instance = new LogicProvider();

    private LogicProvider() {}

    private NotebookLogic logic = new NotebookLogicImpl();

    public NotebookLogic getNotebookLogic() {
        return logic;
    }

    public static LogicProvider getInstance() {
        return instance;
    }
}
