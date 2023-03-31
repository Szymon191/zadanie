import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Pattern pattern = Pattern.compile("\\d+[a-zA-Z]?}");
        Matcher matcher = pattern.matcher(numerDomu);
        if(!matcher.matches()) throw new IllegalArgumentException("zly numer domu");
        this.numerDomu = numerDomu;
    }

    public String getKodPocztowy() {
        Pattern pattern = Pattern.compile("\\d{2}-\\d{3}");
        if(!pattern.matcher(kodPocztowy).matches()) throw new IllegalArgumentException("zly kod pocztowy");
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
