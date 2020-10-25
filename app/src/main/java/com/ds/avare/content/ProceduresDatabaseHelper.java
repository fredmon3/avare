package com.ds.avare.content;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by zkhan on 3/13/17.
 */

public class ProceduresDatabaseHelper extends MainDatabaseHelper {

    private static final String DBNAME = "procedures.db";

    public ProceduresDatabaseHelper(Context context, String folder) {
        super(context, folder, DBNAME);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }

}