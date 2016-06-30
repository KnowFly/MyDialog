package com.ie1e.mydialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ie1e.mdialog.view.ActionSheetDialog;
import com.ie1e.mdialog.view.AlertDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button btn_alertdialog = (Button) findViewById(R.id.btn_alertdialog);
        Button btn_sheetdialog = (Button) findViewById(R.id.btn_sheetdialog);
        btn_alertdialog.setOnClickListener(this);
        btn_sheetdialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_alertdialog:
                new AlertDialog(MainActivity.this)
                        .builder()
                        .setTitle("警告")
                        .setMsg("ss")
                        .show();
                break;
            case R.id.btn_sheetdialog:
                new ActionSheetDialog(MainActivity.this)
                        .builder()
                        .setTitle("这是一个标题")
                        .setCancelable(false)
                        .setCanceledOnTouchOutside(false)
                        .addSheetItem("条目一", ActionSheetDialog.SheetItemColor.Blue, new ActionSheetDialog.OnSheetItemClickListener() {
                            @Override
                            public void onClick(int which) {

                            }
                        })
                        .show();
                break;
        }
    }
}
