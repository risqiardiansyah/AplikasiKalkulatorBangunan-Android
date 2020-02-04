package com.hitung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class FormBata extends Activity {
	EditText pjg,lbr,tgi,hrg;
	RadioButton bata,batako,hebel;
	int panjang,lebar,tinggi,harga;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hitung_bata);
        
        pjg = (EditText) findViewById(R.id.EditTextPanjang);
        lbr = (EditText) findViewById(R.id.EditTextLebar);
        tgi = (EditText) findViewById(R.id.EditTextTinggi);
        hrg = (EditText) findViewById(R.id.EditTextHarga);
        
        bata = (RadioButton) findViewById(R.id.rbBata);
        batako = (RadioButton) findViewById(R.id.rbBatako);
        hebel = (RadioButton) findViewById(R.id.rbHebel);
        
        final Button button1 = (Button) findViewById(R.id.buttonHitung);  
        button1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				hitungData();
			}
		});
    }
	
	public void hitungData() {
		panjang = Integer.parseInt(pjg.getText().toString());
		lebar = Integer.parseInt(lbr.getText().toString());
		tinggi = Integer.parseInt(tgi.getText().toString());
		harga = Integer.parseInt(hrg.getText().toString());
		
		if (bata.isChecked()) {
			String panjang_bata = "19";
//			String lebar_bata = "2";
			String tinggi_bata = "9";
//			int luas_bata = Integer.parseInt(panjang_bata) * Integer.parseInt(lebar_bata);
			int luas_bangunan = 2 * (panjang + lebar);
			int jml_bata_putar = luas_bangunan / Integer.parseInt(panjang_bata);
			int jml_bata_tinggi = tinggi / Integer.parseInt(tinggi_bata);
			int jumlah = jml_bata_putar + (jml_bata_tinggi * 4);
			int jml_harga = jumlah * harga;
			
			Intent itn = new Intent(this, Hasil.class);
			FormBata.this.finish();
			itn.putExtra("harga", jml_harga);
			itn.putExtra("jumlah", jumlah);
			startActivity(itn);
		}else if (batako.isChecked()) {
			String panjang_bata = "36";
//			String lebar_bata = "5";
			String tinggi_bata = "8";
//			int luas_bata = Integer.parseInt(panjang_bata) * Integer.parseInt(lebar_bata);
			int luas_bangunan = 2 * (panjang + lebar);
			int jml_bata_putar = luas_bangunan / Integer.parseInt(panjang_bata);
			int jml_bata_tinggi = tinggi / Integer.parseInt(tinggi_bata);
			int jumlah = jml_bata_putar + (jml_bata_tinggi * 4);
			int jml_harga = jumlah * harga;
			
			Intent itn = new Intent(this, Hasil.class);
			itn.putExtra("harga", jml_harga);
			itn.putExtra("jumlah", jumlah);
			startActivity(itn);
		}else if (hebel.isChecked()) {
			String panjang_bata = "60";
//			String lebar_bata = "5";
			String tinggi_bata = "20";
//			int luas_bata = Integer.parseInt(panjang_bata) * Integer.parseInt(lebar_bata);
			int luas_bangunan = 2 * (panjang + lebar);
			int jml_bata_putar = luas_bangunan / Integer.parseInt(panjang_bata);
			int jml_bata_tinggi = tinggi / Integer.parseInt(tinggi_bata);
			int jumlah = jml_bata_putar + (jml_bata_tinggi * 4);
			int jml_harga = jumlah * harga;
			
			Intent itn = new Intent(this, Hasil.class);
			itn.putExtra("harga", jml_harga);
			itn.putExtra("jumlah", jumlah);
			startActivity(itn);
		}else if (pjg.getText().toString() == "" &&
				lbr.getText().toString() == "" &&
				tgi.getText().toString() == "" &&
				hrg.getText().toString() == "") 
		{
			Toast.makeText(getApplicationContext(), "Isi Semua Form !!!", Toast.LENGTH_LONG).show();
		}else if(bata.isChecked() == false){
			Toast.makeText(this, "Isi RadioBox !!!", Toast.LENGTH_LONG).show();
		}else if(hebel.isChecked() == false){
			Toast.makeText(this, "Isi RadioBox !!!", Toast.LENGTH_LONG).show();
		}else if(batako.isChecked() == false){
			Toast.makeText(this, "Isi RadioBox !!!", Toast.LENGTH_LONG).show();
		}
	}
}
