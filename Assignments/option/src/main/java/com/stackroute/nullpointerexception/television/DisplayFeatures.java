package com.stackroute.nullpointerexception.television;

public class DisplayFeatures {
    private String size;
    private Hdr hdr;

    public DisplayFeatures(String size, Hdr hdr) {
        this.size = size;
        this.hdr = hdr;
    }

    public String getSize() {
        return size;
    }

    public Hdr getHdr() {
        return hdr;
    }
}
