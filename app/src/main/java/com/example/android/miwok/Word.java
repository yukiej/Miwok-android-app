package com.example.android.miwok;


public class Word {

    //word in default language (String)
    private String mDefaultTranslation;

    //Miwok translation of word (String)
    private String mMiwokTranslation;

    //Sets the Miwok and default translations of a word object
    public Word(String defaultString, String miwokString){
        mMiwokTranslation = miwokString;
        mDefaultTranslation = defaultString;
    }

    //Returns the Miwok translation of the word
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //Returns the default language version of the word
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
}
