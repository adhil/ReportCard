package com.example.android.reportcard;

/**
 * Created by adhil on 5/7/16.
 */
public class ReportCard {

    /**
     * Define Variables to store score
     */
    private int mEnglishScore;
    private int mMathsScore;
    private int mScienceScore;
    private int mHistoryScore;

    /**
     * Default constructor initializes all variables to 30.
     */
    public ReportCard() {
        mEnglishScore = 30;
        mMathsScore = 30;
        mScienceScore = 30;
        mHistoryScore = 30;
    }

    /**
     * Getter methods
     * return the scores of the respective subjects
     */
    public int getmEnglishScore() {
        return mEnglishScore;
    }

    public int getmMathsScore() {
        return mMathsScore;
    }

    public int getmScienceScore() {
        return mScienceScore;
    }

    public int getmHistoryScore() {
        return mHistoryScore;
    }

    /**
     * Setter methods
     * sets the scores of the respective subjects
     */
    public void setmEnglishScore(int mEnglishScore) {
        this.mEnglishScore = mEnglishScore;
    }

    public void setmMathsScore(int mMathsScore) {
        this.mMathsScore = mMathsScore;
    }

    public void setmScienceScore(int mScienceScore) {
        this.mScienceScore = mScienceScore;
    }

    public void setmHistoryScore(int mHistoryScore) {
        this.mHistoryScore = mHistoryScore;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mEnglishScore=" + mEnglishScore +
                ", mMathsScore=" + mMathsScore +
                ", mScienceScore=" + mScienceScore +
                ", mHistoryScore=" + mHistoryScore +
                '}';
    }
}
