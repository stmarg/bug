import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import tsinn.ui.SimpleApp;

public class BugApp extends SimpleApp
{
	Bug b;

	@Override
	public void updateAnimation(long arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(GraphicsContext gc)
	{
		// TODO Auto-generated method stub
		b.draw(gc);
		
	}

	@Override
	public void setupApp(GraphicsContext arg0)
	{
		b = new Bug(getWidth()/2, getHeight()/2, 100);
		
	}
	
	public static void main (String[] args)
	{
		launch();
	}
	
	@Override
	public void onMouseMove(MouseEvent me)
	{
		b.moveTowards(me.getX(),me.getY());
	}
	
}