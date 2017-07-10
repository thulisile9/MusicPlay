package com.example.android.musicplay;

import android.content.Context;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link MusicCategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Song} objects.
 */
public class MusicCategoryAdapter extends FragmentPagerAdapter{

    private Context mContext;
    public MusicCategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getString(R.string.Song);
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        return new SongFragment(); }




    @Override
    public int getCount() {
        return 1;
    }}

