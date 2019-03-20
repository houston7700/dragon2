package com.dragon.dragon2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomListViewAdapter extends ArrayAdapter<RowItem> {

    Context context;
    //private List<RowItem> rowList;

    public CustomListViewAdapter(Context context, int resourceId,
                                 List<RowItem> items) {
        super(context, resourceId, items);
        this.context = context;
    }


    /*private view holder class*/
    private class ViewHolder {
        TextView timeView;
        Button button;
        CheckBox sunBox;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        RowItem rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        // use holder pattern to speed up listview scroll *************** !!
        
        if(convertView==null)
        {
            convertView = mInflater.inflate(R.layout.listview_item, null);

            holder = new ViewHolder();
            holder.timeView = (TextView) convertView.findViewById(R.id.timeText);
            holder.button = convertView.findViewById(R.id.button);
            holder.sunBox = convertView.findViewById(R.id.checkBox7);

            convertView.setTag(holder);

            //TextView timeText = (TextView) convertView.findViewById(R.id.timeText);

            /*
        CheckBox SundayBox = (CheckBox) convertView.findViewById(R.id.checkBox7);
        CheckBox MondayBox = (CheckBox) convertView.findViewById(R.id.checkBox1);
        CheckBox TuesdayBox = (CheckBox) convertView.findViewById(R.id.checkBox2);
        CheckBox WednesdayBox = (CheckBox) convertView.findViewById(R.id.checkBox3);
        CheckBox ThursdayBox = (CheckBox) convertView.findViewById(R.id.checkBox4);
        CheckBox FridayBox = (CheckBox) convertView.findViewById(R.id.checkBox5);
        CheckBox SaturdayBox = (CheckBox) convertView.findViewById(R.id.checkBox6);
*/
            //timeText.setText(rowItem.getTime());
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.timeView.setText(rowItem.getTime());

        return convertView;
    }

}
