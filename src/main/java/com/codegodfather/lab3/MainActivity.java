package com.codegodfather.lab3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }
    public GridView gridView;
    public String[] item = new String[82];
    public Button sort;
    public Button a;
    public Button b;
    public Button c;
    public Button d;
    public Button e;
    public Button f;
    public Button g;
    public Button h;
    public Button I;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        for(int i =1;i<=81;i++)
        {
            item[i] = Integer.toString(i);
        }
        setContentView(R.layout.activity_main);
        gridView= (GridView) findViewById(R.id.grid);
        final CustomGridAdopter gridAdopter = new CustomGridAdopter(MainActivity.this,item);
        gridView.setAdapter(gridAdopter);
        sort = (Button) findViewById(R.id.Sort);
        a= (Button) findViewById(R.id.A);
        b= (Button) findViewById(R.id.B);
        c= (Button) findViewById(R.id.C);
        d= (Button) findViewById(R.id.D);
        e= (Button) findViewById(R.id.E);
        f= (Button) findViewById(R.id.F);
        g= (Button) findViewById(R.id.G);
        h= (Button) findViewById(R.id.H);
        I= (Button) findViewById(R.id.I);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(final AdapterView<?> adapterView, View view, final int i, long l)
            {

                View.OnClickListener aListener = new View.OnClickListener()
                {
                @Override
                public void onClick(View view) {
                    item[i+1]= (String) a.getText();
                    gridView.setAdapter(gridAdopter);
                    }
                };
                a.setOnClickListener(aListener);
                View.OnClickListener bListener = new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        item[i+1]= (String) b.getText();
                        gridView.setAdapter(gridAdopter);
                    }
                };
                b.setOnClickListener(bListener);
                View.OnClickListener cListener = new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        item[i+1]= (String) c.getText();
                        gridView.setAdapter(gridAdopter);
                    }
                };
                c.setOnClickListener(cListener);
                View.OnClickListener dListener = new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        item[i+1]= (String) d.getText();
                        gridView.setAdapter(gridAdopter);
                    }
                };
                d.setOnClickListener(dListener);
                View.OnClickListener eListener = new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        item[i+1]= (String) e.getText();
                        gridView.setAdapter(gridAdopter);
                    }
                };
                e.setOnClickListener(eListener);
                View.OnClickListener fListener = new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        item[i+1]= (String) f.getText();
                        gridView.setAdapter(gridAdopter);
                    }
                };
                f.setOnClickListener(fListener);
                View.OnClickListener gListener = new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        item[i+1]= (String) g.getText();
                        gridView.setAdapter(gridAdopter);
                    }
                };
                g.setOnClickListener(gListener);
                View.OnClickListener hListener = new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        item[i+1]= (String) h.getText();
                        gridView.setAdapter(gridAdopter);
                    }
                };
                h.setOnClickListener(hListener);
                View.OnClickListener iListener = new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view) {
                        item[i+1]= (String) I.getText();
                        gridView.setAdapter(gridAdopter);
                    }
                };
                I.setOnClickListener(iListener);
                View.OnClickListener sortListener = new View.OnClickListener()
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Assigning random alphabets to numbers for sorting";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(context, text, duration);

                    Random random = new Random();
                    @Override
                    public void onClick(View view) {
                        toast.show();

                        String[] alphabets = {"A","B","C","D","E","F","G","H","I"};
                        for(int i= 0;i<=81;i++)
                        {
                          if (isInteger(item[i]))
                          {
                              int randomNumber = random.nextInt(9);
                            item[i]=alphabets[randomNumber];
                          }
                        }
                        for(int j =0 ;j<item.length;j++)
                        {
                            for(int k=1;k<item.length-j-1;k++)
                            {
                                String temp;
                                if(item[k+1].compareTo(item[k])<0)
                                {
                                    temp = item[k+1];
                                    item[k+1]= item[k];
                                    item[k]=temp;
                                }
                            }
                        }

                        gridView.setAdapter(gridAdopter);
                    }
                };
                sort.setOnClickListener(sortListener);
            }
        });

    }

}
