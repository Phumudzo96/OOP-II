
class Lion extends Animal {
    String type = "";

    public Lion(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);
        type(weight);
    }
    public String type(int weight){
        super.setWeight(weight);
        if(weight <= 80){
            type = "Cub"; 
        }
        else if(weight <= 120){
            type = "Female";
        }
        else{
            type = "Male";
        }
        return type;
    }
    @Override
    public String toString() { 
        String output = "The number of Teeth: " + getNumTeeth(); 
        output += "\nHow many spots does it have?: " + getSpots();
        output += "\nWhat's it's weigh: " + getWeight();
        output += "\nThe type of Lion: " + type;
        return output;
    }
}