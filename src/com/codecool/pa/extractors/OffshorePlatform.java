package com.codecool.pa.extractors;

import com.codecool.pa.workers.Position;
import com.codecool.pa.workers.Worker;

import java.util.ArrayList;
import java.util.List;

public class OffshorePlatform extends Extractor{
    private List<Worker> workers;

    public OffshorePlatform(String serialNumber, double capacity, double extractedQuantity) {
        super(serialNumber, capacity, extractedQuantity);
        this.workers = new ArrayList<>();
    }

    private boolean checkExtraction() {
        return getExtractionPerformance() < 70;
    }

    private boolean hasMedic () {
        for (Worker worker : workers) {
            if (worker.getPosition() == Position.MEDIC)
                return true;
        }
        return false;
    }

    private boolean checkDaysOnBoard() {
        for (Worker worker : workers) {
            if (worker.getDaysOnPlatform() >= 14)
                return true;
        }
        return false;
    }

    @Override
    public boolean reportFaults() {
        return checkDaysOnBoard() || !hasMedic() || checkExtraction();
    }

    public List<Worker> getWorkers() {
        return workers;
    }
}

