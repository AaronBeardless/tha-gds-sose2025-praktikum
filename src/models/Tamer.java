package models;

import models.monster.traits.Companion;

public interface Tamer
{

    public abstract void addCompanion(Companion companion);
    public abstract void receiveCuddle(int cuddleIntensity);

}
