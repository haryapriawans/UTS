/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programip;

/**
 *
 * @author acer
 */
public class ProgramIp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float ip;
        int lulus, tdk lulus, valid = 0, jumlah, bil = 0,rata, NilaiMin = 1000;
        Dataip range = new Dataip();
        
        System.err.println(range.iswithinRange(2, 0, 4));
        ip = input.nextFloat();
        while (ip != -999) {
            ip = input.nextFloat();
            if (iswithinRange(ip, 0 ,4) == 1) {
                valid++;
            }
            if (ip == -999) {
                System.out.println("Masukan jumlah mahasiswa !");
                jumlah = input.nextInt();
                if (ip <= 2,75) {
                bil = input.nextInt();
                if (bil <= 2,75) {
                    jumlah++;
                }
                NilaiMin = bil;
            }
            System.out.println("Nilai Minumalnya : " + NilaiMin);
            }
        }
    }
    public static int iswithinRange(float x, float min, float max) {
        if (x <= max && x => min) {
            return 1;
        } else {
        }
    }
}
    
