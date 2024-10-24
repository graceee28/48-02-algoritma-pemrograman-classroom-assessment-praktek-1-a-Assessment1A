public class Nomor1{
    public static void main(String[] args){
        
        int TotalJamlembur;
        int honorLembur;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumblah jam lembur: ");
        int jamLembur = scanner.nextInt();

        double honor = 0.0;

        if (jamLembur <= 16) {
            honor = jamLembur * 10000;
        } else {
            honor = 16 * 10000 + (jamLembur - 16) * 15000;
        }

        System.out.println("Total jam lembur: " + jamLembur);
        System.out.println("Honor lembur: " + honor);
    }
}
