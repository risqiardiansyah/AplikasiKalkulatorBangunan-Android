package com.hitung;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HitungBahanBangunanActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button button1 = (Button) findViewById(R.id.buttonBata);  
        button1.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent itn = new Intent(arg0.getContext(), FormBata.class);
				startActivityForResult(itn, 0);
			}
		});
        
        final Button button2 = (Button) findViewById(R.id.buttonPlavon);  
        button2.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent itn = new Intent(arg0.getContext(), FormPlavon.class);
				startActivityForResult(itn, 0);
			}
		});
        
        final Button button3 = (Button) findViewById(R.id.buttonGenteng);  
        button3.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Fitur Akan Segera Hadir.", Toast.LENGTH_LONG).show();
			}
		});
        
        final Button button4 = (Button) findViewById(R.id.buttonUbin);  
        button4.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent itn = new Intent(arg0.getContext(), FormUbin.class);
				startActivityForResult(itn, 0);
			}
		});
        
        final Button button5 = (Button) findViewById(R.id.buttonSemua);  
        button5.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Fitur Akan Segera Hadir.", Toast.LENGTH_LONG).show();
			}
		});
        
        final Button buttonC = (Button) findViewById(R.id.ButtonClose);  
        buttonC.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				alert();
			}
		});
    }
    
    public void alert() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Keluar");
		builder.setMessage("Kamu Yakin Ingin Keluar???");
		
		builder.setPositiveButton("Yakin", new DialogInterface.OnClickListener() {
		
		    public void onClick(DialogInterface dialog, int which) {
		    	HitungBahanBangunanActivity.this.finish();
		        System.exit(0);
		    }
		});
		
		builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
		
		    public void onClick(DialogInterface dialog, int which) {
		        dialog.dismiss();
		    }
		});
		
		AlertDialog alert = builder.create();
		alert.show();
	}
    
    public void onBackPressed() {
    	alert();
	}
}