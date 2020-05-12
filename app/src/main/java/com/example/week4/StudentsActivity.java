package com.example.week4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class StudentsActivity extends AppCompatActivity {

    private List<Student> students;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        getStudents();
        recyclerView = this.findViewById(R.id.recyclerviewStudents);
        setLayoutManager(recyclerView);
        setAdapter(recyclerView);
    }

    private void getStudents(){
        students = new ArrayList<>();
        Student student = null;
        for(int i = 1; i < 31; i++){
            student = new Student();
            student.setFirstName("FirstName " + i);
            student.setLastName("LastName " + i);
            students.add(student);
        }
    }

    private void setLayoutManager(RecyclerView recyclerViewEvents){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewEvents.setLayoutManager(linearLayoutManager);
    }

    private void setAdapter(RecyclerView recyclerViewEvents){
        StudentsAdapter studentsAdapter = new StudentsAdapter(students);
        recyclerViewEvents.setAdapter(studentsAdapter);
    }
}
