class WysylkaSmsStrategii implements WysylkaStrategii {
    @Override
    public void wyslij(String reklama, String sposob) {
        System.out.println("Wysyłanie reklamy za pomocą wiadomości SMS: " + reklama);
    }
}