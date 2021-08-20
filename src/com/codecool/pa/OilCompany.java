package com.codecool.pa;

import com.codecool.pa.extractors.Extractor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OilCompany {
    private List<Extractor> extractors;

    public OilCompany() {
        this.extractors = new ArrayList<>();
    }

    public void addExtractors(Extractor extractor) {
        extractors.add(extractor);
    }

    public long getNumberOfExtractorsWithFaults() {
        return extractors
                .stream()
                .filter(Extractor::reportFaults)
                .count();
    }

    public List<Extractor> getBestExtractor () {
        return extractors
                .stream()
                .filter(extractor -> extractor.getExtractionPerformance() > 95)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "OilCompany{" +
                "extractors=" + extractors +
                '}';
    }
}
