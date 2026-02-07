package com.aw_example.journalApp.entity;

public class JournalEntry {
    private long id;
    private String title;
    private String content;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    
    public String getTitle(){
        return title;
    }
    public void setId(String title){
        this.title=title;
    }
    
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }

}
