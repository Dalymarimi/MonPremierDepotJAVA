public class BouclesForEachPratique {
    public static void main(String[] args) {
        //Calculer la somme des éléments du tableau suivant:
        int[] valeurs= {5,6,7,8,9,10};
        int somme=0;
        for (int i : valeurs) {
            somme+=i;
        }
        System.out.println("La somme est "+ somme);
    }
}
