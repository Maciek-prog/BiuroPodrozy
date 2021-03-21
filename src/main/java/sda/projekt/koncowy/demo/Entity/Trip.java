package sda.projekt.koncowy.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name="wycieczka")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String skad;

    @Column
    private String dokad;

    @Column
    private String data_wyjazdu;

    @Column
    private  String data_powrotu;

    @Column
    private String ilosc_dni;

    @Column
    private char typ;

    @Column
    private String cena_za_dorosłego;

    @Column
    private String cena_za_dziecko;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSkad() {
        return skad;
    }

    public void setSkad(String skad) {
        this.skad = skad;
    }

    public String getDokad() {
        return dokad;
    }

    public void setDokad(String dokad) {
        this.dokad = dokad;
    }

    public String getData_wyjazdu() {
        return data_wyjazdu;
    }

    public void setData_wyjazdu(String data_wyjazdu) {
        this.data_wyjazdu = data_wyjazdu;
    }

    public String getData_powrotu() {
        return data_powrotu;
    }

    public void setData_powrotu(String data_powrotu) {
        this.data_powrotu = data_powrotu;
    }

    public String getIlosc_dni() {
        return ilosc_dni;
    }

    public void setIlosc_dni(String ilosc_dni) {
        this.ilosc_dni = ilosc_dni;
    }

    public char getTyp() {
        return typ;
    }

    public void setTyp(char typ) {
        this.typ = typ;
    }

    public String getCena_za_dorosłego() {
        return cena_za_dorosłego;
    }

    public void setCena_za_dorosłego(String cena_za_dorosłego) {
        this.cena_za_dorosłego = cena_za_dorosłego;
    }

    public String getCena_za_dziecko() {
        return cena_za_dziecko;
    }

    public void setCena_za_dziecko(String cena_za_dziecko) {
        this.cena_za_dziecko = cena_za_dziecko;
    }
}
