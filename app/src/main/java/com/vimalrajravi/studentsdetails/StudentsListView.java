package com.vimalrajravi.studentsdetails;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StudentsListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view);

        RecyclerView recyclerView=findViewById(R.id.rec_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Students> studentsdetails= new ArrayList<>();
        studentsdetails.add(new Students("NAME:Siva","STD:8th","SEC:A","5th RANK"));
        studentsdetails.add(new Students("NAME:RamaMoorthy","STD:8th","SEC:A","4th RANK"));
        studentsdetails.add(new Students("NAME:Ifran","STD:8th","SEC:A","7th RANK"));
        studentsdetails.add(new Students("NAME:Ganesh","STD:8th","SEC:A","3rd RANK"));
        studentsdetails.add(new Students("NAME:Jhon","STD:8th","SEC:A","1th RANK"));
        studentsdetails.add(new Students("NAME:Manniyappan","STD:8th","SEC:A","RANK:2nd"));
        recyclerView.setAdapter(new StudentsAdopter(studentsdetails));
    }
}



