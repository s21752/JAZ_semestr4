package pl.pjatk.cezgra;

public class SecondComponent {

    public SecondComponent(FirstComponent firstComponent) {
        System.out.println("Im in second component");
    }

    public void showText() {
        System.out.println("Text from second component");
    }
}
