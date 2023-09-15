package com.example.bus.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bus.R;
import com.example.bus.model.Recording;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class RecordingAdapter extends RecyclerView.Adapter<RecordingAdapter.PartViewHolder> {

    private final Context context;
    private final List<Recording> parts;



    @NonNull
    @NotNull
    @Override
    public PartViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View partItems = LayoutInflater.from(parent.getContext()).inflate(R.layout.recording_item, parent, false);
        return new PartViewHolder(partItems);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PartViewHolder holder, int position) {

    }

    private void setText(TextView view, Object o) {
        view.setText(o != null ? o.toString() : "");
    }

    @Override
    public int getItemCount() {
        return parts.size();
    }

    public void clearItems() {
        parts.clear();
        notifyDataSetChanged();
    }

    @Getter
    public static final class PartViewHolder extends RecyclerView.ViewHolder {
        private final TextView nameOfPartTextView;
        private final TextView countOfPartTextView;
        private final TextView unitOfPartTextView;
        private final TextView reasonOfPartTextView;
        private final TextView priceOfPartTextView;
        private final TextView sumOfPartTextView;

        public PartViewHolder(@NonNull @NotNull View view) {
            super(view);

            nameOfPartTextView = view.findViewById(R.id.nameOfPartTextView);
            countOfPartTextView = view.findViewById(R.id.countOfPartTextView);
            unitOfPartTextView = view.findViewById(R.id.unitOfPartTextView);
            reasonOfPartTextView = view.findViewById(R.id.reasonOfPartTextView);
            priceOfPartTextView = view.findViewById(R.id.priceOfPartTextView);
            sumOfPartTextView = view.findViewById(R.id.sumOfPartTextView);

        }
    }

}

