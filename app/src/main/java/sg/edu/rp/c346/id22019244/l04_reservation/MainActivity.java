package sg.edu.rp.c346.id22019244.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText phone;
    EditText size;
    TimePicker time;
    DatePicker date;
    Button dateDisplay;
    Button timeDisplay;
    RadioGroup smoke;
    RadioButton smoking;
    RadioButton nonSmoking;
    Button btnConfirm;
    Button btnReset;
    TextView displayArea;








    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameInput);
        phone = findViewById(R.id.mobileInput);
        size = findViewById(R.id.sizeInput);
        time = findViewById(R.id.timePicker);
        date = findViewById(R.id.datePicker);
        dateDisplay = findViewById(R.id.btnDate);
        timeDisplay = findViewById(R.id.btnTime);
        smoke =findViewById(R.id.smoke);
        smoking = findViewById(R.id.smoking);
        nonSmoking = findViewById(R.id.nonSmoking);
        btnConfirm = findViewById(R.id.btnConfirm);
        btnReset = findViewById(R.id.btnReset);
        displayArea = findViewById(R.id.displayArea);

        String display =name.toString() + phone.toString() + size.toString() + time.toString() + date.toString();

    dateDisplay.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            displayArea.setText("The date chosen is " + date.getDayOfMonth() +"/"+ (date.getMonth()+1) +"/"+ date.getYear());

        }
    });

    timeDisplay.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            displayArea.setText("The time chosen is " + time.getCurrentHour().toString() +":"+ time.getCurrentMinute().toString());
        }
    });

    btnConfirm.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        int checkedRadioId = smoke.getCheckedRadioButtonId();
        if (checkedRadioId == R.id.smoking) {
            Toast.makeText(MainActivity.this, display + smoking, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, display + nonSmoking, Toast.LENGTH_SHORT).show();
        }
        }
    });








    btnReset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            time.setCurrentHour(7);
            time.setCurrentMinute(30);

            date.updateDate(2023, 7, 1);

            smoking.isChecked();

        }
    });



    }
}