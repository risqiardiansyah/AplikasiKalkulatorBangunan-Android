package com.hitung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormUbin extends Activity {
	EditText pjg_b,lbr_b,pjg_u,lbr_u,hrg;
	int panjang_b,lebar_b,panjang_u,lebar_u,harga, luas_b, luas_u, hasil, hasil_harga;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hitung_ubin);
        
        pjg_b = (EditText) findViewById(R.id.EditTextPanjang);
        lbr_b = (EditText) findViewById(R.id.EditTextLebar);
        pjg_u = (EditText) findViewById(R.id.EditTextPanjangUbin);
        lbr_u = (EditText) findViewById(R.id.EditTextLebarUbin);
        hrg	  = (EditText) findViewById(R.id.EditTextHarga);
        final Button button1 = (Button) findViewById(R.id.buttonHitung);  
        button1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				hitungData();
			}
		});
	}
	
	public void hitungData() {
		panjang_b = Integer.parseInt(pjg_b.getText().toString());
		lebar_b = Integer.parseInt(lbr_b.getText().toString());
		panjang_u = Integer.parseInt(pjg_u.getText().toString());
		lebar_u = Integer.parseInt(lbr_u.getText().toString());
		harga = Integer.parseInt(hrg.getText().toString());
		
		if (pjg_b.getText().toString() != "" &&
			lbr_b.getText().toString() != "" &&
			pjg_u.getText().toString() != "" &&
			lbr_u.getText().toString() != "" &&
			hrg.getText().toString() != "")
		{
			luas_b = panjang_b * lebar_b;
			luas_u = panjang_u * lebar_u;
			hasil = luas_b / luas_u;
			
			hasil_harga = harga * hasil;
			Intent itn = new Intent(this, Hasil.class);
			FormUbin.this.finish();
			itn.putExtra("harga", hasil_harga);
			itn.putExtra("jumlah", hasil);
			startActivity(itn);
		} else {
			Toast.makeText(this, "Isi Semua Form !!!", Toast.LENGTH_LONG).show();
		}
	}
}
