package firebasebigdatabase.example.com.chartimplementation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.BubbleChart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.data.BubbleDataSet;
import com.github.mikephil.charting.data.BubbleEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BarChart barChart = (BarChart) findViewById(R.id.barchart);
        PieChart pieChart = (PieChart) findViewById(R.id.piechart);
        LineChart lineChart = (LineChart) findViewById(R.id.linechart);
        BubbleChart bubbleChart = (BubbleChart) findViewById(R.id.bubblechart);

        // HorizontalBarChart barChart= (HorizontalBarChart) findViewById(R.id.chart);

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(4f, 0));
        barEntries.add(new BarEntry(8f, 1));
        barEntries.add(new BarEntry(6f, 2));
        barEntries.add(new BarEntry(12f, 3));
        barEntries.add(new BarEntry(18f, 4));
        barEntries.add(new BarEntry(9f, 5));

        BarDataSet barDataSet = new BarDataSet(barEntries, "# of Calls");

        ArrayList<String> barlabels = new ArrayList<String>();
        barlabels.add("January");
        barlabels.add("February");
        barlabels.add("March");
        barlabels.add("April");
        barlabels.add("May");
        barlabels.add("June");

        BarData bardata = new BarData(barlabels, barDataSet);
        // barDataSet.setColors(ColorTemplate.COLORFUL_COLORS); //
        barChart.setData(bardata);
        barChart.animateY(5000);



        ArrayList<Entry> pieentries = new ArrayList<>();
        pieentries.add(new Entry(4f, 0));
        pieentries.add(new Entry(8f, 1));
        pieentries.add(new Entry(6f, 2));
        pieentries.add(new Entry(12f, 3));
        pieentries.add(new Entry(18f, 4));
        pieentries.add(new Entry(9f, 5));

        PieDataSet piedataset = new PieDataSet(pieentries, "# of Calls");

        ArrayList<String> pielabels = new ArrayList<String>();
        pielabels.add("January");
        pielabels.add("February");
        pielabels.add("March");
        pielabels.add("April");
        pielabels.add("May");
        pielabels.add("June");

        PieData piedata = new PieData(pielabels, piedataset);
        piedataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        pieChart.setDescription("Description");
        pieChart.setData(piedata);

        pieChart.animateY(5000);

        pieChart.saveToGallery("/sd/mychart.jpg", 85); // 85 is the quality of the image


        LineDataSet linedataset = new LineDataSet(pieentries, "# of Calls");
        LineData linedata = new LineData(pielabels, linedataset);
        linedataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        linedataset.setDrawCubic(true);
        linedataset.setDrawFilled(true);

        lineChart.setData(linedata);
        lineChart.animateY(5000);


        ArrayList<BubbleEntry> bubbleentries = new ArrayList<>();
        bubbleentries.add(new BubbleEntry(1,50f,5f));
        bubbleentries.add(new BubbleEntry(2,10f, 5f));
        bubbleentries.add(new BubbleEntry(3,30f ,1f));
        bubbleentries.add(new BubbleEntry(4,20f, 2f));
        bubbleentries.add(new BubbleEntry(5,15f, 4f));
        // bubbleentries.add(new BubbleEntry(6,9f, 5f));

        BubbleDataSet bubbleDataSet = new BubbleDataSet(bubbleentries, "# of Calls");

        BubbleData bubbleData = new BubbleData(pielabels, bubbleDataSet);
        bubbleDataSet.setColors(ColorTemplate.COLORFUL_COLORS); //
        bubbleChart.setData(bubbleData);
        bubbleChart.animateY(5000);


    }

}
