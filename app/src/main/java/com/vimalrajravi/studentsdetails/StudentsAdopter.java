package com.vimalrajravi.studentsdetails;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdopter extends RecyclerView.Adapter<StudentsVIewHolder> {

    private List<Students> studentsList;

    public StudentsAdopter(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public StudentsVIewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.students_viewholder, parent, false);
        return new StudentsVIewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsVIewHolder holder, int position) {
        Students studentsinfo = studentsList.get(position);
        holder.nameview.setText(studentsinfo.names);
        holder.stdview.setText(studentsinfo.std);
        holder.sectionview.setText(studentsinfo.sec);
        holder.rankview.setText(studentsinfo.rank);

    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }
}

