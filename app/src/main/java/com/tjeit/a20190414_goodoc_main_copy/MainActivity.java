package com.tjeit.a20190414_goodoc_main_copy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputSearch;
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputSearch = findViewById(R.id.inputSearch);
        btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchInput = inputSearch.getText().toString();
                String toastMessage = String.format("[%s]을 검색합니다",searchInput);

                //Toast.makeText(MainActivity.this, searchInput, Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "[" + searchInput + "]을 검색합니다" , Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, toastMessage, Toast.LENGTH_SHORT).show();



            }
        });


    }
}
