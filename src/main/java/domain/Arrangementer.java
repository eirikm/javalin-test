package domain;

import java.util.List;

public class Arrangementer {

    private List<Arrangement> arrangements;

    public List<Arrangement> getArrangements() {
        return arrangements;
    }

    public void setArrangements(List<Arrangement> arrangements) {
        this.arrangements = arrangements;
    }

    @Override
    public String toString() {
        return "Arrangementer{" +
                "arrangements=" + arrangements +
                '}';
    }
}
