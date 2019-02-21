package mbConverter;

public class MBConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int unit = 1024;

            int megas = kiloBytes / unit;

            int remaining = kiloBytes % unit;

            System.out.println(kiloBytes + " KB = " + megas + " MB and " + remaining + " KB");
        }
    }
}
