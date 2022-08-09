package com.example.lab503;

public class CpuPart implements PartService {
    private String info;
    
    public CpuPart() {
        this.info = "Apple M1";
    }
    
    public CpuPart(String series) {
        this.info = series;
    }
    @Override
    public String getinfo() {
        return info;
    }

}