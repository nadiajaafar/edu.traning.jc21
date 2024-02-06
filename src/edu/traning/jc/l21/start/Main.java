package edu.traning.jc.l21.start;

import edu.traning.jc.l21.controller.Controller;
import edu.traning.jc.l21.dao.DaoException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, DaoException {
        Controller controller = new Controller();

        String request;
        String response;

//        request = "ADD\ntitle=Книга\nсоntent=Туманность Андромеды";
//        response = controller.doAction(request);
//        System.out.println(response);

//        request = "UPDATE\nid=2\ntitle=Словарь\ncontent=Толковый словарь\ndate=07-12-2023";
//        response = controller.doAction(request);
//        System.out.println(response);
//
//        request = "DELETE_NOTE\nid=1";
//        response = controller.doAction(request);
//        System.out.println(response);

        request = "FIND_BY_TITLE\ntitle=Книга";
        response = controller.doAction(request);
        System.out.println(response);

//        request = "SHOW_ALL\ntitle";
//        response = controller.doAction(request);
//        System.out.println(response);
    }
}

