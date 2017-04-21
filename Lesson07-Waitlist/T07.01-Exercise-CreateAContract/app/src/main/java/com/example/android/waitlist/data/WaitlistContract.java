package com.example.android.waitlist.data;

import android.provider.BaseColumns;

import java.lang.reflect.Member;

public class WaitlistContract {

    private WaitlistContract() {

    }

    // TODO (1) Create an inner class named WaitlistEntry class that implements the BaseColumns interface
    public final static class WaitListEntry implements BaseColumns {

        public static final String TABLE_NAME = "WAIT_LIST";
        public static final String COLUMN_GUEST_NAME = "GUEST_NAME";
        public static final String COLUMN_PARTY_SIZE = "PARTY_SIZE";
        public static final String COLUMN_TIMESTAMP = "ARRIVAL_TIMESTAMP";
     }

        // TODO (2) Inside create a static final members for the table name and each of the db columns
        // TABLE_NAME -> waitlist;
        // COLUMN_GUEST_NAME -> guestName
        // COLUMN_PARTY_SIZE -> partySize
        // COLUMN_TIMESTAMP -> timestamp

}
