package com.talfinder.ctm;

import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<Slot> slots;

    public Track() {
        slots = new ArrayList<Slot>();
    }

    public void addSlot(Slot slot) {
        slots.add(slot);
    }
    
    public List<Slot> getSlots() {
    	return slots;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Slot slot : slots) {
            str.append(slot);
        }
        return str.toString();
    }
}
