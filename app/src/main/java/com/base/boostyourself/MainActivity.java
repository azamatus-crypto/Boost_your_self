package com.base.boostyourself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   private ImageView imageVieweconomy;
   private ImageView imageViewepsy;
   private ImageView imageViewcharizma;
   private ImageView imageViewrelation;
   private ImageView imageViewbody;
   private ImageView imageViewconfidence;
   private ImageView imageViewcomunicat;
   private ImageView imageViewpapers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewbody=findViewById(R.id.imageViewbody);
        imageVieweconomy=findViewById(R.id.imageVieweconomicks);
        imageViewepsy=findViewById(R.id.imageViewpsyhology);
        imageViewcharizma=findViewById(R.id.imageViewcharizm);
        imageViewrelation=findViewById(R.id.imageViewsex);
        imageViewconfidence=findViewById(R.id.imageViewconfidence);
        imageViewcomunicat=findViewById(R.id.imageViewcomunication);
        imageViewpapers=findViewById(R.id.imageViewpapers);
        imageViewpapers.setImageResource(R.drawable.financialstatus);
        imageVieweconomy.setImageResource(R.drawable.economicks);
        imageViewepsy.setImageResource(R.drawable.psyhology);
        imageViewcharizma.setImageResource(R.drawable.charisma);
        imageViewrelation.setImageResource(R.drawable.opositesex);
        imageViewconfidence.setImageResource(R.drawable.confidence);
        imageViewcomunicat.setImageResource(R.drawable.comunication);
        imageViewbody.setImageResource(R.drawable.boudy);


    }

    public void onCklickeconomicks(View view) {
        Intent intent=new Intent(this,EconomicActivityy.class);
        startActivity(intent);
    }

    public void onCklickpsyhology(View view) {
        Intent intentpsy=new Intent(this,PsyhologyActivity.class);
        startActivity(intentpsy);
    }

    public void onCklickcomunication(View view) {
        Intent intentcomunication=new Intent(this,Cominicationactivity.class);
        startActivity(intentcomunication);
    }

    public void onCklickconfidience(View view) {
        Intent intentconfidience=new Intent(this,ConfidienceActivity.class);
        startActivity(intentconfidience);
    }

    public void onCklickbody(View view) {
        Intent intentbody=new Intent(this,BodyActivity.class);
        startActivity(intentbody);
    }

    public void oncKlickrelations(View view) {
        Intent intentrelations=new Intent(this,Relationshipactivity.class);
        startActivity(intentrelations);
    }

    public void onCklickCharizma(View view) {
        Intent intentchariz=new Intent(this,CharismaActivity.class);
        startActivity(intentchariz);
    }

    public void onCklickFinancials(View view) {
        Intent intentfinan=new Intent(this,financialActivity.class);
        startActivity(intentfinan);
    }
}