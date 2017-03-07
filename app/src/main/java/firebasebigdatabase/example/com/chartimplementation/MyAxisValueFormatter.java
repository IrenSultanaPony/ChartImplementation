package firebasebigdatabase.example.com.chartimplementation;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

/**
 * Created by mitu on 10/13/16.
 */

class MyValueFormatter implements ValueFormatter {


    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
       return  "" + ((int) value);
    }
}
