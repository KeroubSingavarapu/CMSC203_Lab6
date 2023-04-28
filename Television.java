/** 
* The purpose of this class is to model a television
* Name: Keroub Emmanuel Singavarapu
* Date: 4/27/2023
**/

public class Television {

    private final String manufacturer;   //Manufacturer of the TV
    private final int screenSize;        //Size of the TV Screen
    private boolean powerOn;             // The powerState of the TV
    private int channel;                 // Current channel    
    private int volume;                  // Current volume

    /**
     * Constructor designed to symbolize the brand and size of the television.
     * @param brand. The brand of the television
     * @param size.  The size of the television
     */
    public Television(String brand, int size) {
    	
        // Initialize all global variables
        this.manufacturer = brand;
        this.screenSize = size;
        this.channel = 0;
        this.volume = 20;
        this.powerOn = false;
    }

    /**
     * Method to change the channel of the TV
     *
     * @param station The channel to switch to
     */
    public void setChannel(int station) {
        this.channel = station;
    }

    /** Turns the TV on and off */
    public void power() {
        this.powerOn = !this.powerOn;
    }

    /** Increases the volume of the TV */
    public void increaseVolume() {
        this.volume++;
    }

    /** Decreases the volume of the TV */
    public void decreaseVolume() {
        this.volume--;
    }

    /** Get the current channel
     * @return the currently set channel
     */
    public int getChannel() {
        return this.channel;
    }

    /** Get the current volume
     * @return the currently set volume
     */
    public int getVolume() {
        return this.volume;
    }

    /** The manufacturer of the TV
     *
     * @return the manufacturer
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /** Return size of the TV
     * @return the TV size
     */
    public int getScreenSize() {
        return this.screenSize;
    }
}