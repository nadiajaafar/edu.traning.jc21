package edu.traning.jc.l21.dao;

import edu.traning.jc.l21.entity.Note;

import java.io.IOException;
import java.util.List;

public interface NoteBookDao {

    void save(Note n) throws DaoException, IOException;

    void delete(int id) throws IOException, NumberFormatException, DaoException;

    void update(Note n) throws IOException, NumberFormatException, DaoException;

    List<Note> allNotes() throws DaoException;


}
