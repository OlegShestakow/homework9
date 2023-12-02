import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldSetNumberOfRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(8);

        int expected = 8;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinimalNumberOfRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(0);

        int expected = 0;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaximalNumberOfRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(9);

        int expected = 9;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetBelowMinimalNumberOfRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(5);
        radiostation.setCurrentNumberOfRadiostation(-3);

        int expected = 5;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetAboveMaximalNumberOfRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(6);
        radiostation.setCurrentNumberOfRadiostation(12);

        int expected = 6;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPlayNext() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(4);
        radiostation.next();

        int expected = 5;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayNextIfActual9() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(9);
        radiostation.next();

        int expected = 0;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayPrev() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(5);
        radiostation.prev();

        int expected = 4;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayPrevIfActual0() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberOfRadiostation(0);
        radiostation.prev();

        int expected = 9;
        int actual = radiostation.getCurrentNumberOfRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume() {
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(37);

        int expected = 37;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinimalSoundVolume() {
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(0);

        int expected = 0;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaximalSoundVolume() {
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(100);

        int expected = 100;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetBelowMinimalSoundVolume() {
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(50);
        radiostation.setCurrentSoundVolume(-5);

        int expected = 50;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetAboveMaximalSoundVolume() { 
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(20);
        radiostation.setCurrentSoundVolume(120);
        int expected = 20;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPlayLouder() {
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(75);
        radiostation.increaseCurrentSoundVolume();

        int expected = 76;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayMaximumVolumeIfIncreaseAboveIt() {
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(100);
        radiostation.increaseCurrentSoundVolume();

        int expected = 100;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlaySilent() { //
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(60);
        radiostation.decreaseCurrentSoundVolume();

        int expected = 59;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlayMinimumVolumeIfDecreaseAboveIt() {
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(0);
        radiostation.decreaseCurrentSoundVolume();

        int expected = 0;
        int actual = radiostation.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}