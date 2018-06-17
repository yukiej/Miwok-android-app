package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word>{
    public WordAdapter(@NonNull Context context, @NonNull List words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get current word located at position in the list

        Word currentWord = getItem(position);

        //get Miwok translation of next word

        String miwokTranslation = currentWord.getMiwokTranslation();

        //get default language translation of next word

        String defaultLanguageTranslation = currentWord.getDefaultTranslation();

        //Create a view
        //View view = super.getView(position, convertView, parent);

        View view = convertView;
        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }

        //Add Miwok translation to miwok textview

        ((TextView)view.findViewById(R.id.miwok_textview)).setText(miwokTranslation);


        //Add English translation to English textview

        ((TextView)view.findViewById(R.id.default_textview)).setText(defaultLanguageTranslation);

        //return view

        return view;

    }
}
