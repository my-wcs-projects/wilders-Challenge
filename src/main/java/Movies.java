public class Movies {
    public static void main(String[] args) {
        String[] filmsTitle = {"Raiders of the Lost Ark", "Indiana Jones and the Temple of Doom", "Indiana Jones and the Last Crusade "};
        String[][] actorsOfEachFilm = {
                {"Harrison Ford", "Karen Allen ", "Paul Freeman"},
                {"Harrison Ford", "Kate Capshaw", "Amrish Puri as Mola Ram"},
                {"Harrison Ford", "Sean Connery", "Denholm Elliott"}
        };
        for (int i = 0 ; i < filmsTitle.length; i++) {
            System.out.println("In the movie " + filmsTitle[i] + ", the main actors are: ");
            for (int j = 0 ; j < actorsOfEachFilm[i].length; j++) {
                System.out.println(actorsOfEachFilm[i][j] + ",");
            }
        }
    }
}
