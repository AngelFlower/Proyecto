package opciones;

import herramientas.ClearScreen;

import java.io.IOException;

public class Alta {

    ClearScreen clearScreen = new ClearScreen();

    public void altaProducto(){
        clearScreen.clear();
        secuenciaSQL();
    }

    public void altaProveedor(){
        secuenciaSQL();
    }

    private void secuenciaSQL(){

    }

}
