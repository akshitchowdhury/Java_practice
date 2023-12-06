package Collections;

import java.util.ArrayList;

public class Anime {

    private static ArrayList<Anime> alist = new ArrayList<>();

    private String name;

    public Anime(String name){
        this.name = name;
    }

    public static ArrayList <Anime> add_anime(Anime anime){

        alist.add(anime);
        
        return alist;
        
    }

    public static void main(String[] args) {
        
        Anime aniwave = new Anime("Dragon-fore");
        Anime aniwave2 = new Anime("Shogun");
        Anime aniwave3 = new Anime("Dragon-Ball");
        add_anime(aniwave);
        add_anime(aniwave2);
        add_anime(aniwave3);

        for (Anime items: alist
             ) {
            System.out.println(items.name);
        }
    }
}
