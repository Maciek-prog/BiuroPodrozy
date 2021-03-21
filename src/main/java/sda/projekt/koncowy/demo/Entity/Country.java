package sda.projekt.koncowy.demo.Entity;


import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name = "kraj")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nazwa;

    @Column
    private String przynaleznosc_do_kontynentu;

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

    public String getPrzynaleznosc_do_kontynentu() {
        return przynaleznosc_do_kontynentu;
    }

    public void setPrzynaleznosc_do_kontynentu(String przynaleznosc_do_kontynentu) {
        this.przynaleznosc_do_kontynentu = przynaleznosc_do_kontynentu;
    }
}
