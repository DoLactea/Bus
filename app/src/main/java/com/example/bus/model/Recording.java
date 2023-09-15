package com.example.bus.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Recording {
    private long RecordingID;

    private long BusID;
    private LocalDate RecordingDate;
    private String RecordingType;
    private String Comment;
}
