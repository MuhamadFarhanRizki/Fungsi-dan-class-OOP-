package nilai;
public class Nilai {
    public static void Nilai(){
        double n1 = htgNilaiAkhir(80, 90, 87);
        String g1 = htgGrade(n1);
        System.out.println("Nilai akhir mahasiswa :"+n1);
        System.out.println("Grade mahasiswa : "+g1);
    }
    public static double htgNilaiAkhir(double tugas,double uts,double uas) {
        double nilaiAkhir = 0.3 * tugas + 0.3 * uts + 0.4 * uas;
        return nilaiAkhir;
    }
    public static String htgGrade(double nilaiAkhir) {
        String grade = "E";
        if (nilaiAkhir >= 85){
            grade = "A";
        } else if (nilaiAkhir>=75) {
            grade = "B";
        } else if (nilaiAkhir>=55) {
            grade = "C";
        } else if (nilaiAkhir>=45) {
            grade = "D";        
    }
        return grade;
    }
}