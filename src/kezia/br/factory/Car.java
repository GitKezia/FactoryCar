package kezia.br.factory;

public abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("O motor está " + fuelSource + " ,carro foi ligado e está pronto para o uso " + horsePower + " horsepowers.n" );
    }
    public void clean(){
        System.out.println("O carro foi limpo, e a sua cor " + color.toLowerCase() + " está brilhando");
    }
    public void mechanicCheck(){
        System.out.println("O carro foi verificado pelo mecânico. Tudo está no lugar!");
    }
    public void fuelCar(){
        System.out.println("O carro está sendo abastecido " + fuelSource.toLowerCase());
    }
}
