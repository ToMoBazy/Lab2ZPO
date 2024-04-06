class TlumaczenieAngielskiiStrategii implements TlumaczenieStrategii {
    @Override
    public void tlumacz(String reklama, String jezyk) {
        System.out.println("Tłumaczenie reklamy na angielski (domyslny): " + reklama);
    }
}
