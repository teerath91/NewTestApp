package nn.vv.ss.newtestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    final int rounds = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.startExerciser();
    }

    private void startExerciser() {


        Exerciser exerciser = new TestExerciser(this);

        for(int i=0; i<this.rounds; i++) {
            exerciser.exercise();
        }

    }

}

