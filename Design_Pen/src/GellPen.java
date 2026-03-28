import strategies.writeStrategies.SmoothWriteBehaviour;
import strategies.writeStrategies.WriteBehaviour;

public class GellPen extends Pen implements RefillPen{

    private Refill refill;
    private boolean canChangeRefill = false;

    private GellPen(WriteBehaviour writeBehaviour){
        super(PenType.GELL, writeBehaviour);
    }

    public static class Builder{
        private Refill refill;
        private boolean canChangeRefill = false;

        public Builder setRefill(Refill refill){
            this.refill = refill;
            return this;
        }

        public Builder setCanChangeRefill(boolean value){
            this.canChangeRefill = value;
            return this;
        }

        public GellPen build(){
            GellPen gellPen = new GellPen(new SmoothWriteBehaviour());
            gellPen.refill = this.refill;
            gellPen.canChangeRefill = this.canChangeRefill;
            return gellPen;
        }
    }

    @Override
    public void write() {

    }

    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public Refill getRefill() {
        return this.refill;
    }

    @Override
    public boolean canChangeRefill() {
        return this.canChangeRefill;
    }

    @Override
    public void changeRefill(Refill newRefill) {

    }
}
