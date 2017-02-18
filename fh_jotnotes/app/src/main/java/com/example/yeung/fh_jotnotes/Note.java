package com.example.yeung.fh_jotnotes;

import java.util.Date;

/**
 * Created by slaps on 2017-02-18.
 */

public class Note {
    private Date date;
    private String note;
    Note(Date date, String note)
    {
        this.date=new Date();
        this.note=note;
    }
    private String getNote()
    {
        return note;
    }
    private Date getDate()
    {
        return date;
    }
}

