package com.example.mehedihasan_.quizpart;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "MyQuiz.db";
    private static final int DATABASE_VERSION = 7;
    public static final String TABLE_NAME = "quiz_questions";
    public static final String ID = "_id";
    public static final String COLUMN_QUESTION = "question";
    public static final String COLUMN_OPTION1 = "option1";
    public static final String COLUMN_OPTION2 = "option2";
    public static final String COLUMN_OPTION3 = "option3";
    public static final String COLUMN_ANSWER_NR = "answer_nr";

    public static final String DROP_TABLE = " DROP TABLE IF EXISTS "+ TABLE_NAME;

    public static final String CREATE_TABLE = "CREATE TABLE " +
            TABLE_NAME + " ( " +
            ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COLUMN_QUESTION + " TEXT, " +
            COLUMN_OPTION1 + " TEXT, " +
            COLUMN_OPTION2 + " TEXT, " +
            COLUMN_OPTION3 + " TEXT, " +
            COLUMN_ANSWER_NR + " INTEGER" +
            ")";
    private Context context;


    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try{
            Toast.makeText(context,"Exception :onCreate",Toast.LENGTH_SHORT).show();
            db.execSQL(CREATE_TABLE);
        }catch(Exception e){
            Toast.makeText(context,"Exception :"+e,Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       try{
           Toast.makeText(context,"onUpgrade",Toast.LENGTH_SHORT).show();
           db.execSQL(DROP_TABLE);
           onCreate(db);
       }catch(Exception e){
           Toast.makeText(context,"Exception :"+e,Toast.LENGTH_SHORT).show();
       }



    }

    public long addQuestion(String q,String op1,String op2,String op3,String crop){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues =new ContentValues();
        contentValues.put(COLUMN_QUESTION,q);
        contentValues.put(COLUMN_OPTION1,op1);
        contentValues.put(COLUMN_OPTION2,op2);
        contentValues.put(COLUMN_OPTION3,op3);
        contentValues.put(COLUMN_ANSWER_NR,crop);

        long rowId = db.insert(TABLE_NAME,null,contentValues);
        return rowId;
    }

    public ArrayList<Question> addQuestion() {
        ArrayList<Question> questionList = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}
