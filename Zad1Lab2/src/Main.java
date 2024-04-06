public class Main {
    public static void main(String[] args) {
        Postac strzelec = new Postac();
        strzelec.ustawBron(new StrzelecStrategia());
        strzelec.atakuj();

        Postac lucznik = new Postac();
        lucznik.ustawBron(new LucznikStrategia());
        lucznik.atakuj();

        Postac rycerz = new Postac();
        rycerz.ustawBron(new RycerzStrategia());
        rycerz.atakuj();

        Postac kanonier = new Postac();
        kanonier.ustawBron(new KanonierStrategia());
        kanonier.atakuj();

        Postac BezBroni = new Postac();
        BezBroni.atakuj();
    }
}