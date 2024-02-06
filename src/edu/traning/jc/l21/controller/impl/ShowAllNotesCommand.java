package edu.traning.jc.l21.controller.impl;

import edu.traning.jc.l21.controller.Command;
import edu.traning.jc.l21.logic.LogicException;
import edu.traning.jc.l21.logic.LogicProvider;
import edu.traning.jc.l21.logic.NotebookLogic;

public class ShowAllNotesCommand implements Command {
    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final NotebookLogic logic = logicProvider.getNotebookLogic();
    @Override
    public String execute(String request) {

            String response = null;

            try {
                response = "Вывод записей" + logic.allNotes();
            } catch (LogicException e) {
                response = "Ошибка вывода записей";
            }

            return response;
        }

    }
}
