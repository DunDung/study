package net.skhu.e06list;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder  implements CompoundButton.OnCheckedChangeListener {
        TextView textView1, textView2;
        CheckBox checkBox;

        public ViewHolder(View view) {
            super(view);
            this.textView1 = view.findViewById(R.id.textView1);
            this.textView2 = view.findViewById(R.id.textView2);
            this.checkBox = view.findViewById(R.id.checkBox);
            this.checkBox.setOnCheckedChangeListener(this);
        }

        public void setData() {
            Item item = arrayList.get(super.getAdapterPosition());
            this.textView1.setText(item.getTitle());
            this.textView2.setText(item.getCreateTimeFormatted());
            this.checkBox.setChecked(item.isChecked());
        }

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            Item item = arrayList.get(super.getAdapterPosition());
            item.setChecked(isChecked);
            if (isChecked) ++checkedItemCount; else --checkedItemCount;
            if (checkedItemCount <= 1)
                ((Activity) textView1.getContext()).invalidateOptionsMenu();
        }
    }

    LayoutInflater layoutInflater;
    List<Item> arrayList;
    int checkedItemCount = 0;

    public MyRecyclerViewAdapter(Context context, List<Item> arrayList) {
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
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int index) {
        viewHolder.setData();
    }
}

