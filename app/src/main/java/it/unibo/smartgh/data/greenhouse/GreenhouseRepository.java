package it.unibo.smartgh.data.greenhouse;

import it.unibo.smartgh.entity.greenhouse.Modality;
import it.unibo.smartgh.entity.parameter.ParameterType;
import it.unibo.smartgh.entity.parameter.ParameterValue;
import it.unibo.smartgh.entity.plant.Plant;

public interface GreenhouseRepository {
    /**
     * Initialize the view with the greenhouse data.
     */
    void initializeData();

    /**
     * Update the view plant information.
     * @param plant containing the information.
     */
    void updatePlantInformation(Plant plant);

    /**
     * Update the view parameter value.
     * @param parameter type of the parameter.
     * @param parameterValue new value.
     */
    void updateParameterValue(ParameterType parameter, ParameterValue parameterValue);

    /**
     * Update greenhouse management modality.
     * @param modality the new modality
     */
    void changeModality(Modality modality);

    /**
     * Update the view modality.
     * @param actualModality actual modality.
     */
    void updateModality(Modality actualModality);
}
