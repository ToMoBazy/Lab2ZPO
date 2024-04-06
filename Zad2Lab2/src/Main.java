public class Main {
    public static void main(String[] args) {
        Reklama reklama = new Reklama("Nowa oferta! Kup teraz!");

        Odbiorca odbiorca1 = new Odbiorca("angielski");
        Odbiorca odbiorca2 = new Odbiorca("francuski");

        KampaniaReklamowa kampania1 = new KampaniaReklamowa(new TlumaczeniePreferowaneStrategii(), new WysylkaEmailStrategii());
        KampaniaReklamowa kampania2 = new KampaniaReklamowa(new TlumaczeniePreferowaneStrategii(), new WysylkaSmsStrategii());
        KampaniaReklamowa kampania3 = new KampaniaReklamowa(new TlumaczenieAngielskiiStrategii(), new WysylkaGlosowaStrategii());

        kampania1.uruchom(reklama, odbiorca1, 80);
        kampania2.uruchom(reklama, odbiorca2, 30);
        kampania3.uruchom(reklama, odbiorca1, 120);
    }
}