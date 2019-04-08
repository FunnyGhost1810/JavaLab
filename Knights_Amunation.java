package com.company;

public class Knights_Amunation {
    private String Name;
    private float Cost;
    private float  Weight;
    public Knights_Amunation(String Name,float Cost,float Weight){
        this.Name=Name;
        this.Cost=Cost;
        this.Weight=Weight;
    }
    public String getName(){
        return Name;
    }
    public float getCost(){
        return Cost;
    }
    public float getWeight(){
        return Weight;
    }
    @Override
    public String toString() {
        String string = "Name of Ammunition: " + getName() + "\nCost: " + getCost() + "\nWeight: " + getWeight();
        return string;
    }

}
