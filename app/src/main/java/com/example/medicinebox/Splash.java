package com.example.medicinebox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

public class Splash extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Handler hd = new Handler();
        hd.postDelayed(new splashhandler(), 3000);                              // 3초 후에 splashhandler 실행
    }


    private class splashhandler implements Runnable  {
        public void run() {
            startActivity(new Intent(getApplication(), LoginActivity.class));           // 로딩이 끝난 후 loginActivity로 이동
            Splash.this.finish();                                                       // 로딩페이지를 activity stack에서 제거
        }
    }

    @Override
    public void onBackPressed() {
        // 초반 플래시 화면에서 넘어갈때 뒤로가기 버튼 못누르게함
    }
}