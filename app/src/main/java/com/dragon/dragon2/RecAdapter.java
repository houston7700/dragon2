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

        public ViewHolder(View v)  {
            super(v);
            timeView = v.findViewById(R.id.timeText);
            btn = v.findViewById(R.id.button);
            cb7 = v.findViewById(R.id.checkBox7);

            cb7.setOnClickListener(this);
        }

        public TextView getTimeView()
        {
            return timeView;
        }
        public Button getBtn()
        {
            return btn;
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
            System.out.println("dddddddd: " +pos + " " + v.getId() + "  " + R.id.checkBox7);


            if(v.getId() == R.id.checkBox7)
            {
                items[pos].setSunday( cb7.isChecked() );
                System.out.println( pos + " cb7 set" );
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
        ///todo
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
