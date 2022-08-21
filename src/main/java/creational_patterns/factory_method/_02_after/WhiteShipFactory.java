package creational_patterns.factory_method._02_after;

public class WhiteShipFactory implements ShipFactory{

    // WhiteShip에 특화된 공정은 Whiteship에서 처리했기때문에 WhiteShipFactory에서 추가적으로 해야할 공정이 따로 없으면 아래와 같이 whiteShip만 return합니다. 필요하다면 WhiteShip공장만의 로직이 추가될 수 있습니다.
    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
