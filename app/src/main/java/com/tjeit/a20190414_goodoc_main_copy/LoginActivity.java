package com.tjeit.a20190414_goodoc_main_copy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
//      ID : tjeit , PW : qwer1234 가 입력된 상태로
//      로그인 버튼을 누르면 => 메인액티비티로 이동.
//      아이디나 비번이 위의 값이 아니라면, 토스트로 "로그인에 실패 했습니다. ID/PW를 확인해주세요"
    EditText inputIdEditText;
    EditText inpuPwEditText;
    Button btnLonin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputIdEditText = findViewById(R.id.inputIdEditText);
        inpuPwEditText = findViewById(R.id.inpuPwEditText);
        btnLonin = findViewById(R.id.btnLonin);

        btnLonin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
