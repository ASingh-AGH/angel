package project.softwarestudio.angel;

import java.util.ArrayList;

public class TestDataSet {
    public static ArrayList<HelpPlace> hp(){
        ArrayList<HelpPlace> ahp = new ArrayList<>();
        ahp.add(HelpPlace.createHelpPlace("Place 1","Some description",1));
        ahp.add(HelpPlace.createHelpPlace("Place 2","Some description",2));
        ahp.add(HelpPlace.createHelpPlace("Place 3","Some description",3));
        ahp.add(HelpPlace.createHelpPlace("Place 4","Some description",4));
        ahp.add(HelpPlace.createHelpPlace("Place 5","Some description",5));
        ahp.add(HelpPlace.createHelpPlace("Place 6","Some description",6));
        return ahp;
    }

    public static ArrayList<HelpOffer> ho(){
        ArrayList<HelpOffer> aho = new ArrayList<>();
        aho.add(HelpOffer.createHelpPlace("Offer 1", "Some description", 1));
        aho.add(HelpOffer.createHelpPlace("Offer 2", "Some description", 2));
        aho.add(HelpOffer.createHelpPlace("Offer 3", "Some description", 3));
        aho.add(HelpOffer.createHelpPlace("Offer 4", "Some description", 4));
        aho.add(HelpOffer.createHelpPlace("Offer 5", "Some description", 5));
        return aho;
    }
}
