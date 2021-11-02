package cz.cvut.fel.omo.cv6.strategy;

import cz.cvut.fel.omo.cv6.Street;
import cz.cvut.fel.omo.cv6.TrafficLight;

public class EveningStrategy extends Strategy{

    int time = 0;

    public EveningStrategy(Street street) {
        super(street);
    }

    @Override
    public void controlTraffic() {

        int counter = 0;

        for (TrafficLight light : street.getLights()) {

            if (time - counter * lightDistance == 0) {
                light.startGoSequence();
            } else {
                light.timeLapseTick();
            }
            counter++;
        }
        time++;

    }

}
// TODO - TO BE IMPLEMENTED
