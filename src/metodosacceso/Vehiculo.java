
package metodosacceso;


public abstract class Vehiculo {
  private String nombreConductor;
    public int nPasajeros = 0;
    private double cantidadDinero = 0;
    public int nMaximoPasajeros;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;

    public Vehiculo(String nombreConductor, int nMaximoPasajeros) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
    }
    
    public Vehiculo(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }


    public void dejarPasajero (){
        if(getnPasajeros()>0){
            setnPasajeros(getnPasajeros() - 1);
        }
    }
    
    public double calcularDistanciaAcopio (){
        return Math.sqrt((getLocalizacionX()*getLocalizacionX())+(getLocalizacionY()*getLocalizacionY()));  
    }
    
    public void gestionarAireAcondicionado (){
        if(isMotorEncendido()==true && isAireAcondicionadoActivado()==false){
            setAireAcondicionadoActivado(true);
        }else{
            setAireAcondicionadoActivado(true);
        }
    }
    
    public void gestionarMotor(){
        if (isMotorEncendido()== false){
            setMotorEncendido(true);
        }else{
            setMotorEncendido(false);
            setAireAcondicionadoActivado(false);
            setWifiEncendido(false);
            setEnMarcha(false);
        }
        
    }
    
    public void gestionarWifi(){
        if(isMotorEncendido() == true && isWifiEncendido()==false){
            setWifiEncendido(true);
        }else{
            setWifiEncendido(false);
        }
    }
 
    public abstract void gestionarMarcha();
    
    
    public void moverDerecha(double d){
        if(isEnMarcha()==true){
            setLocalizacionX(getLocalizacionX()+1);
        }
    }

    public void moverIzquierda(double d){
        if(isEnMarcha()==true){
            setLocalizacionX(getLocalizacionX()-1);
        }
    }    
    
    public void moverArriba(double d){
        if(isEnMarcha()==true){
            setLocalizacionY(getLocalizacionY()+1);
        }
    }   
    
    public void moverAbajo(double d){
        if(isEnMarcha()==true){
            setLocalizacionY(getLocalizacionY()-1);
        }
    }    
    
    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "nombreConductor=" + nombreConductor + ", nPasajeros=" + nPasajeros + ", cantidadDinero=" + cantidadDinero + ", nMaximoPasajeros=" + nMaximoPasajeros + ", localizacionX=" + localizacionX + ", localizacionY=" + localizacionY + ", aireAcondicionadoActivado=" + aireAcondicionadoActivado + ", motorEncendido=" + motorEncendido + ", wifiEncendido=" + wifiEncendido + ", enMarcha=" + enMarcha + '}';
    }
}
