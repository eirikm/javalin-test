package domain;

public class Kontaktperson {

    private String kontaktperson_navn;
    private String kontaktperson_telefon;
    private String kontaktperson_mobil;
    private String kontaktperson_epost;

    public String getKontaktperson_navn() {
        return kontaktperson_navn;
    }

    public void setKontaktperson_navn(String kontaktperson_navn) {
        this.kontaktperson_navn = kontaktperson_navn;
    }

    public String getKontaktperson_telefon() {
        return kontaktperson_telefon;
    }

    public void setKontaktperson_telefon(String kontaktperson_telefon) {
        this.kontaktperson_telefon = kontaktperson_telefon;
    }

    public String getKontaktperson_mobil() {
        return kontaktperson_mobil;
    }

    public void setKontaktperson_mobil(String kontaktperson_mobil) {
        this.kontaktperson_mobil = kontaktperson_mobil;
    }

    public String getKontaktperson_epost() {
        return kontaktperson_epost;
    }

    public void setKontaktperson_epost(String kontaktperson_epost) {
        this.kontaktperson_epost = kontaktperson_epost;
    }

    @Override
    public String toString() {
        return "Kontaktperson{" +
                "kontaktperson_navn='" + kontaktperson_navn + '\'' +
                ", kontaktperson_telefon='" + kontaktperson_telefon + '\'' +
                ", kontaktperson_mobil='" + kontaktperson_mobil + '\'' +
                ", kontaktperson_epost='" + kontaktperson_epost + '\'' +
                '}';
    }
}
