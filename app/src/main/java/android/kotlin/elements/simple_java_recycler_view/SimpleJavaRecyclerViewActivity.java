package android.kotlin.elements.simple_java_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.kotlin.elements.R;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SimpleJavaRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_java_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.simple_java_rw);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> strings = new ArrayList<>();

        for(int i=0;i<100;i++)
            strings.add("String number - "+i);

        SimpleAdapter simpleAdapter = new SimpleAdapter(strings,this);

        recyclerView.setAdapter(simpleAdapter);

    }
}
