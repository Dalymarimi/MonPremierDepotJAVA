public class BouclesFor {
    public static void main(String[] args) {
        //Ecrire un programme pour trouver la somme des nombres entiers de 1 à 1000.
        /* int somme=0; 
        int a=2000;
        for(int i=1;i<=a;i++){
            somme+=i;
        }
        System.out.println("la somme est "+somme); 
        */
        int somme=0; 
        int a=2000;
        for(int i=a;i>=1;i--){
            somme+=i;
        }
        System.out.println("la somme est "+somme);
    }
}
