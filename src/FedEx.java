class FedEx implements ShippingCarrier {
    @Override
    public String getName() {
        return "FedEx";
    }

    @Override
    public double calculateCost(double weight, String zone) {
        double zoneMultiplier = 0.0;
        switch (zone) {
            case "IA", "MT", "OR", "CA" -> zoneMultiplier = 0.35;
            case "TX", "UT" -> zoneMultiplier = 0.30;
            case "FL", "MA", "OH" -> zoneMultiplier = 0.55;
            default -> zoneMultiplier = 0.43;
        }
        return zoneMultiplier * weight;
    }
}
