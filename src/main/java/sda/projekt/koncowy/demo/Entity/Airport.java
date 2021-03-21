package sda.projekt.koncowy.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name ="lotnisko")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column
    private String nazwa;

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

    public String getPrzynaleznosc_do_miasta() {
        return przynaleznosc_do_miasta;
    }

    public void setPrzynaleznosc_do_miasta(String przynaleznosc_do_miasta) {
        this.przynaleznosc_do_miasta = przynaleznosc_do_miasta;
    }
}
