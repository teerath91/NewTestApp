package nn.vv.ss.newtestapp;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class TestView extends View
{
    Paint paint = null;
    public TestView(Context context)
    {
        super(context);

    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int x = getWidth();
        int y = getHeight();
        int radius;
        radius = 100;
        Paint p = new Paint();
    }
}

