package com.dragon.dragon2;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class RecAdapter extends RecyclerView.Adapter<RecAdapter.ViewHolder> {
    private static final String TAG = "RecAdapter";
    private static RowItem[] items;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {
        // each data item is just a string in this case
        public TextView timeView;
        public Button btn ;
        public CheckBox cb7;
        public CheckBox cb1;
        public CheckBox cb2;
        public CheckBox cb3;
        public CheckBox cb4;
        public CheckBox cb5;
        public CheckBox cb6;

        public ViewHolder(View v)  {
            super(v);
            timeView = v.findViewById(R.id.timeText);
            btn = v.findViewById(R.id.button);
            cb7 = v.findViewById(R.id.checkBox7);
            cb1 = v.findViewById(R.id.checkBox1);
            cb2 = v.findViewById(R.id.checkBox2);
            cb3 = v.findViewById(R.id.checkBox3);
            cb4 = v.findViewById(R.id.checkBox4);
            cb5 = v.findViewById(R.id.checkBox5);
            cb6 = v.findViewById(R.id.checkBox6);

            cb7.setOnClickListener(this);
            cb1.setOnClickListener(this);
            cb2.setOnClickListener(this);
            cb3.setOnClickListener(this);
            cb4.setOnClickListener(this);
            cb5.setOnClickListener(this);
            cb6.setOnClickListener(this);
        }

        public TextView getTimeView()
        {
            return timeView;
        }
        public Button getBtn()
        {
            return btn;
        }
        public CheckBox getCb1()
        {
            return cb1;
        }
        public CheckBox getCb2()
        {
            return cb2;
        }
        public CheckBox getCb3()
        {
            return cb3;
        }
        public CheckBox getCb4()
        {
            return cb4;
        }
        public CheckBox getCb5()
        {
            return cb5;
        }
        public CheckBox getCb6()
        {
            return cb6;
        }
        public CheckBox getCb7()
        {
            return cb7;
        }



        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        @Override
        public void onClick(View v) {
            int pos = getAdapterPosition();
            Log.d(TAG,"dddddddd: " +pos + " " + v.getId() + "  " + R.id.checkBox7);


            if(v.getId() == R.id.checkBox7)
            {
                items[pos].setSunday( cb7.isChecked() );
                
                Log.d(TAG, pos + " cb7 set" );
            }

            if(v.getId() == R.id.checkBox1)
            {
                items[pos].setMonday( cb1.isChecked() );
                Log.d(TAG, pos + " cb1 set" );
            }

            if(v.getId() == R.id.checkBox2)
            {
                items[pos].setTuesday( cb2.isChecked() );
                Log.d(TAG, pos + " cb2 set" );
            }

            if(v.getId() == R.id.checkBox3)
            {
                items[pos].setWednesday( cb3.isChecked() );
                Log.d(TAG, pos + " cb3 set" );
            }

            if(v.getId() == R.id.checkBox4)
            {
                items[pos].setThursday( cb4.isChecked() );
                Log.d(TAG, pos + " cb4 set" );
            }

            if(v.getId() == R.id.checkBox5)
            {
                items[pos].setFriday( cb5.isChecked() );
                Log.d(TAG, pos + " cb5 set" );
            }

            if(v.getId() == R.id.checkBox6)
            {
                items[pos].setSaturday( cb6.isChecked() );
                Log.d(TAG, pos + " cb6 set" );
            }

        }
    }

    //
    public RecAdapter( RowItem[] items  )
    {
        this.items = items;
    }

    // BEGIN_INCLUDE(recyclerViewOnCreateViewHolder)
    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view.
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.listview_item, viewGroup, false);

        return new ViewHolder(v);
    }
    // END_INCLUDE(recyclerViewOnCreateViewHolder)



    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        Log.d(TAG, "Element " + position + " set.");

        // Get element from your dataset at this position and replace the contents of the view
        // with that element
        viewHolder.getTimeView().setText(items[position].getTime());
        viewHolder.getCb7().setChecked(items[position].isSunday());
        viewHolder.getCb1().setChecked(items[position].isMonday());
        viewHolder.getCb2().setChecked(items[position].isTuesday());
        viewHolder.getCb3().setChecked(items[position].isWednesday());
        viewHolder.getCb4().setChecked(items[position].isThursday());
        viewHolder.getCb5().setChecked(items[position].isFriday());
        viewHolder.getCb6().setChecked(items[position].isSaturday());
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
