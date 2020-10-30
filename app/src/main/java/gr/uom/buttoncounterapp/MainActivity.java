package gr.uom.buttoncounterapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TEXT_CONTENTS = "MainActivity_textView";
    private static  int clickCounter = 0;
    private static final String LOG_TAG = "TestLog";

    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(LOG_TAG, "onCreate");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCounter++;
                String result = "\nButton clicked " + clickCounter + "times";

                textView.append(result);
            }
        };

        button.setOnClickListener(listener);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(LOG_TAG, "onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(LOG_TAG, "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(LOG_TAG, "onDestroy");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(LOG_TAG, "onPause");

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(LOG_TAG, "onRestart");

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(LOG_TAG, "onResume");

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d(LOG_TAG, "onSaveInstanceState");

        outState.putString(TEXT_CONTENTS, textView.getText().toString());

        super.onSaveInstanceState(outState);


    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(LOG_TAG, "onRestoreInstanceState");

        String savedText = savedInstanceState.getString(TEXT_CONTENTS);
        textView.setText(savedText);
    }


}