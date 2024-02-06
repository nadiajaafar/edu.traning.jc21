package edu.traning.jc.l21.controller.impl;

import edu.traning.jc.l21.controller.Command;
import edu.traning.jc.l21.dao.DaoException;
import edu.traning.jc.l21.entity.Note;
import edu.traning.jc.l21.logic.LogicException;
import edu.traning.jc.l21.logic.LogicProvider;
import edu.traning.jc.l21.logic.NotebookLogic;

import java.io.IOException;

public class AddNoteCommand implements Command {

    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final NotebookLogic logic = logicProvider.getNotebookLogic();

    @Override
    public String execute(String request) throws IOException, DaoException {
        String response = null;
        String[] params;
        Note newNote;


        params = request.split("\n");
        newNote = new Note();
        newNote.setTitle(params[1].split("=")[1]);
        newNote.setContent(params[2].split("=")[1]);

        try {
            logic.add(newNote);
            response = "Запись сохранена успешно.";
        } catch (LogicException e) {
            response = "Что-то пошло не так. Попробуйте еще раз.";
        }

        return response;
    }

}
