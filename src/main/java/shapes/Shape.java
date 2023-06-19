package shapes;

public abstract class Shape{
    private String nome;
    public Shape(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public abstract double getArea();
    public String getSizeGroup(){
        int area = (int) getArea();
        if(area < 5){
            return "Pequeno";
        }
        else if(area >= 5 && area < 10){
            return "Médio";
        }
        else{
            return "Grande";
        }
    }
}
