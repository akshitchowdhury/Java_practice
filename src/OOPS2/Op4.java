package OOPS2;

public class Op4 {

    private String name;
    private String breed;

    public void Op4(String name, String breed){

        this.name = name;
        this.breed = breed;

    }


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String setName(String alias){
      return  this.name = alias;
    }

    public String setBreed(String alias){
        return  this.breed = alias;
    }

}
