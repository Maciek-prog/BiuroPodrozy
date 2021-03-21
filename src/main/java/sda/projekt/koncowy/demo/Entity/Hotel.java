package sda.projekt.koncowy.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name="hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nazwa;

    @Column
    private char standard;

    @Column
    private String opis;

    @Column
    private String przynaleznosc_do_miasta;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public char getStandard() {
        return standard;
    }

    public void setStandard(char standard) {
        this.standard = standard;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getPrzynaleznosc_do_miasta() {
        return przynaleznosc_do_miasta;
    }

    public void setPrzynaleznosc_do_miasta(String przynaleznosc_do_miasta) {
        this.przynaleznosc_do_miasta = przynaleznosc_do_miasta;
    }
}
