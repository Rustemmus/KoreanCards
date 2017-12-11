package com.example.riskakov.koreancards;

        import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

        import java.util.HashMap;
        import java.util.Map;

        /* Created by admin on 12.02.2017.
        */
public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 2;
    public static final String DATABASE_NAME = "koreanDB";
    public static final String TABLE_NAME = "vocabulary";

    //public static final String KEY_ID= "id";
    public static final String WORD = "word";
    public static final String TRANSCRIPTION = "transcription";
    public static final String TRANSLATION = "translation";
    public static final String DESCRIPTION = "description";
    public static final String KEY_TRAINED_LEVEL = "trainedLevel";

    public static final String CREATE_TABLE_NOTE = "create table "
            + TABLE_NAME
            + " ("
            //+ KEY_ID + " integer primary key, "
            + WORD + " text not null, "
            + TRANSCRIPTION + " text, "
            + TRANSLATION + " text not null, "
            + DESCRIPTION + " text, "
            + KEY_TRAINED_LEVEL  + "  INTEGER DEFAULT 0);";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE_NOTE);


            db.execSQL("INSERT INTO vocabulary (word, transcription, translation, description, trainedLevel)" +
                    "VALUES(" + "거기"+", ''," + "'there'," + "'\"Notes:\n" +
                    "The difference between “그” and “저” is the same as the difference between “거기” and “저기.” “거기” is used when referring to a place that has already been mentioned, and “저기” is used when you are referring to a place that is farther away than “여기.”\n" +
                    "\n" +
                    "거기 and ~에세 form to make “거기서.”\n" +
                    "\n" +
                    "Example:\n" +
                    "거기서 언제부터 살았어요? = Since when did you live there?\n" +
                    "거기에 간 적이 없어요 = I have never gone/been there/I haven’t been there\n" +
                    "제가 거기에 가는 중이에요 = I am going there\n" +
                    "밥을 거기에 두지 말아 주세요 = Don’t put the rice there, please\n" +
                    "거기에 가고 싶으면 비행기를 타야 돼요 = If you want to go there, you must take an airplane\n" +
                    "친구가 거기에 많을 거라서 그 파티에 가고 싶어요 = Many of my friends will be there, so/therefore I want to go to that party\"\n'," + 0 +");");
            //          INSERT INTO quranTotal(id, anglicizedName) VALUES(26, 'ash-Shuara'');
        }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME );
        onCreate(db);
    }
}