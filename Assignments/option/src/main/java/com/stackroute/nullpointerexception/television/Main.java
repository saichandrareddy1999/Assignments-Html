package com.stackroute.nullpointerexception.television;


public class Main {
    public static void main(String[] args) {
        Hdr hdr=new Hdr("HIGH","BLACK");
        DisplayFeatures displayFeatures=new DisplayFeatures("55",hdr);
        Telivision telivision=new Telivision(1,"oneplus","ultra-hd-tv",displayFeatures);
        TelivisionService telivisionService=new TelivisionService();
        String colour=telivisionService.getTelivisionHDRColour(telivision);
        System.out.println(colour);
        DisplayFeatures displayFeatures1=new DisplayFeatures(null,null);
        Telivision telivision1=new Telivision(1,"oneplus","HD",displayFeatures1);
        String colour1=telivisionService.getTelivisionHDRColour(telivision1);
        System.out.println(colour1);
    }
}
