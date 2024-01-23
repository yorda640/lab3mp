import java.io.IOException;

public class ShippingCalculator {
    public static double getDouble() throws IOException {
        // Implement your method to read double values from keyboard input
        // For example, using BufferedReader or Scanner
        return 0.0;
    }

    public static void main(String[] args) throws IOException {
        ShippingCarrier[] carriers = {new UPS(), new USMail(), new FedEx()};

        Package[] packages = {
                new Package("Book", 2, "IA"),
                new Package("Phone", 4, "MA"),
                new Package("Boots", 6, "NY")
        };

        for (Package pkg : packages) {
            double lowestCost = Double.MAX_VALUE;
            ShippingCarrier cheapestCarrier = null;

            for (ShippingCarrier carrier : carriers) {
                double cost = carrier.calculateCost(pkg.getWeight(), pkg.getZone());

                // Apply discounts for students and seniors
                // For simplicity, assuming everyone is a regular customer here
                double discount = 0.0;

                double totalCost = cost - (cost * discount);

                if (totalCost < lowestCost) {
                    lowestCost = totalCost;
                    cheapestCarrier = carrier;
                }
            }

            // Print the result
            System.out.println(pkg.getDescription() + "\t$" + String.format("%.2f", lowestCost) + "\t" + cheapestCarrier.getName());
        }
    }
}

