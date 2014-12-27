package com.wilis.spinner;
 
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
 
public class spinner extends Activity 
{
    String[] club = {
            "Barcelona",
            "Real Madrid",
            "Menchester United",
            "Chealse FC",
            "AC Milan",
            "Arsenal",
            "Inter Milan",
            "Tothem Hotspur",
            "Valencia",
            "Juventus",
            "Menchester City"
    };
 
    Spinner s1;
 
    @Override    
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);
 
        s1 = (Spinner) findViewById(R.id.spinner1);
 
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_dropdown_item, club);
 
        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(new OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> arg0, 
            View arg1, int arg2, long arg3) 
            {
                int index = s1.getSelectedItemPosition();
                Toast.makeText(getBaseContext(), 
                    "You have selected item : " + club[index], 
                    Toast.LENGTH_SHORT).show();                
            }
 
            public void onNothingSelected(AdapterView<?> arg0) {}
        });
    }
}