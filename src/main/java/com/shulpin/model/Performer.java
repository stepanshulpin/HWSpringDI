package com.shulpin.model;

public class Performer {

    private Instrument instrument;

    public Performer(Instrument instrument){
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "Performer [instrument=" + instrument + "]";
    }

}
