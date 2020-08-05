package com.nevimax.color;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    private Spinner spColors;
    private TextView tvDescriptionTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spColors = findViewById(R.id.sp_Colors);
        tvDescriptionTemp = findViewById(R.id.tv_DescriptionTemp);
    }

    public void onClickShowDescription(View view) {
        int position = spColors.getSelectedItemPosition();
        String description = getDescriptionByPosition(position);
        tvDescriptionTemp.setText(description);
    }

    private String getDescriptionByPosition(int position) {
        String[] descriptions = getResources().getStringArray(R.array.sp_description_of_temp);
        return descriptions[position];
    }
}
