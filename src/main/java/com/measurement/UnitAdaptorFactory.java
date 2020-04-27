package com.measurement;

public class UnitAdaptorFactory {
    public static IUnitAdaptor getObject(Length.Unit unit) {
        switch (unit) {
            case FEET:
                return new FeetImpl();
            case INCH:
                return new InchImpl();
            case YARD:
                return new YardImpl();
            case LITRE:
                return new LitreImpl();
            case GALLON:
                return new GallonImpl();
            case CENTIMETRE:
                return new CentimetreImpl();
            case GRAM:
                return new GramImpl();
            case MILLILITRE:
                return new MilliLitre();
            case TONNE:
                return new TonneImpl();
            case KILOGRAM:
                return new KilogramImpl();
            default:
                return null;
        }
    }
}
