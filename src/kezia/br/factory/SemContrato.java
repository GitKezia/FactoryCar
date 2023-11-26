package kezia.br.factory;

public class SemContrato extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Tesla(150, "cheio", "Branca");
        } else {
            return null;
        }
    }
}
