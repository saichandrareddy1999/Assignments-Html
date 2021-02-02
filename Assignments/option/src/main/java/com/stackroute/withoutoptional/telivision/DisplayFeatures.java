package com.stackroute.withoutoptional.telivision;

import com.stackroute.nullpointerexception.television.Hdr;

public class DisplayFeatures {
    private String size;
    private com.stackroute.nullpointerexception.television.Hdr hdr;

    public DisplayFeatures(String size, com.stackroute.nullpointerexception.television.Hdr hdr) {
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
