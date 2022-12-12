public class Piano extends Instrument{

    private String manufacturer;


    public Piano(String name, double purchasePrice, double priceSold, InstrumentType instrumentType, String manufacturer) {
        super(name, purchasePrice, priceSold, instrumentType);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
