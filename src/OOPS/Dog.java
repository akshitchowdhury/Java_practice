package OOPS;

public class Dog {

    private String name;
    private String breed;

    public void Dog(String name, String breed){

        this.name = name;
        this.breed = breed;
    }

    public String setName(String neo){
         name = neo;
        return name;
    }

    public String setBreed(String alais) {
         breed = alais ;
        return breed;
    }
}
