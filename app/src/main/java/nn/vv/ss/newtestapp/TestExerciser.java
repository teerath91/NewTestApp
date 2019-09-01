package nn.vv.ss.newtestapp;

import android.content.Context;
import android.graphics.Canvas;

public class TestExerciser implements Exerciser {

    Canvas c;
    Context context;

    TestExerciser(Context context) {
        this.context = context;
        this.c = c;
    }

    @Override
    public void exercise() {


        TestView testview = new TestView(context);
        testview.onDraw(c);

        //TestView.invalidate();

        //activity.setContentView(new TestView(activity));

    }
}
