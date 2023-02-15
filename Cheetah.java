class Cheetah extends Animal {         

    public Cheetah(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);
        
    }
    // Driver method
    public static void main(String[] args){
        Lion lion = new Lion(31, false, 122);
        System.out.println(lion);
        Cheetah cheetah = new Cheetah(30, true, 50);
        System.out.println(cheetah);
    }
}
