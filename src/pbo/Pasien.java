package pbo;

public class Pasien extends Orang {
    private String penyakit;

    public Pasien(String nama, int umur, String penyakit) {
        super(nama, umur);
        this.penyakit = penyakit;
    }

    // Mutator (setter)
    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    // Accessor (getter)
    public String getPenyakit() {
        return penyakit;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Penyakit: " + penyakit);
    }
}
