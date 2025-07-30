package prajwal.sonawane.maddaythree;

import static prajwal.sonawane.maddaythree.R.raw.sasa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_test;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_test=findViewById(R.id.button);

        mediaPlayer=MediaPlayer.create(MainActivity.this, sasa);

        button_test.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mediaPlayer.start();
                return false;
            }
        });
    }
}