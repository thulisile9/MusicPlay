package com.example.android.musicplay;


import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class SongAdapter extends ArrayAdapter<Song> {
    private int mColorResourcesId;



    public SongAdapter(Activity context, int mColorResourcesId, List<Song> songs) {
        super(context, 0, songs);
      this.mColorResourcesId = mColorResourcesId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_list_item, parent, false);
        }

        Song currentSong = getItem(position);


        TextView musicTextView = (TextView)  listItemView.findViewById(R.id.music_play);

        musicTextView.setText(currentSong.getmSongTitle());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        artistTextView.setText(currentSong.getmArtists());


        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourcesId);

        textContainer.setBackgroundColor(color);


        return listItemView;}
}

