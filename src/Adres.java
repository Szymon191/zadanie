public class Adres {
    private String ulica;
    private String numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(String ulica, String numerDomu, String kodPocztowy, String miasto) {
        setMiasto(miasto);
        setKodPocztowy(kodPocztowy);
        setUlica(ulica);
        setNumerDomu(numerDomu);
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if(ulica == null)
        {
            throw new IllegalArgumentException("ulica nie moze byc nullem");
        }
        this.ulica = ulica;
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        this.numerDomu = numerDomu;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if(miasto == null)
        {
            throw new IllegalArgumentException("Miasto nie moe byc nullem");
        }
        this.miasto = miasto;
    }
}
