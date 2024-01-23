class UPS implements ShippingCarrier {
    @Override
    public String getName() {
        return "UPS";
    }

    @Override
    public double calculateCost(double weight, String zone) {
        return 0.45 * weight;
    }
}
