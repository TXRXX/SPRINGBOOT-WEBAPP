package com.example.lab502;

import org.springframework.stereotype.Component;

@Component
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