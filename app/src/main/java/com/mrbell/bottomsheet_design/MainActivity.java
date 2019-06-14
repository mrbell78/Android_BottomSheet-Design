package com.mrbell.bottomsheet_design;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton shareimg;
    private LinearLayout bottomsheet;
    private BottomSheetBehavior bottomSheetBehavior;
    private int stateChanged=0;
    private TextView downarrow;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shareimg=findViewById(R.id.shareimgbutton);
        bottomsheet=findViewById(R.id.Bottomsheet);
        bottomSheetBehavior=BottomSheetBehavior.from(bottomsheet);
        downarrow=findViewById(R.id.arrowcontrol);
        //state hidden

        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);

        //state Collapsed

        //bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

        //state expand
        //bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

        shareimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                downarrow.setCompoundDrawablesWithIntrinsicBounds(R.drawable.downarrow, 0, 0, 0);
            }
        });

        downarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
                downarrow.setBackgroundResource(0);
            }
        });

    }
}
