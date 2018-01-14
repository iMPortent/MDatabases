package nyc.c4q.mdatabases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by MarckemX on 1/14/18.
 */

public class MyDatabase extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "MySampleDatabase";
    private static final String TABLE_NAME = "laptop_sightings";
    private static final int SCHEMA_VERSION = 1;

    public MyDatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, SCHEMA_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME + ";");
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(id PRIMARY KEY AUTOINCREMENT,"
                + " date DATETIME DEFAULT CURRENT_TIMESTAMP, age INTEGER, hair BOOLEAN, hair_color TEXT," +
                " seat INTEGER);" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addSighting()
}
