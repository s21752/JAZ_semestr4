package pl.pjatk.cezgra;

import pl.pjatk.cezgra.zjazd2.JavaPojo;
import pl.pjatk.cezgra.zjazd2.zaddom.ProfileDependantBean;

public class FirstComponent {

    public FirstComponent(JavaPojo javaPojo) {

        System.out.println("Im in first component");
        System.out.println(javaPojo.getValue());
        System.out.println(javaPojo.defaultValue);
    }

    public void showText() {
        System.out.println("Text from first component");
    }
}