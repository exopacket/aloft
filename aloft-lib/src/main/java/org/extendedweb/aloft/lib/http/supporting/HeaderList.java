package org.extendedweb.aloft.lib.http.supporting;

import com.sun.net.httpserver.Headers;
import org.extendedweb.aloft.utils.global.__;

import java.util.ArrayList;
import java.util.Arrays;

public class HeaderList {

    private ArrayList<Header> headers = new ArrayList<>();

    public void addHeader(Header header) {
        headers.add(header);
    }

    public void appendResponse(Headers headers) {
        for(Header header : this.headers) {
            String[] values = header.getArray();
            if(!__.isset(values)) continue;
            if(values.length > 0) {
                System.out.println(Arrays.asList(values));
                if(__.isset(values[0])) headers.put(header.getKey(), Arrays.asList(values));
            }
        }
    }

    public boolean has(String header) {
        for(int i=0; i< headers.size(); i++) {
            if(__.same(headers.get(i).getKey().toUpperCase(), header.toUpperCase())) return true;
        }
        return false;
    }

    public String get(String header) {
        for(int i=0; i< headers.size(); i++) {
            if(__.same(headers.get(i).getKey().toUpperCase(), header.toUpperCase())) return headers.get(i).get();
        }
        return "";
    }

    public String[] array(String header) {
        for(int i=0; i< headers.size(); i++) {
            if(__.same(headers.get(i).getKey(), header)) return headers.get(i).getArray();
        }
        return new String[]{};
    }

    public String next(String header) {
        for(int i=0; i< headers.size(); i++) {
            if(__.same(headers.get(i).getKey(), header)) return headers.get(i).next();
        }
        return null;
    }

}
