package net.skhu.e201432041;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {
        TextView textView1, textView2;

        public ViewHolder(View view, ArrayList<Item> arrayList) {
            super(view);
            this.textView1 = view.findViewById(R.id.textView1);
            this.textView2 = view.findViewById(R.id.textView2);
            view.setOnClickListener(this);
        }

        public void setData() {
            Item item = arrayList.get(super.getAdapterPosition());
            this.textView1.setText(item.getName());
            this.textView2.setText(item.getStudentNo());
        }

        @Override
        public void onClick(View view) {
           arrayList.remove(super.getAdapterPosition());
           notifyDataSetChanged();
        }
    }

    LayoutInflater layoutInflater;
    ArrayList<Item> arrayList;

    public MyRecyclerViewAdapter(Context context, ArrayList<Item> arrayList) {
        this.layoutInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = layoutInflater.inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(view, arrayList);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int index) {
        viewHolder.setData();
    }
}
