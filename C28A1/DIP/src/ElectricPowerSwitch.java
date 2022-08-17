
public class ElectricPowerSwitch
{
    public Switchable s;
    public boolean on;

    public ElectricPowerSwitch(Switchable s)
    {
        this.s = s;
        this.on = false;
    }
    public boolean isOn()
    {
        return this.on;
    }
    public void press()
    {
        boolean checkOn = isOn();
        if (checkOn) {
            s.turnOff();
            this.on = false;
        } else {
            s.turnOn();
            this.on = true;
        }
    }
}