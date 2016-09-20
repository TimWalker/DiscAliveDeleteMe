package com.example.theagiletester.discalive;

/**
 * Created by timwalker on 9/19/16.
 */
public class RFIDFakeReaderNoRFID implements RFIDReaderInterface {
    public boolean tagsInProximity() {
        return false;
    }
}
