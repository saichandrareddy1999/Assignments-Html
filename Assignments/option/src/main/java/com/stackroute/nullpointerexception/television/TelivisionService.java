package com.stackroute.nullpointerexception.television;

public class TelivisionService {
    public String getTelivisionHDRColour(Telivision telivision){
        if(telivision!=null){
            DisplayFeatures displayFeatures=telivision.getDisplayFeatures();
            if(displayFeatures!=null){
                Hdr hdr=displayFeatures.getHdr();
                return hdr.getcolour();
            }
        }
        return null;
    }
}
