package edu.traning.jc.l21.controller.impl;

import edu.traning.jc.l21.controller.Command;
import edu.traning.jc.l21.dao.DaoException;
import edu.traning.jc.l21.logic.LogicException;
import edu.traning.jc.l21.logic.LogicProvider;
import edu.traning.jc.l21.logic.NotebookLogic;

import java.io.IOException;

public class FindNoteByTitleCommand implements Command {
    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final NotebookLogic logic = logicProvider.getNotebookLogic();
    @Override
    public String execute(String request) throws IOException, DaoException {
        String response = null;
        String[] params;
        String text;

        params = request.split("\n");
        text = params[1].split("=")[1];

        try {
            response = "Результат поиска по названию: " + logic.find(text);
        } catch (LogicException e) {
            response = "Ошибка поиска. ";
        }

        return response;
    }



}
