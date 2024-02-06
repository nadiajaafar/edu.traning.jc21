package edu.traning.jc.l21.controller.impl;

import edu.traning.jc.l21.controller.Command;
import edu.traning.jc.l21.entity.Note;
import edu.traning.jc.l21.logic.LogicException;
import edu.traning.jc.l21.logic.LogicProvider;
import edu.traning.jc.l21.logic.NotebookLogic;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UpdateNoteCommand implements Command {
    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final NotebookLogic logic = logicProvider.getNotebookLogic();

    @Override
    public String execute(String request) {
        String response = null;
        String[] params;
        Note newNote;


        params = request.split("\n");
        newNote = new Note();

        newNote.setId(Integer.parseInt(params[1].split("=")[1]));
        newNote.setTitle(params[2].split("=")[1]);
        newNote.setContent(params[3].split("=")[1]);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String dateInString = (params[4].split("=")[1]);


        try {
            Date date;
            date = format.parse(dateInString);

           newNote.setDate(date);

            logic.update(newNote);
            response = "Запись обновлена успешно.";

        } catch (ParseException e) {
            response = "Запись не обновлена.";
        }

            catch (LogicException e) {
            response = "Запись не обновлена.";
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return response;
    }
}