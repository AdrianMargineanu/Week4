package com.example.week4;

import android.service.autofill.FillEventHistory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private List<Student> students;

    public StudentsAdapter(List<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View studentItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_activity,parent,false);
        return new StudentViewHolder(studentItem);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student currentStudent =students.get(position);
        holder.getFirstName().setText(currentStudent.getFirstName());
        holder.getLastName().setText(currentStudent.getLastName());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
