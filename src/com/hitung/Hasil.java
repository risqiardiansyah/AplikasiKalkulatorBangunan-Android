package com.hitung;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Hasil extends Activity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil);
	
        TextView jml = (TextView) findViewById(R.id.textViewjml);
        TextView by = (TextView) findViewById(R.id.TextViewBiaya);
        
        Bundle extras = getIntent().getExtras();
        Integer jumlah = extras.getInt("jumlah");
        Integer biaya = extras.getInt("harga");
        
        jml.setText("+- "+jumlah.toString());
        by.setText("+- "+biaya.toString());
	}
}
