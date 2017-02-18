package com.example.yeung.fh_jotnotes;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by slaps on 2017-02-18.
 */

public class Note {
    private Date date;
    private String note;
    private ArrayList<String> tags;
    Note(String note,ArrayList<String> tags)
    {
        this.date=new Date();
        this.note=note;
        this.tags=tags;
    }
    public String getNote()
    {
        return note;
    }
    public Date getDate()
    {
        return date;
    }
    public String getTags()
    {
        String tag="";
        for(String x:tags)
        {
            tag+=x+", ";
        }
        return tag;
    }
}

