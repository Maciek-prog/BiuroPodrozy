package sda.projekt.koncowy.demo.Entity;

import javax.persistence.*;

@Entity
@Table (name = "miasto")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nazwa;
    @Column
    private String przynaleznosc_do_kraju;

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

    public String getPrzynaleznosc_do_kraju() {
        return przynaleznosc_do_kraju;
    }

    public void setPrzynaleznosc_do_kraju(String przynaleznosc_do_kraju) {
        this.przynaleznosc_do_kraju = przynaleznosc_do_kraju;
    }
}
