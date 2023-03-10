package it.unibo.smartgh.entity.plant;

/**
 * This interface represents a plant measured parameter
 */
public interface PlantParameter {
    /**
     * Get the parameter name.
     * @return the parameter name
     */
    String getName();
    /**
     * Get the parameter min value.
     * @return the parameter min value
     */
    Double getMin();
    /**
     * Get the parameter max value.
     * @return the parameter max value
     */
    Double getMax();
    /**
     * Get the parameter unit.
     * @return the parameter unit
     */
    String getUnit();
}
