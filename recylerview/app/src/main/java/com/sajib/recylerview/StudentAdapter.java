package com.sajib.recylerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.awt.font.TextAttribute;
import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {
    private List<Student>students;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public StudentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_student_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.ViewHolder holder, int position) {
        Student student = students.get(position);
        holder.nameTV.setText(student.getName());
        holder.idTV.setText(String.valueOf(student.getId()));
        holder.emailTV.setText(student.getEmail());
        holder.phoneTV.setText(student.getPhone());
        holder.profileIV.setImageResource(student.getProfileImage());

    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nameTV,idTV,phoneTV,emailTV;
        private ImageView profileIV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            profileIV = itemView.findViewById(R.id.profileIV);
            nameTV = itemView.findViewById(R.id.nameTV);
            idTV = itemView.findViewById(R.id.idTV);
            emailTV = itemView.findViewById(R.id.emailTV);
            profileIV = itemView.findViewById(R.id.profileIV);
            phoneTV = itemView.findViewById(R.id.phoneTV);


        }
    }
}
