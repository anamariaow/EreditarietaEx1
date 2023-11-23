public class Gatto extends Animale {
    public Gatto() {
        setVerso("Miao");
    }

    @Override
    public void faiIlVerso() {
        System.out.println(getVerso());
    }
}
