package ru.netology.radio;
import org.testng.annotations.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();
        System.out.println(radio.currentStation);





    }
}
