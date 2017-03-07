package firebasebigdatabase.example.com.chartimplementation;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Calendar;

import static android.R.attr.shadowColor;


public class MainActivity extends AppCompatActivity {
    private String[] months=new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
    private  String[] days=new String[]{"Saturday","Sunday","Monday","Tuesday","WednesDay","Thrusday","Friday"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        BarChart barChart = (BarChart) findViewById(R.id.barchart);
////        PieChart pieChart = (PieChart) findViewById(R.id.piechart);
//        LineChart lineChart = (LineChart) findViewById(R.id.linechart);
        CombinedChart combinedChart = (CombinedChart) findViewById(R.id.chart);
        CombinedData data = new CombinedData(months);
                data.setData(barData());
                data.setData(lineData());
                combinedChart.setData(data);
//        BubbleChart bubbleChart = (BubbleChart) findViewById(R.id.bubblechart);

        // HorizontalBarChart barChart= (HorizontalBarChart) findViewById(R.id.chart);
//
//        ArrayList<BarEntry> barEntries = new ArrayList<>();
//        barEntries.add(new BarEntry(4, 0));
//        barEntries.add(new BarEntry(8, 1));
//        barEntries.add(new BarEntry(6, 2));
//        barEntries.add(new BarEntry(12, 3));
//        barEntries.add(new BarEntry(18, 4));
//        barEntries.add(new BarEntry(9, 5));
//
//        BarDataSet barDataSet = new BarDataSet(barEntries, "Order Process This Month");
//
//        ArrayList<String> barlabels = new ArrayList<String>();
//        barlabels.add("1st");
//        barlabels.add("2nd");
//        barlabels.add("3rd");
//        barlabels.add("4rth");
//        barlabels.add("5th");
//        barlabels.add("6th");
//
//        BarData bardata = new BarData(barlabels, barDataSet);
//        // barDataSet.setColors(ColorTemplate.COLORFUL_COLORS); //
//        barChart.setData(bardata);
//        barChart.animateY(5000);



//        ArrayList<Entry> pieentries = new ArrayList<>();
//        pieentries.add(new Entry(4f, 0));
//        pieentries.add(new Entry(8f, 1));
//        pieentries.add(new Entry(6f, 2));
//        pieentries.add(new Entry(12f, 3));
//        pieentries.add(new Entry(18f, 4));
//        pieentries.add(new Entry(9f, 5));
//
//        PieDataSet piedataset = new PieDataSet(pieentries, "# of Calls");

//        ArrayList<String> pielabels = new ArrayList<String>();
//        pielabels.add("January");
//        pielabels.add("February");
//        pielabels.add("March");
//        pielabels.add("April");
//        pielabels.add("May");
//        pielabels.add("June");
//
//        PieData piedata = new PieData(pielabels, piedataset);
//        piedataset.setColors(ColorTemplate.COLORFUL_COLORS); //
//        pieChart.setDescription("Description");
//        pieChart.setData(piedata);
//
//        pieChart.animateY(5000);
//
//        pieChart.saveToGallery("/sd/mychart.jpg", 85); // 85 is the quality of the image


//        LineDataSet linedataset = new LineDataSet(pieentries, "# of Calls");
//        LineData linedata = new LineData(months, linedataset);
//        linedataset.setColors(ColorTemplate.COLORFUL_COLORS); //
//        linedataset.setDrawCubic(true);
//        linedataset.setDrawFilled(true);
//
//        lineChart.setData(linedata);
//        lineChart.animateY(5000);


//        ArrayList<BubbleEntry> bubbleentries = new ArrayList<>();
//        bubbleentries.add(new BubbleEntry(1,50f,5f));
//        bubbleentries.add(new BubbleEntry(2,10f, 5f));
//        bubbleentries.add(new BubbleEntry(3,30f ,1f));
//        bubbleentries.add(new BubbleEntry(4,20f, 2f));
//        bubbleentries.add(new BubbleEntry(5,15f, 4f));
//        // bubbleentries.add(new BubbleEntry(6,9f, 5f));
//
//        BubbleDataSet bubbleDataSet = new BubbleDataSet(bubbleentries, "# of Calls");
//
//        BubbleData bubbleData = new BubbleData(pielabels, bubbleDataSet);
//        bubbleDataSet.setColors(ColorTemplate.COLORFUL_COLORS); //
//        bubbleChart.setData(bubbleData);
//        bubbleChart.animateY(5000);




    }
    private BarData barData(){

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(4, 0));
        barEntries.add(new BarEntry(8, 3));
        barEntries.add(new BarEntry(6, 6));
        barEntries.add(new BarEntry(12, 9));
        barEntries.add(new BarEntry(18, 12));
        barEntries.add(new BarEntry(9, 15));

        BarDataSet barDataSet = new BarDataSet(barEntries, "Order Process This Month");

        ArrayList<String> barlabels = new ArrayList<String>();
        barlabels.add("1st");
        barlabels.add("2nd");
        barlabels.add("3rd");
        barlabels.add("4rth");
        barlabels.add("5th");
        barlabels.add("6th");

        BarData bardata = new BarData(months, barDataSet);
        // barDataSet.setColors(ColorTemplate.COLORFUL_COLORS); //
//        barDataSet.setData(bardata);
//        barChart.animateY(5000);
        barDataSet.setBarShadowColor(shadowColor);
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        return bardata;
    }
    private LineData lineData(){
        ArrayList<Entry> pieentries = new ArrayList<>();
        pieentries.add(new Entry(2f, 0));
        pieentries.add(new Entry(4f, 3));
        pieentries.add(new Entry(2f, 6));
        pieentries.add(new Entry(10f, 9));
        pieentries.add(new Entry(18f, 12));
        pieentries.add(new Entry(9f, 15));

        LineDataSet linedataset = new LineDataSet(pieentries, "# of Calls");
        LineData linedata = new LineData(months, linedataset);
        linedataset.setColors(ColorTemplate.COLORFUL_COLORS); //
        linedataset.setDrawCubic(true);
        linedataset.setDrawFilled(true);

//        lineChart.setData(linedata);
//        lineChart.animateY(5000);
        linedataset.setColors(ColorTemplate.COLORFUL_COLORS);
    return  linedata;
    }
    public static class DatePicker extends android.support.v4.app.DialogFragment implements DatePickerDialog.OnDateSetListener{
        private String mDateFormat;

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {

            Calendar calendar=Calendar.getInstance();
            int year=calendar.get(Calendar.YEAR);
            int month=calendar.get(Calendar.MONTH);
            int date=calendar.get(Calendar.DAY_OF_MONTH);
            return new DatePickerDialog(getActivity(),this,year,month,date);
        }

        //The listener used to indicate the user has finished selecting a date.
        //DatePicker , the picker associated with the dialog
        //year, month,day selected year, month, and day
        @Override
        public void onDateSet(android.widget.DatePicker datePicker, int year, int month, int date) {
            mDateFormat = "" + date + "/" + month+ "/" + year + "";

        }
    }
    public interface OnFragmentInteractionListener {

        void onFragmentInteraction(Uri uri);
    }
    }


