public class Nomor2{
    public static void main(String[] args){
        import java.util.Scanner;

        String driver;
        double omzetBeliau = 0.0, omzetMereka = 0.0, omzetKita = 0.0;
        int totalTripBeliau = 0, totalTripMereka = 0, totalTripKita = 0;
        final int biayaPerKm = 13000;
      
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukkan nama driver [Beliau/Mereka/Kita]: ");
            driver = scanner.next();

            System.out.print("Lama trip (km): ");
            int lamaTrip = scanner.nextInt();

            switch (driver) {
                case "Beliau":
                    totalTripBeliau += lamaTrip;
                    omzetBeliau += lamaTrip * biayaPerKm;
                    break;
                case "Mereka":
                    totalTripMereka += lamaTrip;
                    omzetMereka += lamaTrip * biayaPerKm;
                    break;
                case "Kita":
                    totalTripKita += lamaTrip;
                    omzetKita += lamaTrip * biayaPerKm;
                    break;
            }

            System.out.print("Input lagi (Y/N)?: ");
            String inputLagi = scanner.next();
            if (inputLagi.equalsIgnoreCase("N")) {
                break;
            }
        }

        double maxOmzet = Math.max(omzetBeliau, Math.max(omzetMereka, omzetKita));
        String driverTertinggi = (maxOmzet == omzetBeliau) ? "Beliau" :
                                  (maxOmzet == omzetMereka) ? "Mereka" : "Kita";

        
        int totalTrip = totalTripBeliau + totalTripMereka + totalTripKita;
        System.out.println("Total trip yang dilakukan driver = " + totalTrip);
        System.out.println("Omzet tertinggi diperoleh oleh " + driverTertinggi + " dengan total omzet = " + maxOmzet);
    }
}
