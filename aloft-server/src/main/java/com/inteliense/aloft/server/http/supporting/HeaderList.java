package com.inteliense.aloft.server.http.supporting;

import java.util.ArrayList;

public class HeaderList {

    private ArrayList<Header> headers = new ArrayList<>();

    public void addHeader(Header header) {
        headers.add(header);
    }

}
