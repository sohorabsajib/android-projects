package com.sajib.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Student> studentList;
    private RecyclerView recyclerView;
    private StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList = new ArrayList<>();
        recyclerView=findViewById(R.id.studentRecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new StudentAdapter(studentList);
        recyclerView.setAdapter(adapter);

         studentList.add(new Student("sajib",006,"0174646","s@gmail.com",R.drawable.pic));
         studentList.add(new Student("fgf",0564506,"0145674646","sg@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         studentList.add(new Student("sajib",05606,"0156574646","gf♠s@gmail.com",R.drawable.pic));
         adapter.notifyDataSetChanged();
    }
}
