class Package {
    private String description;
    private double weight;
    private String zone;

    public Package(String description, double weight, String zone) {
        this.description = description;
        this.weight = weight;
        this.zone = zone;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    public String getZone() {
        return zone;
    }
}

