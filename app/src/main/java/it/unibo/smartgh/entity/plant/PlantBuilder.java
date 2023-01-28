package it.unibo.smartgh.entity.plant;

import it.unibo.smartgh.entity.parameter.ParameterType;

import java.util.Map;

/**
 * Builder for the plant entity.
 */
public final class PlantBuilder {
    private final String name;
    private String description;
    private String img;
    private Map<ParameterType, PlantParameter> parameters;

    /**
     * Constructor for the plant entity.
     * @param name of the plant.
     */
    public PlantBuilder(String name) {
        this.name = name;
    }

    /**
     * Add description to plant entity.
     * @param description of the plant.
     * @return the plant builder.
     */
    public PlantBuilder description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Add image to plant entity.
     * @param image of the plant.
     * @return the plant builder.
     */
    public PlantBuilder image(String image) {
        this.img = image;
        return this;
    }

    /**
     * Add units map.
     * @param parameters of parameters.
     * @return the plant builder.
     */
    public PlantBuilder parameters(Map<ParameterType, PlantParameter> parameters) {
        this.parameters = parameters;
        return this;
    }


    /**
     * Create a new Plant entity.
     * @return the new plant.
     */
    public Plant build(){
        return new PlantImpl(this.name,
                this.description,
                this.img,
                this.parameters
                );
    }

}
