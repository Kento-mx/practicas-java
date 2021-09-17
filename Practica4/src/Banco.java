

public class Banco {
    int total=10;
    Cuenta cuentas[]= new Cuenta[total];
    //Atributos auxiliares.
    int opcion;
    String nameBuffer;
    int pinBuffer;
    float saldoBuffer;
    int ingresar=0;
    float retirar=0;

    
    //Sertters y getters.
    public int getOpcion() {
        return opcion;
    }


    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public String getNameBuffer() {
        return nameBuffer;
    }


    public void setNameBuffer(String nameBuffer) {
        this.nameBuffer = nameBuffer;
    }


    public int getPinBuffer() {
        return pinBuffer;
    }


    public void setPinBuffer(int pinBuffer) {
        this.pinBuffer = pinBuffer;
    }


    public float getSaldoBuffer() {
        return saldoBuffer;
    }


    public void setSaldoBuffer(float saldoBuffer) {
        this.saldoBuffer = saldoBuffer;
    }


    public int getIngresar() {
        return ingresar;
    }


    public void setIngresar(int ingresar) {
        this.ingresar = ingresar;
    }

    public float getRetirar() {
        return retirar;
    }
    
    public void setRetirar(float retirar) {
        this.retirar = retirar;
    }
    
    
    //Funcion main.
    public static void main(String[] args) {
        Banco banco1= new Banco();
        //Inicializar el tipo de datos en el arreglo.
        for(int k=0; k<10; k++) {
            banco1.cuentas[k] = new Cuenta();
        }
        
        System.out.println("********** BIENVENIDO AL BANCO **********");
        System.out.println("****** NUMERO DE CUENTAS DISPONIBLES: "+banco1.total+" ******");
        
        int i=0;
        do {
            System.out.println("\n ¬MENU.");
            System.out.println(" 1.-AGREGAR CUENTA NUEVA.   |   2.-ENTRAR EN CUENTA EXISTENTE.   |   3.-SALIR\nOPCION: ");
            banco1.setOpcion(CapturaEntrada.capturarEntero(""));
            
            //Agregar cuentas.
            if(banco1.getOpcion() == 1){
                banco1.cuentas[i].setName(CapturaEntrada.capturarCadena("| Nombre"));
                banco1.cuentas[i].setSaldo(CapturaEntrada.capturarFlotante("| Saldo a ingresar"));
                banco1.cuentas[i].setPin(CapturaEntrada.capturarEntero("| Ingresa PIN (4 digitos)"));
                i++;
            }else if(banco1.getOpcion() == 2) {
                banco1.setNameBuffer(CapturaEntrada.capturarCadena("»»»»»»» Ingresa tu nombre"));
                //Comparar el nombre.
                for(int j=0; j<banco1.total; j++) {
                    if(banco1.getNameBuffer().equals(banco1.cuentas[j].getName())) {
                        //Comparar contraseña.
                        banco1.setPinBuffer(CapturaEntrada.capturarEntero("»»»»»»» Ingresa tu pin"));
                        if(banco1.getPinBuffer() == banco1.cuentas[j].getPin()) {
                            System.out.println("\n **** Tu saldo es "+ banco1.cuentas[j].getSaldo() + " ****");
                            banco1.setIngresar(CapturaEntrada.capturarEntero("| Ingresas o retiras dinero? (1=Ingresar | 2=Retirar) » "));

                            if(banco1.getIngresar() == 1) {
                                banco1.cuentas[j].setSaldo(banco1.cuentas[j].getSaldo() + CapturaEntrada.capturarFlotante("| Ingresa el sueldo que que quieras agregar"));
                            } else {
                                //Validar que retire dinero que tiene.
                                banco1.setRetirar(CapturaEntrada.capturarFlotante("| Cuanto vas a retirar?"));
                                if(banco1.getRetirar() > banco1.cuentas[j].getSaldo()) {
                                    System.out.println(" !!! ERROR !!! \n RETIRE DINERO QUE TENGA DISPONIBLE");
                                }else {
                                    banco1.cuentas[j].setSaldo(banco1.cuentas[j].getSaldo() - banco1.getRetirar());
                                }
                            }
                        }
                    }
                }
            } else {
                break;
            }
            System.out.println("===============================================================================");
        } while (banco1.getOpcion() != 3 || i < 11);
        
    }
}
