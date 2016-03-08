package less.alp.creativelesson;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String URL = "";
    private Button science_button;
    private Button experiment_button;
    private Button fun_button;
    private Button popular_button;

    private Button technology_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        science_button = (Button) findViewById(R.id.scienceButton);
        experiment_button = (Button) findViewById(R.id.experimentButton);
        fun_button = (Button) findViewById(R.id.funButton);
        popular_button = (Button) findViewById(R.id.popularButton);
        technology_button = (Button) findViewById(R.id.technologyButton);

        science_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(URL, "https://www.youtube.com/user/fizikisttv");
                startActivity(intent);
            }
        });
        experiment_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(URL, "https://www.youtube.com/user/CrazyRussianHacker");
                startActivity(intent);
            }
        });
        fun_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(URL, "https://www.youtube.com/channel/UCR4s1DE9J4DHzZYXMltSMAg");
                startActivity(intent);
            }
        });
        popular_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(URL, "https://www.youtube.com/channel/UCF0pVplsI8R5kcAqgtoRqoA");
                startActivity(intent);
            }
        });
        technology_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(URL, "https://www.youtube.com/user/teknoseyir");
                startActivity(intent);
            }
        });
    }
}
