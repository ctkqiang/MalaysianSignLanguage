package uk.co.johnmelodyme.malaysiansignlanguage.services;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import uk.co.johnmelodyme.malaysiansignlanguage.constant.LogLevel;
import uk.co.johnmelodyme.malaysiansignlanguage.functions.Functions;

public class DatabaseHandler extends SQLiteOpenHelper
{


    /* SQLite Local Database Helper Configuration */
    public static int database_version = 0x1;

    public static String database_name = "msldb";
    public static String database_table = "content";

    public static String column_id = "id";
    public static String column_name = "name";
    public static String column_url = "url";

    public DatabaseHandler(Context context)
    {
        super(context, database_name, null, database_version);
    }

    /**
     * Called when the database is created for the first time. This is where the
     * creation of tables and the initial population of the tables should happen.
     *
     * @param database The database.
     */
    @Override
    public void onCreate(SQLiteDatabase database)
    {

        Functions.log_output("database_handler_onCreate:/1", 0, LogLevel.DEBUG);
        String query = String.format(
                "CREATE TABLE%s(%s INTEGER PRIMARY KEY AUTOINCREMENT, %sTEXT,%s TEXT)",
                database_table,
                column_id,
                column_name,
                column_url
        );

        database.execSQL(query);
    }

    /**
     * Called when the database needs to be upgraded. The implementation
     * should use this method to drop tables, add tables, or do anything else it
     * needs to upgrade to the new schema version.
     *
     * <p>
     * The SQLite ALTER TABLE documentation can be found
     * <a href="http://sqlite.org/lang_altertable.html">here</a>. If you add new columns
     * you can use ALTER TABLE to insert them into a live table. If you rename or remove columns
     * you can use ALTER TABLE to rename the old table, then create the new table and then
     * populate the new table with the contents of the old table.
     * </p><p>
     * This method executes within a transaction.  If an exception is thrown, all changes
     * will automatically be rolled back.
     * </p>
     *
     * @param database   The database.
     * @param oldVersion The old database version.
     * @param newVersion The new database version.
     */
    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion)
    {
        database.execSQL("DROP TABLE IF EXISTS " + database_table);
        onCreate(database);
    }

    public void download_content(String name, String url)
    {
        /* Declaration of Instances */
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues content_values = new ContentValues();

        content_values.put(column_name, name);
        content_values.put(column_url, url);

        database.insert(database_table, null, content_values);

        database.close();
    }
}
