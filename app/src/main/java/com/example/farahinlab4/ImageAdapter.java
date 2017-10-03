package com.example.farahinlab4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by student12 on 10/2/17.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[] mThumbIds = {
            R.drawable.pic_1, R.drawable.pic_2,
            R.drawable.pic_3, R.drawable.pic_4,
            R.drawable.pic_5, R.drawable.pic_6,

    };

    public ImageAdapter(Context c){
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }


    public Object getItem(int position){
        return mThumbIds[position];
    };


    public long getItemId(int position){
        return 0;
    }


    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(250,250));
        return imageView;
    };

}
