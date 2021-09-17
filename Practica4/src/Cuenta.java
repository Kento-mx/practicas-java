public class Cuenta extends Banco{
    protected String name;
    protected float saldo;
    protected int pin;
    
    public Cuenta() {
        setName(name);
        setSaldo(saldo);
        setPin(pin);
    }

    //Constructor
    protected Cuenta(String name, float saldo, int pin) {
        setName(name);
        setSaldo(saldo);
        setPin(pin);
    }

    //Setters y getters.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    
}
