package com.inti.student.geoquiz;

/**
 * Created by WongYeeKhang on 27/9/2017.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textTesId, boolean answerTrue){
            mTextResId=textTesId;
            mAnswerTrue=answerTrue;
    }




}
