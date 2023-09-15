package com.example.bus.model;

import java.time.LocalDate;

public class Recording {
    private long id;
    private LocalDate date;

    public Recording() {
    }

    public Recording(long id, LocalDate date) {
        this.id = id;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
