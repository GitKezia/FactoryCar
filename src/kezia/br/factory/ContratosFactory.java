package kezia.br.factory;

public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new BMW_XM(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}