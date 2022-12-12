public abstract class Instrument extends Item{

    private InstrumentType instrumentType;

    public Instrument(String name, double purchasePrice, double priceSold, InstrumentType instrumentType) {
        super(name, purchasePrice, priceSold);
        this.instrumentType = instrumentType;

    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
