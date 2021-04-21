
public class NIM {
    private String nim;

    public String getNim() { return nim; }
    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjangPendidikan() {
        char kodeJp = nim.charAt(6);
        if (kodeJp == '1') {
            return "S1(Sarjana)";
        } else if (kodeJp == '2') {
            return "S2 (Magister)";
        } else if (kodeJp == '3') {
            return "S3 (Doktor)";
        }
        return "Tidak Terdeteksi";
    }

    public String getTahunMasuk() {
        char kodeTm = nim.charAt(6);
        if (kodeTm == "18") {
            return "2018";
        } else if (kodeTm == "19") {
            return "2019";
        } else if (kodeTm == "20") {
            return "2020";
        }
        return "Tidak Terdeteksi";
    }

    public String getFakultas() {
        char kodeF = nim.charAt(6);
        if (kodeF == '1') {
            return "Fakultas Tarbiyah dan Keguruan";
        } else if (kodeF == '2') {
            return "Fakultas Syari'ah dan Hukum";
        } else if (kodeF == '3') {
            return "Fakultas Ushuluddin";
        } else if (kodeF == '4') {
            return "Fakultas Syari'ah dan Hukum";
        } else if (kodeF == '5') {
            return "Fakultas Dakwah dan Komunikasi";
        } else if (kodeF == '6') {
            return "Psikologi";
        } else if (kodeF == '7') {
            return "Fakultas Ekonomi dan Ilmu Sosial";
        } else if (kodeF == '8') {
            return "Fakultas Pertanian dan Peternakan";
        }
        return "Tidak Terdeteksi";
    }

    public String getJurusan() {
        char kodeJ = nim.charAt(6);
        if (kodeJ == "01") {
            return "Teknik Informatika";
        } else if (kodeJ == "02") {
            return "Teknik Industri";
        } else if (kodeJ == "03") {
            return "Sistem Informasi";
        } else if (kodeJ == "04") {
            return "Matematika";
        } else if (kodeJ == "05") {
            return "Teknik Elektro";
        }
        return "Tidak Terdeteksi";
    }
    public String getJenisKelamin() {
        char kodeJK = nim.charAt(6);
        if (kodeJK == '1') {
            return "Laki-Laki";
        } else if (kodeJK == '2') {
            return "Perempuan";
        }
        return "Tidak Terdeteksi";
    }
    public String getNoUrut() {
        return this.nim.substring(7,11);
    }
}
