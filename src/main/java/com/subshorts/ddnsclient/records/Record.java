package com.subshorts.ddnsclient.records;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class Record {
    private long id;

    private final String name;
    private int ttl;
    private final RecordType type;
    private String data;

    @Override
    public String toString() {
        return name + " " + ttl + " IN " + type + " " + data;
    }
}
