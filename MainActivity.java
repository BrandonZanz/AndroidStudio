package bzanz2.pme;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private static final String KEY_TITLE1="20:00";
    private static final String KEY_TITLE2="20:01";
    private static final String KEY_TITLE3="20:02";
    private static final String KEY_TITLE4="20:03";
    private static final String KEY_TITLE5="20:04";
    private static final String KEY_TITLE6="20:05";
    private static final String KEY_TITLE7="20:06";
    private static final String KEY_TITLE8="20:07";
    private static final String KEY_TITLE9="20:08";
    private static final String KEY_TITLE10="20:09";
    private static final String KEY_TITLE11="20:10";
    private static final String KEY_TITLE12="20:11";
    private static final String KEY_TITLE13="20:12";
    private static final String KEY_TITLE14="20:13";
    private static final String KEY_TITLE15="20:14";
    private static final String KEY_TITLE16="20:15";
    private static final String KEY_TITLE17="20:16";
    private static final String KEY_TITLE18="20:17";
    private static final String KEY_TITLE19="20:18";
    private static final String KEY_TITLE20="20:19";
    private static final String KEY_TITLE21="20:20";
    private static final String KEY_TITLE22="20:21";
    private static final String KEY_TITLE23="20:22";
    private static final String KEY_TITLE24="20:23";
    private static final String KEY_TITLE25="20:24";
    private static final String KEY_TITLE26="20:25";
    private static final String KEY_TITLE27="20:26";
    private static final String KEY_TITLE28="20:27";
    private static final String KEY_TITLE29="20:28";
    private static final String KEY_TITLE30="20:29";





    private FirebaseFirestore db;

    private TextView hola;
    private EditText  fecha;
    private EditText input_ip;

    private int[]sale=new int[]{24,25,23,45};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db =FirebaseFirestore.getInstance();
        hola= findViewById(R.id.hol);
        input_ip = (EditText) findViewById(R.id.ip);
        fecha = (EditText) findViewById(R.id.fecha);





    }

public void next (final View view){

    startActivity(new Intent(MainActivity.this,grafico.class));
}

    public void button (final View view){

        db.collection(input_ip.getText().toString().trim()).document(fecha.getText().toString().trim())
                .get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {

                    public void onSuccess(DocumentSnapshot documentSnapshot) {


                        String data1 = documentSnapshot.getString(KEY_TITLE1);
                        String data2 = documentSnapshot.getString(KEY_TITLE2);
                        String data3 = documentSnapshot.getString(KEY_TITLE3);
                        String data4 = documentSnapshot.getString(KEY_TITLE4);
                        String data5 = documentSnapshot.getString(KEY_TITLE5);
                        String data6 = documentSnapshot.getString(KEY_TITLE6);
                        String data7 = documentSnapshot.getString(KEY_TITLE7);
                        String data8 = documentSnapshot.getString(KEY_TITLE8);
                        String data9 = documentSnapshot.getString(KEY_TITLE9);
                        String data10 = documentSnapshot.getString(KEY_TITLE10);
                        String data11= documentSnapshot.getString(KEY_TITLE11);
                        String data12 = documentSnapshot.getString(KEY_TITLE12);
                        String data13 = documentSnapshot.getString(KEY_TITLE13);
                        String data14 = documentSnapshot.getString(KEY_TITLE14);
                        String data15 = documentSnapshot.getString(KEY_TITLE15);
                        String data16 = documentSnapshot.getString(KEY_TITLE16);
                        String data17 = documentSnapshot.getString(KEY_TITLE17);
                        String data18 = documentSnapshot.getString(KEY_TITLE18);
                        String data19 = documentSnapshot.getString(KEY_TITLE19);
                        String data20 = documentSnapshot.getString(KEY_TITLE20);
                        String data21 = documentSnapshot.getString(KEY_TITLE21);
                        String data22 = documentSnapshot.getString(KEY_TITLE22);
                        String data23 = documentSnapshot.getString(KEY_TITLE23);
                        String data24 = documentSnapshot.getString(KEY_TITLE24);
                        String data25 = documentSnapshot.getString(KEY_TITLE25);
                        String data26 = documentSnapshot.getString(KEY_TITLE26);
                        String data27 = documentSnapshot.getString(KEY_TITLE27);
                        String data28 = documentSnapshot.getString(KEY_TITLE28);
                        String data29 = documentSnapshot.getString(KEY_TITLE29);
                        String data30 = documentSnapshot.getString(KEY_TITLE30);
                         hola.setText(data1);
                        /* int[]sale=new int[]{Integer.parseInt(data1),Integer.parseInt(data2),Integer.parseInt(data3),Integer.parseInt(data4),
                                 Integer.parseInt(data5), Integer.parseInt(data6), Integer.parseInt(data7),
                                 Integer.parseInt(data8), Integer.parseInt(data9),
                                 Integer.parseInt(data10), Integer.parseInt(data11), Integer.parseInt(data12),
                                 Integer.parseInt(data13), Integer.parseInt(data14)};*/
                        float x1 = Float.valueOf(data1.trim()).floatValue();
                        float x2 = Float.valueOf(data2.trim()).floatValue();
                        float x3 = Float.valueOf(data3.trim()).floatValue();
                        float x4 = Float.valueOf(data4.trim()).floatValue();
                        float x5 = Float.valueOf(data5.trim()).floatValue();
                        float x6 = Float.valueOf(data6.trim()).floatValue();
                        float x7 = Float.valueOf(data7.trim()).floatValue();
                        float x8 = Float.valueOf(data8.trim()).floatValue();
                        float x9 = Float.valueOf(data9.trim()).floatValue();
                        float x10 = Float.valueOf(data10.trim()).floatValue();
                        float x11 = Float.valueOf(data11.trim()).floatValue();
                        float x12 = Float.valueOf(data12.trim()).floatValue();
                        float x13 = Float.valueOf(data13.trim()).floatValue();
                        float x14 = Float.valueOf(data14.trim()).floatValue();
                        float x15 = Float.valueOf(data15.trim()).floatValue();
                        float x16 = Float.valueOf(data16.trim()).floatValue();
                        float x17 = Float.valueOf(data17.trim()).floatValue();
                        float x18 = Float.valueOf(data18.trim()).floatValue();
                        float x19 = Float.valueOf(data19.trim()).floatValue();
                     /* float x20 = Float.valueOf(data20.trim()).floatValue();
                        float x21 = Float.valueOf(data21.trim()).floatValue();
                        float x22 = Float.valueOf(data22.trim()).floatValue();
                        float x23 = Float.valueOf(data23.trim()).floatValue();
                        float x24 = Float.valueOf(data24.trim()).floatValue();
                        float x25 = Float.valueOf(data25.trim()).floatValue();
                        float x26 = Float.valueOf(data26.trim()).floatValue();
                        float x27 = Float.valueOf(data27.trim()).floatValue();
                        float x28 = Float.valueOf(data28.trim()).floatValue();
                        float x29 = Float.valueOf(data29.trim()).floatValue();
                        float x30 = Float.valueOf(data30.trim()).floatValue();*/
                        variables.a1=x1;
                        variables.a2=x2;
                        variables.a3=x3;
                        variables.a4=x4;
                        variables.a5=x5;
                        variables.a6=x6;
                        variables.a7=x7;
                        variables.a8=x8;
                        variables.a9=x9;
                        variables.a10=x10;
                        variables.a11=x11;
                        variables.a12=x12;
                        variables.a13=x13;
                        variables.a14=x14;
                        variables.a15=x15;
                        variables.a16=x16;
                        variables.a17=x17;
                        variables.a18=x18;
                        variables.a19=x19;
                       /* variables.a20=x20;

                        variables.a21=x21;
                        variables.a22=x22;
                        variables.a23=x23;
                        variables.a24=x24;
                        variables.a25=x25;
                        variables.a26=x26;
                        variables.a27=x27;
                        variables.a28=x28;
                        variables.a29=x29;
                        variables.a30=x30;*/
                        Toast.makeText(MainActivity.this, data14, Toast.LENGTH_SHORT).show();





                    }
                });

    }




}
