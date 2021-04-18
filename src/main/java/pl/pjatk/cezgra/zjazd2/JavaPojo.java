package pl.pjatk.cezgra.zjazd2;

import org.springframework.beans.factory.annotation.Value;

public class JavaPojo {

    public String name;
    public int number;
    public char character;
    public float floatingPointNumber;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Value("${my.custom.property}")
    private String value;

    @Value("${my.custom.random:default value from pojo without properties}")
    public String defaultValue;

    public JavaPojo(String name, int number, char character, float floatingPointNumber) {
        this.name = name;
        this.number = number;
        this.character = character;
        this.floatingPointNumber = floatingPointNumber;


    }

    public JavaPojo() {

        System.out.println("java pojo, hello, from default constructor!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public float getFloatingPointNumber() {
        return floatingPointNumber;
    }

    public void setFloatingPointNumber(float floatingPointNumber) {
        this.floatingPointNumber = floatingPointNumber;
    }
}
