# simpleDatePicker
Simple Date Picker

### Step 1. Add it in your root build.gradle at the end of repositories:

```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### Step 2. Add the dependency

```gradle
	dependencies {
	        implementation 'com.github.congfandi:simpleDatePicker:Dateicker'
	}
```
### Step 3. Call Class

```java 
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
```

