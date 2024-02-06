package edu.traning.jc.l21.controller.impl;

import edu.traning.jc.l21.controller.Command;

public class NoSuchCommand implements Command {

    @Override
    public String execute(String request) {
        return "Ошибка запроса";
    }

}
