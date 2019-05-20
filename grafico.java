package bzanz2.pme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

public class grafico extends AppCompatActivity {


    private LineChart lineChart;
    private LineDataSet lineDataSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafico);


        lineChart = (LineChart)findViewById(R.id.bar2);

// Creamos un set de datos
        ArrayList<Entry> lineEntries = new ArrayList<Entry>();
        lineEntries.add(new Entry( 1, variables.a2));
        lineEntries.add(new Entry( 2, variables.a3));
        lineEntries.add(new Entry( 3, variables.a4));
        lineEntries.add(new Entry( 4, variables.a5));
        lineEntries.add(new Entry( 5, variables.a6));
        lineEntries.add(new Entry( 6, variables.a7));
        lineEntries.add(new Entry( 7, variables.a8));
        lineEntries.add(new Entry( 8, variables.a9));
        lineEntries.add(new Entry( 9, variables.a10));

        lineEntries.add(new Entry( 10, variables.a11));
        lineEntries.add(new Entry( 11, variables.a12));
        lineEntries.add(new Entry( 12, variables.a13));
        lineEntries.add(new Entry( 13, variables.a14));
        lineEntries.add(new Entry( 14, variables.a15));
        lineEntries.add(new Entry( 15, variables.a16));
        lineEntries.add(new Entry( 16, variables.a17));
        lineEntries.add(new Entry( 17, variables.a18));
        lineEntries.add(new Entry( 18, variables.a19));
        /*lineEntries.add(new Entry( 19, variables.a20));

        lineEntries.add(new Entry( 20, variables.a21));
        lineEntries.add(new Entry( 21, variables.a22));
        lineEntries.add(new Entry( 22, variables.a23));
        lineEntries.add(new Entry( 23, variables.a24));
        lineEntries.add(new Entry( 24, variables.a25));
        lineEntries.add(new Entry( 25, variables.a26));
        lineEntries.add(new Entry( 26, variables.a27));
        lineEntries.add(new Entry( 27, variables.a28));
        lineEntries.add(new Entry( 28, variables.a29));
        lineEntries.add(new Entry( 29, variables.a30));*/

        for (int i = 0; i<30; i++){
            float y = (int) (Math.random() * 20000) + 1;
        }

// Unimos los datos al data set
        lineDataSet = new LineDataSet(lineEntries, "Prueba");

// Asociamos al gráfico
        LineData lineData = new LineData();
        lineData.addDataSet(lineDataSet);
        lineChart.setData(lineData);
    }
}
