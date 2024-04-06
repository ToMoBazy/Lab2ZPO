class Postac {
    private StrategiaAtaku bron;

    public void ustawBron(StrategiaAtaku bron) {
        this.bron = bron;
    }

    public void atakuj() {
        if (bron != null) {
            bron.atakuj();
        } else {
            System.out.println("Brak broni!");
        }
    }
}