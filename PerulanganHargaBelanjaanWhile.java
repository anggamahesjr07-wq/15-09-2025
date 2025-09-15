public class PerulanganHargaBelanjaanWhile {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        boolean kondisi = true;
        int counter = 0;
        String jawab;
        double totalHarga = 0.0;

        while (kondisi) {
            System.out.print("Masukkan nama barang: ");
            String namaBarang = input.nextLine();
            System.out.print("Masukkan harga barang (atau ketik 'keluar' untuk selesai): ");
            jawab = input.nextLine();
            if (jawab.equalsIgnoreCase("keluar")) {
                kondisi = false;
            } else {
                try {
                    double harga = Double.parseDouble(jawab);
                    totalHarga += harga;
                    counter++;
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Silakan masukkan angka atau 'keluar'.");
                }
            }
        }
        System.out.println("Total harga belanjaan Anda adalah: Rp " + totalHarga);
        System.out.println("Anda memasukkan " + counter + " item.");
        input.close();
    }
}
