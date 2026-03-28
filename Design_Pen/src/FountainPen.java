import strategies.writeStrategies.SmoothWriteBehaviour;

public class FountainPen extends Pen{

    public FountainPen(){
        super(PenType.FOUNTAIN, new SmoothWriteBehaviour());
    }

    @Override
    public void write() {

    }

    @Override
    public Colour getColour() {
        return null;
    }
}
