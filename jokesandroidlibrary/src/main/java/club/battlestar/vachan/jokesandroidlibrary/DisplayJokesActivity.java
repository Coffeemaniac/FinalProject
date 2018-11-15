package club.battlestar.vachan.jokesandroidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokesActivity extends AppCompatActivity {

    private TextView jokesTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_jokes);

        jokesTv = findViewById(R.id.jokesTv);

        Intent intent = getIntent();
        String jokesOutput = intent.getStringExtra("JOKES_KEY");
        jokesTv.setText(jokesOutput);
    }
}
