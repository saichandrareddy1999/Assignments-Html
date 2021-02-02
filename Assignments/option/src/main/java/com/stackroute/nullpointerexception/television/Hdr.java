package com.stackroute.nullpointerexception.television;

public class Hdr {
    private String contrast;
    private String colour;
    public Hdr(String contrast,String colour){
        this.contrast=contrast;
        this.colour=colour;
    }
    public String getContrast(){
        return contrast;
    }
    public String getcolour(){
        return colour;
    }
}
