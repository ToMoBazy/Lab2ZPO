class TlumaczeniePreferowaneStrategii implements TlumaczenieStrategii {
    @Override
    public void tlumacz(String reklama, String jezyk) {
        System.out.println("Tłumaczenie reklamy na język " + jezyk + ": " + reklama);
    }
}