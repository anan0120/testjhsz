package com.example.model;
import net.csdn.common.exception.AutoGeneration;
import net.csdn.jpa.association.Association;
import net.csdn.jpa.model.Model;

import javax.persistence.ManyToOne;
public class Tag extends Model {
    @ManyToOne
    private TagSynonym tagSynonym;

    public Association tagSynonym() {
        throw new AutoGeneration();
    }
}
