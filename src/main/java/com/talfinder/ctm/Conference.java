package com.talfinder.ctm;

import static com.talfinder.ctm.util.Constant.NEW_LINE;

import java.util.ArrayList;
import java.util.List;

public class Conference {
    private List<Track> tracks;

    public Conference() {
        tracks = new ArrayList<Track>();
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }
    
    public List<Track> getTracks() {
    	return tracks;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Conference Schedule:" + NEW_LINE + NEW_LINE);
        for (int i = 0; i < tracks.size(); i++) {
            str.append("Track " + (i + 1) + ":" + NEW_LINE);
            str.append(tracks.get(i));
            if(i < (tracks.size()-1)) {
            	str.append(NEW_LINE);
            }
        }
        return str.toString();
    }
}
