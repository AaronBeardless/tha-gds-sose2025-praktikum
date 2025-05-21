package models.monster.traits;

import models.Hero;

public interface Tameable
{

    public abstract void getTamed(Hero tamer);
    public abstract void cuddle(int cuddleIntensity);

}
