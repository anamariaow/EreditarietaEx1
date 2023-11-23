public class Animale {
    private String verso;

    public Animale() {
        this.verso = "Verso generico";
    }
    public void faiIlVerso() {
        System.out.println(verso);
    }

    public String getVerso() {
        return verso;
    }

    public void setVerso(String verso) {
        this.verso = verso;
    }

}
