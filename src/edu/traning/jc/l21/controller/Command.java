package edu.traning.jc.l21.controller;

import edu.traning.jc.l21.dao.DaoException;

import java.io.IOException;

public interface Command {
    String execute(String request) throws IOException, DaoException;
}
