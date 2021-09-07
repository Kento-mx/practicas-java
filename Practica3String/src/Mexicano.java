
public class Mexicano {
    String nombre;
    String segundo_nombre;
    String apellidop;
    String apellidom;
    String CURP= "";
    String RFC= "";
    char genero;
    String dia_nacimiento;
    String mes_nacimiento;
    String year_nacimiento;
    String lugar_nacimiento;
    //j es una copia de una iteracion donde se queda la primera vocal.
    int j;
    
    //Metodo principal. Opcion sirve para seleccionar si imprimir CURP, RFC o AMBOS.
    public Mexicano(int opcion){
        setNombre(CapturaEntrada.capturarCadena("¬ Nombre"));
        System.out.println("\n**En caso que no cuente con segundo nombre, escriba \"Ninguno\".");
        setSegundo_nombre(CapturaEntrada.capturarCadena("¬ Segundo nombre"));
        setApellidop(CapturaEntrada.capturarCadena("¬ Apellido Paterno"));
        setApellidom(CapturaEntrada.capturarCadena("¬ Apellido Materno"));
        setGenero(CapturaEntrada.capturarChar("¬ Genero (H/M)"));
        System.out.println("\n**Ingresa tu fecha de nacimiento.");
        setDia_nacimiento(CapturaEntrada.capturarCadena("¬ Dia"));
        setMes_nacimiento(CapturaEntrada.capturarCadena("¬ Mes"));
        setYear_nacimiento(CapturaEntrada.capturarCadena("¬ Año"));
        System.out.println("\n******ENTIDADES********");
        System.out.println("AS = AGUASCALIENTES");
        System.out.println("BS = BAJA CALIFORNIA SUR");
        System.out.println("DF = DISTRITO FEDERAL");
        System.out.println("GT = GUANAJUATO");
        System.out.println("HG = HIDALGO");
        System.out.println("MC = MEXICO");
        System.out.println("MS = MORELOS");
        System.out.println("NL = NUEVO LEON");
        System.out.println("BC = BAJA CALIFORNIA");
        System.out.println("\n***PRONTO SE ACTUALIZA LA BASE DE DATOS XD ***\n");
        setLugar_nacimiento(CapturaEntrada.capturarCadena("¬ Lugar de nacimiento"));
        
        //Crear CURP.
        //Validacion de la letra ñ
        if(apellidop.charAt(0) == 'ñ') {
            CURP+= 'X';
        }else {
            CURP+= apellidop.charAt(0);
        }
        //Primera vocal.
        //j es una copia de i
        for(int i=0; i<apellidop.length(); i++){
            if(apellidop.charAt(i) == 'A' || apellidop.charAt(i) == 'E' || apellidop.charAt(i) == 'I' || apellidop.charAt(i) == 'O' || apellidop.charAt(i) == 'U') {
                CURP+= apellidop.charAt(i);
                j=i;
                break;
            }
        }
        //Primera letra del segundo apellido.
        CURP+= apellidom.charAt(0);
        //Primera letra del nombre
        CURP+= nombre.charAt(0);
        //Validacion de malas palabras
        if(CURP.equals("COLA") || CURP.equals("VACA")){
            for(int i=0; i<CURP.length(); i++){
                if(CURP.charAt(i) == 'A' || CURP.charAt(i) == 'E' || CURP.charAt(i) == 'I' || CURP.charAt(i) == 'O' || CURP.charAt(i) == 'U') {
                    CURP+= 'X';
                    break;
                }
            }
        }
        //Fecha de nacimiento yymmdd
        CURP+=(year_nacimiento.charAt(2) + year_nacimiento.charAt(3));
        CURP+=(mes_nacimiento.charAt(0) + mes_nacimiento.charAt(1));
        CURP+=(dia_nacimiento.charAt(0) + dia_nacimiento.charAt(1));
        //Genero validado.
        if(genero == 'M' || genero == 'H'){
            CURP+= genero;
        }
        //Entidades
        if(lugar_nacimiento.equals("AS")) CURP+= "AS";
        if(lugar_nacimiento.equals("BS")) CURP+= "BS";
        if(lugar_nacimiento.equals("DF")) CURP+= "DF"; 
        if(lugar_nacimiento.equals("GT")) CURP+= "GT";
        if(lugar_nacimiento.equals("HG")) CURP+= "HG";
        if(lugar_nacimiento.equals("MC")) CURP+= "MC";
        if(lugar_nacimiento.equals("MS")) CURP+= "MS";
        if(lugar_nacimiento.equals("NL")) CURP+= "NL";
        if(lugar_nacimiento.equals("BC")) CURP+= "BC";
        //Siguiente Consonante del primer apelldo
        for(int i=j; i<apellidop.length(); i++){
            if(apellidop.charAt(i) != 'A' || apellidop.charAt(i) != 'E' || apellidop.charAt(i) != 'I' || apellidop.charAt(i) != 'O' || apellidop.charAt(i) != 'U') {
                CURP+= apellidop.charAt(i);
                break;
            }
        }
        //Siguiente consonante del segundo apellido
        for(int i=1; i<apellidom.length(); i++){
            if(apellidom.charAt(i) != 'A' || apellidom.charAt(i) != 'E' || apellidom.charAt(i) != 'I' || apellidom.charAt(i) != 'O' || apellidom.charAt(i) != 'U') {
                CURP+= apellidom.charAt(i);
                break;
            }
        }
        //Siguiente consonante del primer nombre
        for(int i=1; i<nombre.length(); i++){
            if(nombre.charAt(i) != 'A' || nombre.charAt(i) != 'E' || nombre.charAt(i) != 'I' || nombre.charAt(i) != 'O' || nombre.charAt(i) != 'U') {
                CURP+= nombre.charAt(i);
                break;
            }
        }
        //HOMOCLAVE
        CURP+= "00";
        setCURP(CURP);
    }
    
    //Constructor.
    public Mexicano(String nombre, String segundo_nombre, String apellidop, String apellidom, String cURP, String rFC,
            char genero, String dia_nacimiento, String mes_nacimiento, String year_nacimiento, String lugar_nacimiento) {
        setNombre(nombre);
        setSegundo_nombre(segundo_nombre);
        setApellidop(apellidop);
        setApellidom(apellidom);
        setCURP(cURP);
        setRFC(rFC);
        setGenero(genero);
        setDia_nacimiento(dia_nacimiento);
        setMes_nacimiento(mes_nacimiento);
        setYear_nacimiento(year_nacimiento);
        setLugar_nacimiento(lugar_nacimiento);
    }
    //Setters y Getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSegundo_nombre() {
        return segundo_nombre;
    }
    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }
    public String getApellidop() {
        return apellidop;
    }
    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }
    public String getApellidom() {
        return apellidom;
    }
    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }
    public String getCURP() {
        return CURP;
    }
    public void setCURP(String cURP) {
        CURP = cURP;
    }
    public String getRFC() {
        return RFC;
    }
    public void setRFC(String rFC) {
        RFC = rFC;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public String getDia_nacimiento() {
        return dia_nacimiento;
    }
    public void setDia_nacimiento(String dia_nacimiento) {
        this.dia_nacimiento = dia_nacimiento;
    }
    public String getMes_nacimiento() {
        return mes_nacimiento;
    }
    public void setMes_nacimiento(String mes_nacimiento) {
        this.mes_nacimiento = mes_nacimiento;
    }
    public String getYear_nacimiento() {
        return year_nacimiento;
    }
    public void setYear_nacimiento(String year_nacimiento) {
        this.year_nacimiento = year_nacimiento;
    }
    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }
    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }
    
}
