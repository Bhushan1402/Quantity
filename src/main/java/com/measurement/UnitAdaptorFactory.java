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
            case MILLILITRE:
                return new MilliLitre();
            default:
                return null;
        }
    }
}
