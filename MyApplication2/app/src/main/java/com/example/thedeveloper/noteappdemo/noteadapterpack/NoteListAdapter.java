package com.example.thedeveloper.noteappdemo.noteadapterpack;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.example.thedeveloper.noteappdemo.R;
import com.example.thedeveloper.noteappdemo.notepackages.NoteModel;

import java.util.ArrayList;

/**
 * Created by The Developer on 5/7/2017.
 */

public class NoteListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<NoteModel> noteModels;

    public NoteListAdapter(Context context, ArrayList<NoteModel> noteModels) {
        this.context = context;
        this.noteModels = noteModels;
    }

    @Override
    public int getCount() {
        return noteModels.size();
    }

    @Override
    public Object getItem(int position) {
        return noteModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if(convertView == null){

            convertView = View.inflate(context, R.layout.item_list,null);
        }

        TextView tv = (TextView) convertView.findViewById(R.id.noteTitleText);
        TextView tv1 = (TextView) convertView.findViewById(R.id.noteSubTitletextView);
        ImageView images = (ImageView) convertView.findViewById(R.id.noteImages);

        NoteModel notes = noteModels.get(position);
        tv.setText(notes.getNoteTitle());
        tv1.setText(notes.getSubTitle());

        ColorGenerator generator = ColorGenerator.MATERIAL;
        int color = generator.getRandomColor();

        String names = String.valueOf(notes.getNoteTitle().charAt(0));

        TextDrawable drawable2 = TextDrawable.builder()
                .buildRound(names,color);

        images.setImageDrawable(drawable2);

        return convertView;
    }
}
