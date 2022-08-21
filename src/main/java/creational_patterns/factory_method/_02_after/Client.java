package creational_patterns.factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        /*
        Client 코드는 변경이 일어났습니다. 의존성 주입. 인터페이스 기반으로 코딩하는 코드를 작성하고 구체적인 클래스들을 의존성 주입하는 방법을 쓰면 클라이언트 코드도 최대한 변경되지 않도록 고칠 수 있습니다
         */
        Client client = new Client();
        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackshipFactory().orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }

}
