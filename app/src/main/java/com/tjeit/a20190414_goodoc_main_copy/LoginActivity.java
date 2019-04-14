package com.tjeit.a20190414_goodoc_main_copy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
//                사용자가 입력한 아이디와 비번을 String 변수에 저장
                String userId = inputIdEditText.getText().toString();
                String userPw = inpuPwEditText.getText().toString();

//                두 변수에 들어있는 값이 원하는 값이 맞다면? 메인화면으로 이동
//                아니라면? 토스트로 에러메세지 발생

                if (userId.equals("tjeit") && userPw.equals("qwer1234")) {
//                    아이디와 비번이 모두 올바르다!
//                    MainActivity로 이동시켜주자!
//                    Toast.makeText(LoginActivity.this, "로그인 성공", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                } else {
//                    위에 조건이 아니라면!
                    Toast.makeText(LoginActivity.this, "로그인에 실패 했습니다. \n ID/PW를 확인해주세요", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
