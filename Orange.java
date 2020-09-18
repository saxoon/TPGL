public class Orange {
    private double prix;
    private String origine;

    public Orange()
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }

    public Orange(double prix, String origine)
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
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
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        Orange fruit1=new Orange(10000,"Zimbabwe");
        Orange fruit2=new Orange(1,"Russie");
        Orange fruit3=new Orange(10,"Ukraine");
        Orange fruit4=new Orange(100,"Roumanie");
        Orange fruit5=new Orange(10000,"Zimbabwe");

        if(fruit1.equals(fruit5))
        System.out.println("Kuku cé mwa");
        else
        System.out.println("Kuku cé pa mwa");
	System.out.println(fruit3.toString());
   }
}
