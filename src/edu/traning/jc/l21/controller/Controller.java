package edu.traning.jc.l21.controller;

import edu.traning.jc.l21.dao.DaoException;

import java.io.IOException;

public class Controller {
    private final char paramDelimeter = '\n';

    private final CommandProvider provider = new CommandProvider();

    public String doAction(String request) throws IOException, DaoException {
        String command;
        command = request.substring(0, request.indexOf(paramDelimeter));
        command = command.toUpperCase();


        Command executionCommand;
        executionCommand = provider.getCommand(command);

        String response;
        response = executionCommand.execute(request);

        return response;

    }
}
