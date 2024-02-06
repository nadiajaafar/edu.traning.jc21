package edu.traning.jc.l21.dao;

import edu.traning.jc.l21.dao.impl.FileNoteBookDao;

public final class DaoProvider {
    private static final DaoProvider INSTANCE = new DaoProvider();

    private DaoProvider() {}

    private NoteBookDao noteBookDao = new FileNoteBookDao();

    public NoteBookDao getNoteBookDao() {
        return noteBookDao;
    }
    public static DaoProvider getInstance() {
        return INSTANCE;
    }
}
