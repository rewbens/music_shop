public class Guitar extends Instrument{

    private String manufacturer;

    public Guitar(String name, double purchasePrice, double priceSold, InstrumentType instrumentType, String manufacturer) {
        super(name, purchasePrice, priceSold, instrumentType);

        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
