public class BouclesForEach {
    public static void main(String[] args) {
    //Créer un tableau 
    int[] valeurs= {5,6,7,8,9,10};
    String[] eleves={"ahmed","mohamed","ali"};
    System.out.println(valeurs.length);
    System.out.println(eleves.length);
    for (int v : valeurs) {
        System.out.println(v);
        
    }
    for (String eleve : eleves) {
        System.out.println(eleve);  
    }
    }
}
