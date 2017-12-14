package bdfh7.edu.umkc.personaltrainermobile;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brenodm on 4/14/15.
 */
public class DB_Helper extends SQLiteOpenHelper {

    private static final String db_name = "trainings_schedule";
    private static final int db_version = 4;

    public DB_Helper(Context context) {
        super(context, db_name, null, db_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            String sqlCreateTableTraining = "CREATE TABLE training("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "name TEXT,"
                    + "gender TEXT,"
                    + "height FLOAT,"
                    + "weight FLOAT,"
                    + "age INTEGER"
                    + ")";

            db.execSQL(sqlCreateTableTraining);
        } catch (Exception e) {
            Log.e("MySQL Create Error", e.getMessage());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sqlDropTableTraining = "DROP TABLE training";
        db.execSQL(sqlDropTableTraining);
        onCreate(db);
    }

    public void insertTraining(New_Training_GetterSetter training) {
        try {
            SQLiteDatabase db = getWritableDatabase();
            ContentValues cv = new ContentValues();

            cv.put("name", training.getName());
            cv.put("gender", training.getGender());
            cv.put("height", training.getHeight());
            cv.put("weight", training.getWeight());
            cv.put("age", training.getAge());

            db.insert("training", null, cv);
            db.close();
        } catch (Exception e) {
            Log.e("MySQL Insert Error", e.getMessage());
        }
    }

    /*public boolean deleteTraining(String name) {

        boolean result = false;

        String query = "Select * FROM training WHERE " + COLUMN_PRODUCTNAME + " =  \"" + productname + "\"";

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        Product product = new Product();

        if (cursor.moveToFirst()) {
            product.setID(Integer.parseInt(cursor.getString(0)));
            db.delete(TABLE_PRODUCTS, COLUMN_ID + " = ?",
                    new String[] { String.valueOf(product.getID()) });
            cursor.close();
            result = true;
        }
        db.close();
        return result;
    }*/

    public List<New_Training_GetterSetter> selectTrainings() {
        List<New_Training_GetterSetter> listTrainings = new ArrayList<New_Training_GetterSetter>();

        SQLiteDatabase db = getReadableDatabase();
        String sqlSelectTrainings = "SELECT * FROM training";
        Cursor c = db.rawQuery(sqlSelectTrainings, null);

        if (c.moveToFirst()) {
            do {
                New_Training_GetterSetter training = new New_Training_GetterSetter();

                training.setId(c.getInt(0));
                training.setName(c.getString(1));
                training.setGender(c.getString(2));
                training.setHeight(c.getFloat(3));
                training.setWeight(c.getFloat(4));
                training.setAge(c.getInt(5));

                listTrainings.add(training);
            } while (c.moveToNext());
        }
        db.close();
        return listTrainings;
    }
}
