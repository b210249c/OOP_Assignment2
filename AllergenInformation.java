    import java.util.ArrayList;

    public interface AllergenInformation {
        boolean containsAllergen();
        ArrayList<String> listAllergens();
        String markAsAllergenFree();
    }
