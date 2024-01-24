package com.example.news_app.Model;

public class Korisnik {
    private String ime;
    private String prezime;
    private String username;
    private String password;
    private TipKorisnika tipKorisnika;

    public Korisnik(String ime, String prezime, String username, String password, TipKorisnika tipKorisnika) {
        this.ime = ime;
        this.prezime = prezime;
        this.username = username;
        this.password = password;
        this.tipKorisnika = tipKorisnika;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TipKorisnika getTipKorisnika() {
        return tipKorisnika;
    }

    public void setTipKorisnika(TipKorisnika tipKorisnika) {
        this.tipKorisnika = tipKorisnika;
    }
}
