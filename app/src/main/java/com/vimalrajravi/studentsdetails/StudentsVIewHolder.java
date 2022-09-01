package com.vimalrajravi.studentsdetails;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentsVIewHolder extends RecyclerView.ViewHolder {
    TextView nameview,stdview,sectionview,rankview;
    public StudentsVIewHolder(@NonNull View itemView) {
        super(itemView);
        nameview=itemView.findViewById(R.id.stu_names);
        stdview=itemView.findViewById(R.id.std_view);
        sectionview=itemView.findViewById(R.id.sec_view);
        rankview=itemView.findViewById(R.id.rank_view);
    }
}
