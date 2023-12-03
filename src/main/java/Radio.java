public class Radio {

    private int currentNumberOfRadiostation;
    private int currentSoundVolume;
    private int maxRadiostation = 9;
    private int maxVolume = 100;
    private int numberOfRadiostation = 10;
    public Radio(int numberOfRadiostation) {
        this.numberOfRadiostation = numberOfRadiostation;
    }
    public Radio(){

    }



    public void setCurrentNumberOfRadiostation(int newCurrentNumberOfRadiostation) {
        if (newCurrentNumberOfRadiostation < 0) {
            return;
        }

        if (newCurrentNumberOfRadiostation > maxRadiostation) {
            return;
        }
        currentNumberOfRadiostation = newCurrentNumberOfRadiostation;
    }
    public int getCurrentNumberOfRadiostation() {

        return currentNumberOfRadiostation;
    }

    public void next() {
        if (currentNumberOfRadiostation == maxRadiostation) {
            currentNumberOfRadiostation = 0;
        } else {
            currentNumberOfRadiostation++;
        }
    }

    public void prev() {
        if (currentNumberOfRadiostation == 0) {
            currentNumberOfRadiostation = maxRadiostation;
        } else {
            currentNumberOfRadiostation--;
        }
    }

    public int getCurrentSoundVolume() {

        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }

        if (newCurrentSoundVolume > maxVolume) {
            return;
        }

        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseCurrentSoundVolume (){
        if (currentSoundVolume < maxVolume) {
            currentSoundVolume++;
        }
    }

    public void decreaseCurrentSoundVolume (){
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        }
    }
}