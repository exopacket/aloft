package com.inteliense.aloft.server.http.supporting;

import com.inteliense.aloft.utils.global.__;

import java.util.ArrayList;

public class HeaderList {

    private ArrayList<Header> headers = new ArrayList<>();

    public void addHeader(Header header) {
        headers.add(header);
    }

    public boolean has(String header) {
        for(int i=0; i< headers.size(); i++) {
            if(__.same(headers.get(i).getKey(), header)) return true;
        }
        return false;
    }

}
