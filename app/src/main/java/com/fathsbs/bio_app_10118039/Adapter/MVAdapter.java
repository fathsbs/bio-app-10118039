//package com.fathsbs.bio_app_10118039.Adapter;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.fathsbs.bio_app_10118039.DataMusic;
//import com.fathsbs.bio_app_10118039.R;
//
//import org.jetbrains.annotations.NotNull;
//
//import java.util.ArrayList;
//
//public class MVAdapter extends RecyclerView.Adapter{
//
//    @NonNull
//    @NotNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music_mv, parent,false);
//        return ListViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
//        ((ListViewHolder) holder).bindView(position);
//    }
//
//    @Override
//    public int getItemCount() {
//        return DataMusic.music.length;
//    }
//
//    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
//        private TextView textView;
//
//        public ListViewHolder(View itemView){
//            super(textView);
//            itemView = (TextView) itemView.findViewById(R.id.title_music);
//            itemView.setOnClickListener(this);
//        }
//
//        public void bindView(int position){
//            textView.setText((DataMusic.music[position]));
//        }
//
//
//    }
//}
