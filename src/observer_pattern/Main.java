package observer_pattern;

public class Main {
    public static void main(String[] args) {
        InformacaoMeterologica infMeterologica = new InformacaoMeterologica();

        MobileDisplay mobileDisplay = new MobileDisplay();
        SiteDisplay siteDisplay = new SiteDisplay();

        infMeterologica.registraObservador(mobileDisplay);
        infMeterologica.registraObservador(siteDisplay);

        infMeterologica.Medidas(25.5f, 65.0f, 1013.1f);
        infMeterologica.Medidas(27.0f, 70.0f, 1012.5f);

        infMeterologica.removeObservador(siteDisplay);
        infMeterologica.Medidas(29.0f, 60.0f, 1011.0f);
    }
}