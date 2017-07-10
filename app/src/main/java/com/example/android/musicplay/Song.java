package com.example.android.musicplay;

/**
 * Created by Admin on 7/4/2017.
 */

public class Song {

    /** Audio resource ID for the word */
    private int mAudioResourceId;
    private String mSongTitle;
    private String mArtists;
    private int mImageResourceId;


    /**
     * Create a new Songs object.

     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Song(String SongTitle, String artist, int audioResourceId) {
        mAudioResourceId = audioResourceId;
        mSongTitle = SongTitle;
        mArtists = artist;

    }


    public String getmArtists() {
        return mArtists;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public Song(String SongTitle, String artist,
                int audioResourceId, int imageResourceId) {
        mAudioResourceId = audioResourceId;
        mSongTitle = SongTitle;

        mArtists = artist;
        mImageResourceId = imageResourceId;
    }



    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public String getmSongTitle () {return mSongTitle;}
}








