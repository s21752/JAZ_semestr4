package pl.pjatk.cezgra;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ThirdComponent {

    public ThirdComponent(ApplicationContext context) {
        System.out.println("Hello from third component");

        FirstComponent component1 = context.getBean("firstComponent", FirstComponent.class);
        SecondComponent component2 = context.getBean("secondComponent", SecondComponent.class);

        component1.showText();
        component2.showText();

        FourthComponent component4 = context.getBean("fourthComponent", FourthComponent.class);
        System.out.println(component4.getName());

        FourthComponent secondComponent4 = context.getBean("fourthComponent2", FourthComponent.class);
        System.out.println(secondComponent4.getName());
    }
}
