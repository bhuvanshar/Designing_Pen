import strategies.writeStrategies.SmoothWriteBehaviour;

public class Marker extends Pen{

    public Marker(){
        super(PenType.MARKER, new SmoothWriteBehaviour());
    }

    @Override
    public void write() {

    }

    @Override
    public Colour getColour() {
        return null;
    }
}
