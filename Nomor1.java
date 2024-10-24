public class Nomor1{
    public static void main(String[] args){

        int TotalJamlembur;
        int honorLembur;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumblah jam lembur: ");
        int JamLembur = scanner.nextInt();

        double honor = 0.0;

        if (JamLembur <= 16) {
            honor = JamLembur * 10000;
        } else {
            honor = 16 * 10000 + (JamLembur - 16) * 15000;
        }

        System.out.println("Total Jam lembur: " + JamLembur);
        System.out.println("Honor lembur: " + honor);
    }
}
