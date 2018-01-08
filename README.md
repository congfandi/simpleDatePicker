# simpleDatePicker
Simple Date Picker

how to use<br>
1. implement DatePickerDialog.OnDateSetListener,<br>
2. overide methode  <br>@Override<br>
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {<br><br>
       
    }<br>
3.call class Picker<br>
full implementation like this

import com.congfandi.simpledatepicker.Picker;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Picker().show(getSupportFragmentManager(),null);

    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
       
    }
}

