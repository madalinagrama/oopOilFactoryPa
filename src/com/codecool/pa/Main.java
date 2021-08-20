package com.codecool.pa;

import com.codecool.pa.extractors.FixedTerrestrial;
import com.codecool.pa.extractors.MobileTerrestrial;
import com.codecool.pa.extractors.OffshorePlatform;

public class Main {

    public static void main(String[] args) {
        OilCompany oilCompany = new OilCompany();

        FixedTerrestrial fixedTerrestrial = new FixedTerrestrial("hgsadhs", 10,1, "jahgdsjav");
        oilCompany.addExtractors(fixedTerrestrial);

        MobileTerrestrial mobileTerrestrial = new MobileTerrestrial("nmasdhjgs", 11, 10, " jhasjdgasjdh");
        oilCompany.addExtractors(mobileTerrestrial);

        OffshorePlatform offshorePlatform = new OffshorePlatform("hgsdsg", 9,8.9);
        oilCompany.addExtractors(offshorePlatform);

        System.out.println(oilCompany.getBestExtractor().toString());
        System.out.println(oilCompany.getNumberOfExtractorsWithFaults());
    }
}
