public class Banane {
    private double prix;
    private String origine;

    public Banane()
    {
        this.prix = 1;  //prix en euros
        this.origine="Afrique du Sud";
    }

    public Banane (double prix, String origine)
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Afrique du Sud";  //Afrique du Sud par défaut
	else
            this.origine = origine;
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }

    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Banane de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Banane or = (Banane) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        Banane fruit1=new Banane(1000000,"Antarctique");
        Banane fruit2=new Banane(0.01,"Wish");
        Banane fruit3=new Banane(1,"Maroc");
        Banane fruit4=new Banane(100,"Corse");
        Banane fruit5=new Banane(1000000,"Antarctique");

        if(fruit1.equals(fruit3))
        System.out.println("C'était sûr en fait !");
        else
        System.out.println("Sentiment meilleur");
	System.out.println(fruit3.toString());
   }
}
