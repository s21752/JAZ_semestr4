package pl.pjatk.cezgra.zjazd2.zaddom;

import org.springframework.stereotype.Component;

@Component
public class ClassWithConditionalDependency {

    public ClassWithConditionalDependency(ProfileDependantBean conditionalBean) {}
}
