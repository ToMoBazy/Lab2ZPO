class KampaniaReklamowa {
    private TlumaczenieStrategii tlumaczenieStrategii;
    private WysylkaStrategii wysylkaStrategii;

    public KampaniaReklamowa(TlumaczenieStrategii tlumaczenieStrategii, WysylkaStrategii wysylkaStrategii) {
        this.tlumaczenieStrategii = tlumaczenieStrategii;
        this.wysylkaStrategii = wysylkaStrategii;
    }

    public void uruchom(Reklama reklama, Odbiorca odbiorca, double oplata) {
        // Tłumaczenie reklamy na preferowany język odbiorcy
        tlumaczenieStrategii.tlumacz(reklama.getTresc(), odbiorca.getPreferowanyJezyk());

        // Wybór sposobu wysyłki reklamy w zależności od opłaty
        if (oplata >= 100) {
            wysylkaStrategii = new WysylkaGlosowaStrategii();
        } else if (oplata >= 50) {
            wysylkaStrategii = new WysylkaSmsStrategii();
        } else {
            wysylkaStrategii = new WysylkaEmailStrategii();
        }

        // Wysłanie reklamy
        wysylkaStrategii.wyslij(reklama.getTresc(), "");
    }
}