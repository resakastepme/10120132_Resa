package com.stepme.a10120132_resa;

import android.database.Cursor;

import com.stepme.a10120132_resa.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}

