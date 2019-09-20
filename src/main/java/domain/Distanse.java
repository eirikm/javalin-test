package domain;

public class Distanse {

    private String distanse_lengde;
    private String distanse_starttid;
    private String distanse_startkontingent;
    private String distanse_fullførte_året_før;
    private String distanse_barneløp;
    private String distanse_stafett;
    private String distanse_etapper;
    private String distanse_kontrollmålt;

    public String getDistanse_lengde() {
        return distanse_lengde;
    }

    public void setDistanse_lengde(String distanse_lengde) {
        this.distanse_lengde = distanse_lengde;
    }

    public String getDistanse_starttid() {
        return distanse_starttid;
    }

    public void setDistanse_starttid(String distanse_starttid) {
        this.distanse_starttid = distanse_starttid;
    }

    public String getDistanse_startkontingent() {
        return distanse_startkontingent;
    }

    public void setDistanse_startkontingent(String distanse_startkontingent) {
        this.distanse_startkontingent = distanse_startkontingent;
    }

    public String getDistanse_fullførte_året_før() {
        return distanse_fullførte_året_før;
    }

    public void setDistanse_fullførte_året_før(String distanse_fullførte_året_før) {
        this.distanse_fullførte_året_før = distanse_fullførte_året_før;
    }

    public String getDistanse_barneløp() {
        return distanse_barneløp;
    }

    public void setDistanse_barneløp(String distanse_barneløp) {
        this.distanse_barneløp = distanse_barneløp;
    }

    public String getDistanse_stafett() {
        return distanse_stafett;
    }

    public void setDistanse_stafett(String distanse_stafett) {
        this.distanse_stafett = distanse_stafett;
    }

    public String getDistanse_etapper() {
        return distanse_etapper;
    }

    public void setDistanse_etapper(String distanse_etapper) {
        this.distanse_etapper = distanse_etapper;
    }

    public String getDistanse_kontrollmålt() {
        return distanse_kontrollmålt;
    }

    public void setDistanse_kontrollmålt(String distanse_kontrollmålt) {
        this.distanse_kontrollmålt = distanse_kontrollmålt;
    }

    @Override
    public String toString() {
        return "Distanse{" +
                "distanse_lengde='" + distanse_lengde + '\'' +
                ", distanse_starttid='" + distanse_starttid + '\'' +
                ", distanse_startkontingent='" + distanse_startkontingent + '\'' +
                ", distanse_fullførte_året_før='" + distanse_fullførte_året_før + '\'' +
                ", distanse_barneløp='" + distanse_barneløp + '\'' +
                ", distanse_stafett='" + distanse_stafett + '\'' +
                ", distanse_etapper='" + distanse_etapper + '\'' +
                ", distanse_kontrollmålt='" + distanse_kontrollmålt + '\'' +
                '}';
    }
}
