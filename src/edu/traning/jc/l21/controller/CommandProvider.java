package edu.traning.jc.l21.controller;

import edu.traning.jc.l21.controller.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider(){
        repository.put(CommandName.ADD, new AddNoteCommand());
        repository.put(CommandName.UPDATE, new UpdateNoteCommand());
        repository.put(CommandName.DELETE_NOTE, new DeleteNoteCommand());
        repository.put(CommandName.FIND_BY_TITLE, new FindNoteByTitleCommand());
        repository.put(CommandName.SHOW_ALL, new ShowAllNotesCommand());
        repository.put(CommandName.WRONG_REQUEST, new NoSuchCommand());
    }

    Command getCommand(String name){
        CommandName commandName =null;
        Command command = null;

        try{
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        }catch(IllegalArgumentException | NullPointerException e){
            //if name= null
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
